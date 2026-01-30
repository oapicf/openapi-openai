namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeSessionCreateResponseTurnDetection =

  //#region RealtimeSessionCreateResponseTurnDetection

  [<CLIMutable>]
  type RealtimeSessionCreateResponseTurnDetection = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "threshold")>]
    Threshold : decimal;
    [<JsonProperty(PropertyName = "prefix_padding_ms")>]
    PrefixPaddingMs : int;
    [<JsonProperty(PropertyName = "silence_duration_ms")>]
    SilenceDurationMs : int;
  }

  //#endregion
