namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateUploadRequest =

  //#region CreateUploadRequest

  //#region enums
  type PurposeEnum = AssistantsEnum of string  |  BatchEnum of string  |  FineTuneEnum of string  |  VisionEnum of string  
  //#endregion

  type CreateUploadRequest = {
    Filename : string;
    Purpose : PurposeEnum;
    Bytes : int;
    MimeType : string;
  }
  //#endregion
