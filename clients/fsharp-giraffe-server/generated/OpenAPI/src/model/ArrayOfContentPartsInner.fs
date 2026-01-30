namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageContentImageFileObject
open OpenAPI.Model.MessageContentImageFileObjectImageFile
open OpenAPI.Model.MessageContentImageUrlObject
open OpenAPI.Model.MessageContentImageUrlObjectImageUrl
open OpenAPI.Model.MessageRequestContentTextObject

module ArrayOfContentPartsInner =

  //#region ArrayOfContentPartsInner

  //#region enums
  type TypeEnum = ImageFileEnum of string  |  ImageUrlEnum of string  |  TextEnum of string  
  //#endregion

  type Array_of_content_parts_inner = {
    Type : TypeEnum;
    ImageFile : MessageContentImageFileObjectImageFile;
    ImageUrl : MessageContentImageUrlObjectImageUrl;
    Text : string;
  }
  //#endregion
