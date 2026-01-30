namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OpenAIFile

module ListFilesResponse =

  //#region ListFilesResponse


  type ListFilesResponse = {
    Object : string;
    Data : OpenAIFile[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
