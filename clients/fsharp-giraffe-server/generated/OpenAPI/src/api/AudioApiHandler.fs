namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AudioApiHandlerParams
open AudioApiServiceInterface
open AudioApiServiceImplementation
open OpenAPI.Model.AudioResponseFormat
open OpenAPI.Model.CreateSpeechRequest
open OpenAPI.Model.CreateTranscription200Response
open OpenAPI.Model.CreateTranscriptionRequestModel
open OpenAPI.Model.CreateTranslation200Response

module AudioApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateSpeech
    /// <summary>
    /// Generates audio from the input text.
    /// </summary>

    let CreateSpeech  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateSpeechBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateSpeechArgs
          let result = AudioApiService.CreateSpeech ctx serviceArgs
          return! (match result with
                      | CreateSpeechStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateTranscription
    /// <summary>
    /// Transcribes audio into the input language.
    /// </summary>

    let CreateTranscription  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<CreateTranscriptionFormParams>()
          let serviceArgs = {   formParams=formParams;   } : CreateTranscriptionArgs
          let result = AudioApiService.CreateTranscription ctx serviceArgs
          return! (match result with
                      | CreateTranscriptionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateTranslation
    /// <summary>
    /// Translates audio into English.
    /// </summary>

    let CreateTranslation  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<CreateTranslationFormParams>()
          let serviceArgs = {   formParams=formParams;   } : CreateTranslationArgs
          let result = AudioApiService.CreateTranslation ctx serviceArgs
          return! (match result with
                      | CreateTranslationStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

