namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module VectorStoreExpirationAfter =

  //#region VectorStoreExpirationAfter

  [<CLIMutable>]
  type VectorStoreExpirationAfter = {
    [<JsonProperty(PropertyName = "anchor")>]
    Anchor : string;
    [<JsonProperty(PropertyName = "days")>]
    Days : int;
  }

  //#endregion
