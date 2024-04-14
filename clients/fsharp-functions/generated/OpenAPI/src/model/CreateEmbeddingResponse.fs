namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateEmbeddingResponseUsage
open OpenAPI.Model.Embedding

module CreateEmbeddingResponse =

  //#region CreateEmbeddingResponse

  [<CLIMutable>]
  type CreateEmbeddingResponse = {
    [<JsonProperty(PropertyName = "data")>]
    Data : Embedding[];
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "usage")>]
    Usage : CreateEmbeddingResponseUsage;
  }

  //#endregion
