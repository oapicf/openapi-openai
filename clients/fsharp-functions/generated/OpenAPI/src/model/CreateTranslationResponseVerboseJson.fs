namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TranscriptionSegment

module CreateTranslationResponseVerboseJson =

  //#region CreateTranslationResponseVerboseJson

  [<CLIMutable>]
  type CreateTranslationResponseVerboseJson = {
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
    [<JsonProperty(PropertyName = "duration")>]
    Duration : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "segments")>]
    Segments : TranscriptionSegment[];
  }

  //#endregion
