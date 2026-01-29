namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TranscriptionSegment
open OpenAPI.Model.TranscriptionWord

module CreateTranscriptionResponseVerboseJson =

  //#region CreateTranscriptionResponseVerboseJson


  type CreateTranscriptionResponseVerboseJson = {
    Language : string;
    Duration : string;
    Text : string;
    Words : TranscriptionWord[];
    Segments : TranscriptionSegment[];
  }
  //#endregion
