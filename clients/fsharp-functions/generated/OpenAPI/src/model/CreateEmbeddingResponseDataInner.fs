namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateEmbeddingResponseDataInner =

  //#region CreateEmbeddingResponseDataInner

  [<CLIMutable>]
  type CreateEmbeddingResponseDataInner = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "embedding")>]
    Embedding : decimal[];
  }

  //#endregion
