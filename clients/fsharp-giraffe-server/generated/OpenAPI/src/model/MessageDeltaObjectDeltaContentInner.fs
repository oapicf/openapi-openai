namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageDeltaContentImageFileObject
open OpenAPI.Model.MessageDeltaContentImageFileObjectImageFile
open OpenAPI.Model.MessageDeltaContentTextObject
open OpenAPI.Model.MessageDeltaContentTextObjectText

module MessageDeltaObjectDeltaContentInner =

  //#region MessageDeltaObjectDeltaContentInner

  //#region enums
  type TypeEnum = ImageFileEnum of string  |  TextEnum of string  
  //#endregion

  type MessageDeltaObject_delta_content_inner = {
    Index : int;
    Type : TypeEnum;
    ImageFile : MessageDeltaContentImageFileObjectImageFile;
    Text : MessageDeltaContentTextObjectText;
  }
  //#endregion
