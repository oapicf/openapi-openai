namespace OpenAPI

open OpenAPI.Model.RealtimeSessionCreateRequest
open OpenAPI.Model.RealtimeSessionCreateResponse
open System.Collections.Generic
open System

module RealtimeApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type CreateRealtimeSessionBodyParams = RealtimeSessionCreateRequest
    //#endregion


    type CreateRealtimeSessionStatusCode200Response = {
      content:RealtimeSessionCreateResponse;
      
    }
    type CreateRealtimeSessionResult = CreateRealtimeSessionStatusCode200 of CreateRealtimeSessionStatusCode200Response

    type CreateRealtimeSessionArgs = {
      bodyParams:CreateRealtimeSessionBodyParams
    }
