namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateEmbeddingRequestInput
open OpenAPI.Model.CreateEmbeddingRequestModel

module CreateEmbeddingRequest =

  //#region CreateEmbeddingRequest

  [<CLIMutable>]
  type CreateEmbeddingRequest = {
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateEmbeddingRequestModel;
    [<JsonProperty(PropertyName = "input")>]
    Input : CreateEmbeddingRequestInput;
    [<JsonProperty(PropertyName = "user")>]
    User : string;
  }

  //#endregion
