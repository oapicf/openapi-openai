namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventInputAudioBufferSpeechStarted =

  //#region RealtimeServerEventInputAudioBufferSpeechStarted

  [<CLIMutable>]
  type RealtimeServerEventInputAudioBufferSpeechStarted = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "audio_start_ms")>]
    AudioStartMs : int;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
  }

  //#endregion
