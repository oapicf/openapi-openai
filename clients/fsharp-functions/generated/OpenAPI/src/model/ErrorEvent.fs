namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Error

module ErrorEvent =

  //#region ErrorEvent

  [<CLIMutable>]
  type ErrorEvent = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : Error;
  }

  //#endregion
