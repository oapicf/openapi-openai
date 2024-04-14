namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateTranscriptionResponseJson
open OpenAPI.Model.CreateTranscriptionResponseVerboseJson
open OpenAPI.Model.TranscriptionSegment
open OpenAPI.Model.TranscriptionWord

module CreateTranscription200Response =

  //#region CreateTranscription200Response

  [<CLIMutable>]
  type CreateTranscription200Response = {
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
    [<JsonProperty(PropertyName = "duration")>]
    Duration : string;
    [<JsonProperty(PropertyName = "words")>]
    Words : TranscriptionWord[];
    [<JsonProperty(PropertyName = "segments")>]
    Segments : TranscriptionSegment[];
  }

  //#endregion
