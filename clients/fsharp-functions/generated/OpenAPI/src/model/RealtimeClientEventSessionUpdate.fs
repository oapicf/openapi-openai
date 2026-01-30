namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeSessionCreateRequest

module RealtimeClientEventSessionUpdate =

  //#region RealtimeClientEventSessionUpdate

  [<CLIMutable>]
  type RealtimeClientEventSessionUpdate = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "session")>]
    Session : RealtimeSessionCreateRequest;
  }

  //#endregion
