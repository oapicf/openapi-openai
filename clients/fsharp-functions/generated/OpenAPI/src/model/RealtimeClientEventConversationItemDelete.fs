namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeClientEventConversationItemDelete =

  //#region RealtimeClientEventConversationItemDelete

  [<CLIMutable>]
  type RealtimeClientEventConversationItemDelete = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
  }

  //#endregion
