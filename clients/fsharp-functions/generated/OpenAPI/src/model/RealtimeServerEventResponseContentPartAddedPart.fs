namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventResponseContentPartAddedPart =

  //#region RealtimeServerEventResponseContentPartAddedPart

  [<CLIMutable>]
  type RealtimeServerEventResponseContentPartAddedPart = {
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
