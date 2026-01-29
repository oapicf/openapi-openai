namespace OpenAPI

open OpenAPI.Model.CreateChatCompletionRequest
open OpenAPI.Model.CreateChatCompletionResponse
open System.Collections.Generic
open System

module ChatApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type CreateChatCompletionBodyParams = CreateChatCompletionRequest
    //#endregion


    type CreateChatCompletionStatusCode200Response = {
      content:CreateChatCompletionResponse;
      
    }
    type CreateChatCompletionResult = CreateChatCompletionStatusCode200 of CreateChatCompletionStatusCode200Response

    type CreateChatCompletionArgs = {
      bodyParams:CreateChatCompletionBodyParams
    }
