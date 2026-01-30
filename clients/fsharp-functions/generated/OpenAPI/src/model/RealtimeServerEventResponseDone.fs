namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeResponse

module RealtimeServerEventResponseDone =

  //#region RealtimeServerEventResponseDone

  [<CLIMutable>]
  type RealtimeServerEventResponseDone = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "response")>]
    Response : RealtimeResponse;
  }

  //#endregion
