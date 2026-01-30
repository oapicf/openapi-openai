namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeClientEventConversationItemTruncate =

  //#region RealtimeClientEventConversationItemTruncate

  [<CLIMutable>]
  type RealtimeClientEventConversationItemTruncate = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "content_index")>]
    ContentIndex : int;
    [<JsonProperty(PropertyName = "audio_end_ms")>]
    AudioEndMs : int;
  }

  //#endregion
