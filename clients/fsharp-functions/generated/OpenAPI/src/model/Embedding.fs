namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Embedding =

  //#region Embedding

  [<CLIMutable>]
  type Embedding = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "embedding")>]
    _Embedding : decimal[];
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
