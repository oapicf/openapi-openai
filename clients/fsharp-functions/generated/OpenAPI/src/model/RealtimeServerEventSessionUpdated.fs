namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeSession

module RealtimeServerEventSessionUpdated =

  //#region RealtimeServerEventSessionUpdated

  [<CLIMutable>]
  type RealtimeServerEventSessionUpdated = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "session")>]
    Session : RealtimeSession;
  }

  //#endregion
