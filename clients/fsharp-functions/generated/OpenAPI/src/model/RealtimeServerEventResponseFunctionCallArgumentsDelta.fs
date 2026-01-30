namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventResponseFunctionCallArgumentsDelta =

  //#region RealtimeServerEventResponseFunctionCallArgumentsDelta

  [<CLIMutable>]
  type RealtimeServerEventResponseFunctionCallArgumentsDelta = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "response_id")>]
    ResponseId : string;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "output_index")>]
    OutputIndex : int;
    [<JsonProperty(PropertyName = "call_id")>]
    CallId : string;
    [<JsonProperty(PropertyName = "delta")>]
    Delta : string;
  }

  //#endregion
