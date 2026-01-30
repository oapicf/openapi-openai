namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventResponseContentPartDonePart =

  //#region RealtimeServerEventResponseContentPartDonePart

  [<CLIMutable>]
  type RealtimeServerEventResponseContentPartDonePart = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "audio")>]
    Audio : string;
    [<JsonProperty(PropertyName = "transcript")>]
    Transcript : string;
  }

  //#endregion
