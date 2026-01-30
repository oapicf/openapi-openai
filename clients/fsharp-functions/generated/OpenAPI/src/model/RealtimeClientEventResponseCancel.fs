namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeClientEventResponseCancel =

  //#region RealtimeClientEventResponseCancel

  [<CLIMutable>]
  type RealtimeClientEventResponseCancel = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "response_id")>]
    ResponseId : string;
  }

  //#endregion
