namespace OpenAPI

open System
open System.Net.Http
open System.Security.Claims
open System.Threading
open Microsoft.AspNetCore
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.Http
open Microsoft.AspNetCore.Http.Features
open Microsoft.AspNetCore.Authentication
open Microsoft.AspNetCore.Authentication.Cookies
open Microsoft.Extensions.Configuration
open Microsoft.Extensions.Logging
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open System.Diagnostics
open Giraffe.GiraffeViewEngine
open AspNet.Security.ApiKey.Providers

open OpenAIApiHandlerParams
open Giraffe

module App =

  // ---------------------------------
  // Error handler
  // ---------------------------------

  let errorHandler (ex : Exception) (logger : ILogger) =
    logger.LogError(EventId(), ex, "An unhandled exception has occurred while executing the request.")
    clearResponse >=> setStatusCode 500 >=> text ex.Message

  // ---------------------------------
  // Web app
  // ---------------------------------

  let HttpGet = GET
  let HttpPost = POST
  let HttpPut = PUT
  let HttpDelete = DELETE

  let authFailure : HttpHandler =
    setStatusCode 401 >=> text "You must be authenticated to access this resource."

  let webApp =
    choose (CustomHandlers.handlers @ [
      HttpPost >=> routeBind<CancelFineTunePathParams> "/v1/fine-tunes/{fine_tune_id}/cancel"  (fun x ->  OpenAIApiHandler.CancelFineTune x);
      HttpPost >=> route "/v1/chat/completions" >=>  OpenAIApiHandler.CreateChatCompletion;
      HttpPost >=> route "/v1/completions" >=>  OpenAIApiHandler.CreateCompletion;
      HttpPost >=> route "/v1/edits" >=>  OpenAIApiHandler.CreateEdit;
      HttpPost >=> route "/v1/embeddings" >=>  OpenAIApiHandler.CreateEmbedding;
      HttpPost >=> route "/v1/files" >=>  OpenAIApiHandler.CreateFile;
      HttpPost >=> route "/v1/fine-tunes" >=>  OpenAIApiHandler.CreateFineTune;
      HttpPost >=> route "/v1/images/generations" >=>  OpenAIApiHandler.CreateImage;
      HttpPost >=> route "/v1/images/edits" >=>  OpenAIApiHandler.CreateImageEdit;
      HttpPost >=> route "/v1/images/variations" >=>  OpenAIApiHandler.CreateImageVariation;
      HttpPost >=> route "/v1/moderations" >=>  OpenAIApiHandler.CreateModeration;
      HttpPost >=> route "/v1/audio/transcriptions" >=>  OpenAIApiHandler.CreateTranscription;
      HttpPost >=> route "/v1/audio/translations" >=>  OpenAIApiHandler.CreateTranslation;
      HttpDelete >=> routeBind<DeleteFilePathParams> "/v1/files/{file_id}"  (fun x ->  OpenAIApiHandler.DeleteFile x);
      HttpDelete >=> routeBind<DeleteModelPathParams> "/v1/models/{model}"  (fun x ->  OpenAIApiHandler.DeleteModel x);
      HttpGet >=> routeBind<DownloadFilePathParams> "/v1/files/{file_id}/content"  (fun x ->  OpenAIApiHandler.DownloadFile x);
      HttpGet >=> route "/v1/files" >=>  OpenAIApiHandler.ListFiles;
      HttpGet >=> routeBind<ListFineTuneEventsPathParams> "/v1/fine-tunes/{fine_tune_id}/events"  (fun x ->  OpenAIApiHandler.ListFineTuneEvents x);
      HttpGet >=> route "/v1/fine-tunes" >=>  OpenAIApiHandler.ListFineTunes;
      HttpGet >=> route "/v1/models" >=>  OpenAIApiHandler.ListModels;
      HttpGet >=> routeBind<RetrieveFilePathParams> "/v1/files/{file_id}"  (fun x ->  OpenAIApiHandler.RetrieveFile x);
      HttpGet >=> routeBind<RetrieveFineTunePathParams> "/v1/fine-tunes/{fine_tune_id}"  (fun x ->  OpenAIApiHandler.RetrieveFineTune x);
      HttpGet >=> routeBind<RetrieveModelPathParams> "/v1/models/{model}"  (fun x ->  OpenAIApiHandler.RetrieveModel x);
      RequestErrors.notFound (text "Not Found")
    ])
  // ---------------------------------
  // Main
  // ---------------------------------

  let configureApp (app : IApplicationBuilder) =
    app.UseGiraffeErrorHandler(errorHandler)
      .UseStaticFiles()
      .UseAuthentication()
      .UseResponseCaching() |> ignore
    CustomHandlers.configureApp app |> ignore
    app.UseGiraffe webApp |> ignore


  let configureServices (services : IServiceCollection) =
    services
          .AddResponseCaching()
          .AddGiraffe()
          |> AuthSchemes.configureServices
          |> CustomHandlers.configureServices services
          |> ignore
    services.AddDataProtection() |> ignore

  let configureLogging (loggerBuilder : ILoggingBuilder) =
    loggerBuilder.AddFilter(fun lvl -> lvl.Equals LogLevel.Error)
                  .AddConsole()
                  .AddDebug() |> ignore

  [<EntryPoint>]
  let main _ =
    let builder = WebHost.CreateDefaultBuilder()
                    .Configure(Action<IApplicationBuilder> configureApp)
                    .ConfigureServices(configureServices)
                    .ConfigureLogging(configureLogging)
                    |> CustomHandlers.configureWebHost
    builder.Build()
            .Run()
    0