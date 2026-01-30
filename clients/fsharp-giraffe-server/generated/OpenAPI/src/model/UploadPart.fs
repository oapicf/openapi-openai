namespace OpenAPI.Model

open System
open System.Collections.Generic

module UploadPart =

  //#region UploadPart

  //#region enums
  type ObjectEnum = UploadPartEnum of string  
  //#endregion

  type UploadPart = {
    Id : string;
    CreatedAt : int;
    UploadId : string;
    Object : ObjectEnum;
  }
  //#endregion
