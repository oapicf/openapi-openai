namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeConversationItem

module RealtimeServerEventResponseOutputItemDone =

  //#region RealtimeServerEventResponseOutputItemDone

  [<CLIMutable>]
  type RealtimeServerEventResponseOutputItemDone = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "response_id")>]
    ResponseId : string;
    [<JsonProperty(PropertyName = "output_index")>]
    OutputIndex : int;
    [<JsonProperty(PropertyName = "item")>]
    Item : RealtimeConversationItem;
  }

  //#endregion
