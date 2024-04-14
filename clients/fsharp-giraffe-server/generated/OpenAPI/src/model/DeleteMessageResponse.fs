namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeleteMessageResponse =

  //#region DeleteMessageResponse

  //#region enums
  type ObjectEnum = ThreadMessageDeletedEnum of string  
  //#endregion

  type DeleteMessageResponse = {
    Id : string;
    Deleted : bool;
    Object : ObjectEnum;
  }
  //#endregion
