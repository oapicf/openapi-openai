namespace OpenAPI

open OpenAPI.Model.CreateCompletionRequest
open OpenAPI.Model.CreateCompletionResponse
open System.Collections.Generic
open System

module CompletionsApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type CreateCompletionBodyParams = CreateCompletionRequest
    //#endregion


    type CreateCompletionStatusCode200Response = {
      content:CreateCompletionResponse;
      
    }
    type CreateCompletionResult = CreateCompletionStatusCode200 of CreateCompletionStatusCode200Response

    type CreateCompletionArgs = {
      bodyParams:CreateCompletionBodyParams
    }
