namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BatchRequestOutputError =

  //#region BatchRequestOutputError

  [<CLIMutable>]
  type BatchRequestOutputError = {
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
