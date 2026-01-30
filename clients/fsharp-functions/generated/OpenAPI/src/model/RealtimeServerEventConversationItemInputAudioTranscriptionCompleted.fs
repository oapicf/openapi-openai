namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventConversationItemInputAudioTranscriptionCompleted =

  //#region RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

  [<CLIMutable>]
  type RealtimeServerEventConversationItemInputAudioTranscriptionCompleted = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "content_index")>]
    ContentIndex : int;
    [<JsonProperty(PropertyName = "transcript")>]
    Transcript : string;
  }

  //#endregion
