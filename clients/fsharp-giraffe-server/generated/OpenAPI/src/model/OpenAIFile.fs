namespace OpenAPI.Model

open System
open System.Collections.Generic

module OpenAIFile =

  //#region OpenAIFile

  //#region enums
  type ObjectEnum = FileEnum of string  
  //#endregion
  //#region enums
  type PurposeEnum = FineTuneEnum of string  |  FineTuneResultsEnum of string  |  AssistantsEnum of string  |  AssistantsOutputEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = UploadedEnum of string  |  ProcessedEnum of string  |  ErrorEnum of string  
  //#endregion

  type OpenAIFile = {
    Id : string;
    Bytes : int;
    CreatedAt : int;
    Filename : string;
    Object : ObjectEnum;
    Purpose : PurposeEnum;
    Status : StatusEnum;
    StatusDetails : string;
  }
  //#endregion
