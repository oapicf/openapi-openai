namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module RealtimeServerEventErrorError =

  //#region RealtimeServerEventErrorError

  [<CLIMutable>]
  type RealtimeServerEventErrorError = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "code")>]
    Code : string option;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "param")>]
    Param : string option;
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string option;
  }

  //#endregion
