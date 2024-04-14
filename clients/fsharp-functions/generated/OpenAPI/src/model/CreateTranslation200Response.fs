namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateTranslationResponseJson
open OpenAPI.Model.CreateTranslationResponseVerboseJson
open OpenAPI.Model.TranscriptionSegment

module CreateTranslation200Response =

  //#region CreateTranslation200Response

  [<CLIMutable>]
  type CreateTranslation200Response = {
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
    [<JsonProperty(PropertyName = "duration")>]
    Duration : string;
    [<JsonProperty(PropertyName = "segments")>]
    Segments : TranscriptionSegment[];
  }

  //#endregion
