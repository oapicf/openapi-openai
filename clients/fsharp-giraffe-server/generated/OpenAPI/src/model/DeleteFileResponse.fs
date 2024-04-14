namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeleteFileResponse =

  //#region DeleteFileResponse

  //#region enums
  type ObjectEnum = FileEnum of string  
  //#endregion

  type DeleteFileResponse = {
    Id : string;
    Object : ObjectEnum;
    Deleted : bool;
  }
  //#endregion
