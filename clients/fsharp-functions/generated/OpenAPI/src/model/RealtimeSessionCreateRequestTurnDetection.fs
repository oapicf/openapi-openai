namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeSessionCreateRequestTurnDetection =

  //#region RealtimeSessionCreateRequestTurnDetection

  [<CLIMutable>]
  type RealtimeSessionCreateRequestTurnDetection = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "threshold")>]
    Threshold : decimal;
    [<JsonProperty(PropertyName = "prefix_padding_ms")>]
    PrefixPaddingMs : int;
    [<JsonProperty(PropertyName = "silence_duration_ms")>]
    SilenceDurationMs : int;
    [<JsonProperty(PropertyName = "create_response")>]
    CreateResponse : bool;
  }

  //#endregion
