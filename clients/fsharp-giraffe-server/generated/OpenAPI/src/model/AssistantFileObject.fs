namespace OpenAPI.Model

open System
open System.Collections.Generic

module AssistantFileObject =

  //#region AssistantFileObject

  //#region enums
  type ObjectEnum = AssistantFileEnum of string  
  //#endregion

  type AssistantFileObject = {
    Id : string;
    Object : ObjectEnum;
    CreatedAt : int;
    AssistantId : string;
  }
  //#endregion
