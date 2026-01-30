namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeResponse

module RealtimeServerEventResponseCreated =

  //#region RealtimeServerEventResponseCreated

  [<CLIMutable>]
  type RealtimeServerEventResponseCreated = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "response")>]
    Response : RealtimeResponse;
  }

  //#endregion
