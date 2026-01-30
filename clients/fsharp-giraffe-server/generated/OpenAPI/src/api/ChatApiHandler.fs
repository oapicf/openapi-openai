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
    /// Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
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

