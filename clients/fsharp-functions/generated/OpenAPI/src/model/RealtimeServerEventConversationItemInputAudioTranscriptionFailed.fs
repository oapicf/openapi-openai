namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError

module RealtimeServerEventConversationItemInputAudioTranscriptionFailed =

  //#region RealtimeServerEventConversationItemInputAudioTranscriptionFailed

  [<CLIMutable>]
  type RealtimeServerEventConversationItemInputAudioTranscriptionFailed = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "content_index")>]
    ContentIndex : int;
    [<JsonProperty(PropertyName = "error")>]
    Error : RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;
  }

  //#endregion
