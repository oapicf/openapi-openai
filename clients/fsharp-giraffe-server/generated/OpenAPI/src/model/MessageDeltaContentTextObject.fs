namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageDeltaContentTextObjectText

module MessageDeltaContentTextObject =

  //#region MessageDeltaContentTextObject

  //#region enums
  type TypeEnum = TextEnum of string  
  //#endregion

  type MessageDeltaContentTextObject = {
    Index : int;
    Type : TypeEnum;
    Text : MessageDeltaContentTextObjectText;
  }
  //#endregion
