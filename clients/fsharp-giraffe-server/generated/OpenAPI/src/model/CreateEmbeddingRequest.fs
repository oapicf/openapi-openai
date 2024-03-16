namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateEmbeddingRequestInput
open OpenAPI.Model.CreateEmbeddingRequestModel

module CreateEmbeddingRequest =

  //#region CreateEmbeddingRequest


  type CreateEmbeddingRequest = {
    Model : CreateEmbeddingRequestModel;
    Input : CreateEmbeddingRequestInput;
    User : string;
  }
  //#endregion
