namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CompletionsApiHandlerParams
open CompletionsApiServiceInterface
open CompletionsApiServiceImplementation
open OpenAPI.Model.CreateCompletionRequest
open OpenAPI.Model.CreateCompletionResponse

module CompletionsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateCompletion
    /// <summary>
    /// Creates a completion for the provided prompt and parameters.
    /// </summary>

    let CreateCompletion  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateCompletionBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateCompletionArgs
          let result = CompletionsApiService.CreateCompletion ctx serviceArgs
          return! (match result with
                      | CreateCompletionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

