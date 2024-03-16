namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module Error =

  //#region Error

  [<CLIMutable>]
  type Error = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "param")>]
    Param : string option;
    [<JsonProperty(PropertyName = "code")>]
    Code : string option;
  }

  //#endregion
