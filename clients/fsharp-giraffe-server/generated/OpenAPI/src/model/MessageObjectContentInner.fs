namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageContentImageFileObject
open OpenAPI.Model.MessageContentImageFileObjectImageFile
open OpenAPI.Model.MessageContentTextObject
open OpenAPI.Model.MessageContentTextObjectText

module MessageObjectContentInner =

  //#region MessageObjectContentInner

  //#region enums
  type TypeEnum = ImageFileEnum of string  |  TextEnum of string  
  //#endregion

  type MessageObject_content_inner = {
    Type : TypeEnum;
    ImageFile : MessageContentImageFileObjectImageFile;
    Text : MessageContentTextObjectText;
  }
  //#endregion
