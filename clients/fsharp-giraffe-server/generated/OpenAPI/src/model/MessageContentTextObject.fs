namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageContentTextObjectText

module MessageContentTextObject =

  //#region MessageContentTextObject

  //#region enums
  type TypeEnum = TextEnum of string  
  //#endregion

  type MessageContentTextObject = {
    Type : TypeEnum;
    Text : MessageContentTextObjectText;
  }
  //#endregion
