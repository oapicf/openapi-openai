namespace OpenAPI.Model

open System
open System.Collections.Generic

module MessageDeltaContentRefusalObject =

  //#region MessageDeltaContentRefusalObject

  //#region enums
  type TypeEnum = RefusalEnum of string  
  //#endregion

  type MessageDeltaContentRefusalObject = {
    Index : int;
    Type : TypeEnum;
    Refusal : string;
  }
  //#endregion
