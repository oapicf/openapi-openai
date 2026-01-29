namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ChatApiHandlerParams
open ChatApiServiceInterface
open ChatApiServiceImplementation
open OpenAPI.Model.CreateChatCompletionRequest
open OpenAPI.Model.CreateChatCompletionResponse

module ChatApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateChatCompletion
    /// <summary>
    /// Creates a model response for the given chat conversation.
    /// </summary>

    let CreateChatCompletion  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateChatCompletionBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateChatCompletionArgs
          let result = ChatApiService.CreateChatCompletion ctx serviceArgs
          return! (match result with
                      | CreateChatCompletionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

