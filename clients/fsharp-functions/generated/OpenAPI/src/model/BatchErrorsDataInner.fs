namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module BatchErrorsDataInner =

  //#region BatchErrorsDataInner

  [<CLIMutable>]
  type BatchErrorsDataInner = {
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "param")>]
    Param : string option;
    [<JsonProperty(PropertyName = "line")>]
    Line : int option;
  }

  //#endregion
