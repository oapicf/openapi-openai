namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open UsageApiHandlerParams
open UsageApiServiceInterface
open UsageApiServiceImplementation
open OpenAPI.Model.UsageResponse

module UsageApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region UsageAudioSpeeches
    /// <summary>
    /// Get audio speeches usage details for the organization.
    /// </summary>

    let UsageAudioSpeeches  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UsageAudioSpeechesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UsageAudioSpeechesArgs
          let result = UsageApiService.UsageAudioSpeeches ctx serviceArgs
          return! (match result with
                      | UsageAudioSpeechesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UsageAudioTranscriptions
    /// <summary>
    /// Get audio transcriptions usage details for the organization.
    /// </summary>

    let UsageAudioTranscriptions  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UsageAudioTranscriptionsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UsageAudioTranscriptionsArgs
          let result = UsageApiService.UsageAudioTranscriptions ctx serviceArgs
          return! (match result with
                      | UsageAudioTranscriptionsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UsageCodeInterpreterSessions
    /// <summary>
    /// Get code interpreter sessions usage details for the organization.
    /// </summary>

    let UsageCodeInterpreterSessions  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UsageCodeInterpreterSessionsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UsageCodeInterpreterSessionsArgs
          let result = UsageApiService.UsageCodeInterpreterSessions ctx serviceArgs
          return! (match result with
                      | UsageCodeInterpreterSessionsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UsageCompletions
    /// <summary>
    /// Get completions usage details for the organization.
    /// </summary>

    let UsageCompletions  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UsageCompletionsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UsageCompletionsArgs
          let result = UsageApiService.UsageCompletions ctx serviceArgs
          return! (match result with
                      | UsageCompletionsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UsageCosts
    /// <summary>
    /// Get costs details for the organization.
    /// </summary>

    let UsageCosts  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UsageCostsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UsageCostsArgs
          let result = UsageApiService.UsageCosts ctx serviceArgs
          return! (match result with
                      | UsageCostsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UsageEmbeddings
    /// <summary>
    /// Get embeddings usage details for the organization.
    /// </summary>

    let UsageEmbeddings  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UsageEmbeddingsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UsageEmbeddingsArgs
          let result = UsageApiService.UsageEmbeddings ctx serviceArgs
          return! (match result with
                      | UsageEmbeddingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UsageImages
    /// <summary>
    /// Get images usage details for the organization.
    /// </summary>

    let UsageImages  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UsageImagesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UsageImagesArgs
          let result = UsageApiService.UsageImages ctx serviceArgs
          return! (match result with
                      | UsageImagesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UsageModerations
    /// <summary>
    /// Get moderations usage details for the organization.
    /// </summary>

    let UsageModerations  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UsageModerationsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UsageModerationsArgs
          let result = UsageApiService.UsageModerations ctx serviceArgs
          return! (match result with
                      | UsageModerationsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UsageVectorStores
    /// <summary>
    /// Get vector stores usage details for the organization.
    /// </summary>

    let UsageVectorStores  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UsageVectorStoresQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UsageVectorStoresArgs
          let result = UsageApiService.UsageVectorStores ctx serviceArgs
          return! (match result with
                      | UsageVectorStoresStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

