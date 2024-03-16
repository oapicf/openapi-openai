namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateEmbeddingResponseDataInner
open OpenAPI.Model.CreateEmbeddingResponseUsage

module CreateEmbeddingResponse =

  //#region CreateEmbeddingResponse

  [<CLIMutable>]
  type CreateEmbeddingResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : CreateEmbeddingResponseDataInner[];
    [<JsonProperty(PropertyName = "usage")>]
    Usage : CreateEmbeddingResponseUsage;
  }

  //#endregion
