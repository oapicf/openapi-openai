namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DoneEvent =

  //#region DoneEvent

  [<CLIMutable>]
  type DoneEvent = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
  }

  //#endregion
