namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OpenAIFile

module Upload =

  //#region Upload

  //#region enums
  type StatusEnum = PendingEnum of string  |  CompletedEnum of string  |  CancelledEnum of string  |  ExpiredEnum of string  
  //#endregion
  //#region enums
  type ObjectEnum = UploadEnum of string  
  //#endregion

  type Upload = {
    Id : string;
    CreatedAt : int;
    Filename : string;
    Bytes : int;
    Purpose : string;
    Status : StatusEnum;
    ExpiresAt : int;
    Object : ObjectEnum;
    File : OpenAIFile;
  }
  //#endregion
