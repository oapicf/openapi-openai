namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeClientEventInputAudioBufferCommit =

  //#region RealtimeClientEventInputAudioBufferCommit

  [<CLIMutable>]
  type RealtimeClientEventInputAudioBufferCommit = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
