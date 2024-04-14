namespace OpenAPI.Model

open System
open System.Collections.Generic

module Model =

  //#region Model

  //#region enums
  type ObjectEnum = ModelEnum of string  
  //#endregion

  type Model = {
    Id : string;
    Created : int;
    Object : ObjectEnum;
    OwnedBy : string;
  }
  //#endregion
