namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventInputAudioBufferCleared =

  //#region RealtimeServerEventInputAudioBufferCleared

  [<CLIMutable>]
  type RealtimeServerEventInputAudioBufferCleared = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
