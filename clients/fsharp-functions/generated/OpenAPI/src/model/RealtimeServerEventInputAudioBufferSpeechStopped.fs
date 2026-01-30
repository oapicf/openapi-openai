namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventInputAudioBufferSpeechStopped =

  //#region RealtimeServerEventInputAudioBufferSpeechStopped

  [<CLIMutable>]
  type RealtimeServerEventInputAudioBufferSpeechStopped = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "audio_end_ms")>]
    AudioEndMs : int;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
  }

  //#endregion
