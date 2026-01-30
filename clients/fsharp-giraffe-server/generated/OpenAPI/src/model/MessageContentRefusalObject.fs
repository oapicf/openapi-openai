namespace OpenAPI.Model

open System
open System.Collections.Generic

module MessageContentRefusalObject =

  //#region MessageContentRefusalObject

  //#region enums
  type TypeEnum = RefusalEnum of string  
  //#endregion

  type MessageContentRefusalObject = {
    Type : TypeEnum;
    Refusal : string;
  }
  //#endregion
