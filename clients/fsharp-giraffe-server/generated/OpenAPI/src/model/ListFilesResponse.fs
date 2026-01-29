namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OpenAIFile

module ListFilesResponse =

  //#region ListFilesResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ListFilesResponse = {
    Data : OpenAIFile[];
    Object : ObjectEnum;
  }
  //#endregion
