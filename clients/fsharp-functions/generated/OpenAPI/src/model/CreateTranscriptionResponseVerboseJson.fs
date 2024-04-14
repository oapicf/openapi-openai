namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TranscriptionSegment
open OpenAPI.Model.TranscriptionWord

module CreateTranscriptionResponseVerboseJson =

  //#region CreateTranscriptionResponseVerboseJson

  [<CLIMutable>]
  type CreateTranscriptionResponseVerboseJson = {
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
    [<JsonProperty(PropertyName = "duration")>]
    Duration : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "words")>]
    Words : TranscriptionWord[];
    [<JsonProperty(PropertyName = "segments")>]
    Segments : TranscriptionSegment[];
  }

  //#endregion
