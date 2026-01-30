namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventInputAudioBufferCommitted =

  //#region RealtimeServerEventInputAudioBufferCommitted

  [<CLIMutable>]
  type RealtimeServerEventInputAudioBufferCommitted = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "previous_item_id")>]
    PreviousItemId : string;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
  }

  //#endregion
