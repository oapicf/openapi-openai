namespace OpenAPI

open OpenAPI.Model.CreateEmbeddingRequest
open OpenAPI.Model.CreateEmbeddingResponse
open System.Collections.Generic
open System

module EmbeddingsApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type CreateEmbeddingBodyParams = CreateEmbeddingRequest
    //#endregion


    type CreateEmbeddingStatusCode200Response = {
      content:CreateEmbeddingResponse;
      
    }
    type CreateEmbeddingResult = CreateEmbeddingStatusCode200 of CreateEmbeddingStatusCode200Response

    type CreateEmbeddingArgs = {
      bodyParams:CreateEmbeddingBodyParams
    }
