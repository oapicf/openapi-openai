namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeServerEventErrorError

module RealtimeServerEventError =

  //#region RealtimeServerEventError

  [<CLIMutable>]
  type RealtimeServerEventError = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "error")>]
    Error : RealtimeServerEventErrorError;
  }

  //#endregion
