namespace OpenAPI

open OpenAPI.Model.CreateModerationRequest
open OpenAPI.Model.CreateModerationResponse
open System.Collections.Generic
open System

module ModerationsApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type CreateModerationBodyParams = CreateModerationRequest
    //#endregion


    type CreateModerationStatusCode200Response = {
      content:CreateModerationResponse;
      
    }
    type CreateModerationResult = CreateModerationStatusCode200 of CreateModerationStatusCode200Response

    type CreateModerationArgs = {
      bodyParams:CreateModerationBodyParams
    }
