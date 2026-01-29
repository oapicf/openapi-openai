namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateTranslationResponseJson
open OpenAPI.Model.CreateTranslationResponseVerboseJson
open OpenAPI.Model.TranscriptionSegment

module CreateTranslation200Response =

  //#region CreateTranslation200Response


  type createTranslation_200_response = {
    Text : string;
    Language : string;
    Duration : string;
    Segments : TranscriptionSegment[];
  }
  //#endregion
