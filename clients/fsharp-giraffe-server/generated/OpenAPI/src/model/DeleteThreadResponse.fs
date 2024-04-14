namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeleteThreadResponse =

  //#region DeleteThreadResponse

  //#region enums
  type ObjectEnum = ThreadDeletedEnum of string  
  //#endregion

  type DeleteThreadResponse = {
    Id : string;
    Deleted : bool;
    Object : ObjectEnum;
  }
  //#endregion
