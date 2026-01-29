namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TranscriptionSegment

module CreateTranslationResponseVerboseJson =

  //#region CreateTranslationResponseVerboseJson


  type CreateTranslationResponseVerboseJson = {
    Language : string;
    Duration : string;
    Text : string;
    Segments : TranscriptionSegment[];
  }
  //#endregion
