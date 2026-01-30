namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeClientEventInputAudioBufferClear =

  //#region RealtimeClientEventInputAudioBufferClear

  [<CLIMutable>]
  type RealtimeClientEventInputAudioBufferClear = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
