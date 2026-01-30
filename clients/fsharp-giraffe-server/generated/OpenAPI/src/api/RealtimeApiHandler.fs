namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open RealtimeApiHandlerParams
open RealtimeApiServiceInterface
open RealtimeApiServiceImplementation
open OpenAPI.Model.RealtimeSessionCreateRequest
open OpenAPI.Model.RealtimeSessionCreateResponse

module RealtimeApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateRealtimeSession
    /// <summary>
    /// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
    /// </summary>

    let CreateRealtimeSession  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateRealtimeSessionBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateRealtimeSessionArgs
          let result = RealtimeApiService.CreateRealtimeSession ctx serviceArgs
          return! (match result with
                      | CreateRealtimeSessionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

