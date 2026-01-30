namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module VectorStoreFileObjectLastError =

  //#region VectorStoreFileObjectLastError

  [<CLIMutable>]
  type VectorStoreFileObjectLastError = {
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
