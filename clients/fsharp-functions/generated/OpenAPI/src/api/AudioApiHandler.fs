namespace OpenAPI

open AudioApiHandlerParams
open AudioApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module AudioApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateSpeech
    /// <summary>
    /// Generates audio from the input text.
    /// </summary>
   [<FunctionName("CreateSpeech")>]
    let CreateSpeech
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/audio/speech")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateSpeechBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AudioApiService.CreateSpeech bodyParams
      match result with
      | CreateSpeechStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateTranscription
    /// <summary>
    /// Transcribes audio into the input language.
    /// </summary>
   [<FunctionName("CreateTranscription")>]
    let CreateTranscription
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/audio/transcriptions")>]
        req:HttpRequest ) =

      let result = AudioApiService.CreateTranscription ()
      match result with
      | CreateTranscriptionStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateTranslation
    /// <summary>
    /// Translates audio into English.
    /// </summary>
   [<FunctionName("CreateTranslation")>]
    let CreateTranslation
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/audio/translations")>]
        req:HttpRequest ) =

      let result = AudioApiService.CreateTranslation ()
      match result with
      | CreateTranslationStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

