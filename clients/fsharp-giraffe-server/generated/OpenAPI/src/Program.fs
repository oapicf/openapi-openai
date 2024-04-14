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

open AssistantsApiHandlerParams
open AudioApiHandlerParams
open ChatApiHandlerParams
open CompletionsApiHandlerParams
open EmbeddingsApiHandlerParams
open FilesApiHandlerParams
open FineTuningApiHandlerParams
open ImagesApiHandlerParams
open ModelsApiHandlerParams
open ModerationsApiHandlerParams
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
      HttpPost >=> routeBind<CancelRunPathParams> "/v1/threads/{thread_id}/runs/{run_id}/cancel"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.CancelRun x) x);
      HttpPost >=> route "/v1/assistants" >=>  >=>  AssistantsApiHandler.CreateAssistant;
      HttpPost >=> routeBind<CreateAssistantFilePathParams> "/v1/assistants/{assistant_id}/files"  (fun x ->  >=>  AssistantsApiHandler.CreateAssistantFile x);
      HttpPost >=> routeBind<CreateMessagePathParams> "/v1/threads/{thread_id}/messages"  (fun x ->  >=>  AssistantsApiHandler.CreateMessage x);
      HttpPost >=> routeBind<CreateRunPathParams> "/v1/threads/{thread_id}/runs"  (fun x ->  >=>  AssistantsApiHandler.CreateRun x);
      HttpPost >=> route "/v1/threads" >=>  >=>  AssistantsApiHandler.CreateThread;
      HttpPost >=> route "/v1/threads/runs" >=>  >=>  AssistantsApiHandler.CreateThreadAndRun;
      HttpDelete >=> routeBind<DeleteAssistantPathParams> "/v1/assistants/{assistant_id}"  (fun x ->  >=>  AssistantsApiHandler.DeleteAssistant x);
      HttpDelete >=> routeBind<DeleteAssistantFilePathParams> "/v1/assistants/{assistant_id}/files/{file_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.DeleteAssistantFile x) x);
      HttpDelete >=> routeBind<DeleteThreadPathParams> "/v1/threads/{thread_id}"  (fun x ->  >=>  AssistantsApiHandler.DeleteThread x);
      HttpGet >=> routeBind<GetAssistantPathParams> "/v1/assistants/{assistant_id}"  (fun x ->  >=>  AssistantsApiHandler.GetAssistant x);
      HttpGet >=> routeBind<GetAssistantFilePathParams> "/v1/assistants/{assistant_id}/files/{file_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.GetAssistantFile x) x);
      HttpGet >=> routeBind<GetMessagePathParams> "/v1/threads/{thread_id}/messages/{message_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.GetMessage x) x);
      HttpGet >=> routeBind<GetMessageFilePathParams> "/v1/threads/{thread_id}/messages/{message_id}/files/{file_id}"  (fun x -> (fun x -> (fun x ->  >=>  AssistantsApiHandler.GetMessageFile x) x) x);
      HttpGet >=> routeBind<GetRunPathParams> "/v1/threads/{thread_id}/runs/{run_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.GetRun x) x);
      HttpGet >=> routeBind<GetRunStepPathParams> "/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}"  (fun x -> (fun x -> (fun x ->  >=>  AssistantsApiHandler.GetRunStep x) x) x);
      HttpGet >=> routeBind<GetThreadPathParams> "/v1/threads/{thread_id}"  (fun x ->  >=>  AssistantsApiHandler.GetThread x);
      HttpGet >=> routeBind<ListAssistantFilesPathParams> "/v1/assistants/{assistant_id}/files"  (fun x ->  >=>  AssistantsApiHandler.ListAssistantFiles x);
      HttpGet >=> route "/v1/assistants" >=>  >=>  AssistantsApiHandler.ListAssistants;
      HttpGet >=> routeBind<ListMessageFilesPathParams> "/v1/threads/{thread_id}/messages/{message_id}/files"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.ListMessageFiles x) x);
      HttpGet >=> routeBind<ListMessagesPathParams> "/v1/threads/{thread_id}/messages"  (fun x ->  >=>  AssistantsApiHandler.ListMessages x);
      HttpGet >=> routeBind<ListRunStepsPathParams> "/v1/threads/{thread_id}/runs/{run_id}/steps"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.ListRunSteps x) x);
      HttpGet >=> routeBind<ListRunsPathParams> "/v1/threads/{thread_id}/runs"  (fun x ->  >=>  AssistantsApiHandler.ListRuns x);
      HttpPost >=> routeBind<ModifyAssistantPathParams> "/v1/assistants/{assistant_id}"  (fun x ->  >=>  AssistantsApiHandler.ModifyAssistant x);
      HttpPost >=> routeBind<ModifyMessagePathParams> "/v1/threads/{thread_id}/messages/{message_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.ModifyMessage x) x);
      HttpPost >=> routeBind<ModifyRunPathParams> "/v1/threads/{thread_id}/runs/{run_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.ModifyRun x) x);
      HttpPost >=> routeBind<ModifyThreadPathParams> "/v1/threads/{thread_id}"  (fun x ->  >=>  AssistantsApiHandler.ModifyThread x);
      HttpPost >=> routeBind<SubmitToolOuputsToRunPathParams> "/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.SubmitToolOuputsToRun x) x);
      HttpPost >=> route "/v1/audio/speech" >=>  >=>  AudioApiHandler.CreateSpeech;
      HttpPost >=> route "/v1/audio/transcriptions" >=>  >=>  AudioApiHandler.CreateTranscription;
      HttpPost >=> route "/v1/audio/translations" >=>  >=>  AudioApiHandler.CreateTranslation;
      HttpPost >=> route "/v1/chat/completions" >=>  >=>  ChatApiHandler.CreateChatCompletion;
      HttpPost >=> route "/v1/completions" >=>  >=>  CompletionsApiHandler.CreateCompletion;
      HttpPost >=> route "/v1/embeddings" >=>  >=>  EmbeddingsApiHandler.CreateEmbedding;
      HttpPost >=> route "/v1/files" >=>  >=>  FilesApiHandler.CreateFile;
      HttpDelete >=> routeBind<DeleteFilePathParams> "/v1/files/{file_id}"  (fun x ->  >=>  FilesApiHandler.DeleteFile x);
      HttpGet >=> routeBind<DownloadFilePathParams> "/v1/files/{file_id}/content"  (fun x ->  >=>  FilesApiHandler.DownloadFile x);
      HttpGet >=> route "/v1/files" >=>  >=>  FilesApiHandler.ListFiles;
      HttpGet >=> routeBind<RetrieveFilePathParams> "/v1/files/{file_id}"  (fun x ->  >=>  FilesApiHandler.RetrieveFile x);
      HttpPost >=> routeBind<CancelFineTuningJobPathParams> "/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel"  (fun x ->  >=>  FineTuningApiHandler.CancelFineTuningJob x);
      HttpPost >=> route "/v1/fine_tuning/jobs" >=>  >=>  FineTuningApiHandler.CreateFineTuningJob;
      HttpGet >=> routeBind<ListFineTuningEventsPathParams> "/v1/fine_tuning/jobs/{fine_tuning_job_id}/events"  (fun x ->  >=>  FineTuningApiHandler.ListFineTuningEvents x);
      HttpGet >=> routeBind<ListFineTuningJobCheckpointsPathParams> "/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints"  (fun x ->  >=>  FineTuningApiHandler.ListFineTuningJobCheckpoints x);
      HttpGet >=> route "/v1/fine_tuning/jobs" >=>  >=>  FineTuningApiHandler.ListPaginatedFineTuningJobs;
      HttpGet >=> routeBind<RetrieveFineTuningJobPathParams> "/v1/fine_tuning/jobs/{fine_tuning_job_id}"  (fun x ->  >=>  FineTuningApiHandler.RetrieveFineTuningJob x);
      HttpPost >=> route "/v1/images/generations" >=>  >=>  ImagesApiHandler.CreateImage;
      HttpPost >=> route "/v1/images/edits" >=>  >=>  ImagesApiHandler.CreateImageEdit;
      HttpPost >=> route "/v1/images/variations" >=>  >=>  ImagesApiHandler.CreateImageVariation;
      HttpDelete >=> routeBind<DeleteModelPathParams> "/v1/models/{model}"  (fun x ->  >=>  ModelsApiHandler.DeleteModel x);
      HttpGet >=> route "/v1/models" >=>  >=>  ModelsApiHandler.ListModels;
      HttpGet >=> routeBind<RetrieveModelPathParams> "/v1/models/{model}"  (fun x ->  >=>  ModelsApiHandler.RetrieveModel x);
      HttpPost >=> route "/v1/moderations" >=>  >=>  ModerationsApiHandler.CreateModeration;
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