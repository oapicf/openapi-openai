namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeConversationItem

module RealtimeServerEventConversationItemCreated =

  //#region RealtimeServerEventConversationItemCreated

  [<CLIMutable>]
  type RealtimeServerEventConversationItemCreated = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "previous_item_id")>]
    PreviousItemId : string;
    [<JsonProperty(PropertyName = "item")>]
    Item : RealtimeConversationItem;
  }

  //#endregion
