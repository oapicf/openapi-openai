namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateTranscriptionResponseJson
open OpenAPI.Model.CreateTranscriptionResponseVerboseJson
open OpenAPI.Model.TranscriptionSegment
open OpenAPI.Model.TranscriptionWord

module CreateTranscription200Response =

  //#region CreateTranscription200Response


  type createTranscription_200_response = {
    Text : string;
    Language : string;
    Duration : string;
    Words : TranscriptionWord[];
    Segments : TranscriptionSegment[];
  }
  //#endregion
