namespace OpenAPI.Model

open System
open System.Collections.Generic

module MessageRequestContentTextObject =

  //#region MessageRequestContentTextObject

  //#region enums
  type TypeEnum = TextEnum of string  
  //#endregion

  type MessageRequestContentTextObject = {
    Type : TypeEnum;
    Text : string;
  }
  //#endregion
