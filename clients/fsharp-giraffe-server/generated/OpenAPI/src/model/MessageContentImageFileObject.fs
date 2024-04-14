namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageContentImageFileObjectImageFile

module MessageContentImageFileObject =

  //#region MessageContentImageFileObject

  //#region enums
  type TypeEnum = ImageFileEnum of string  
  //#endregion

  type MessageContentImageFileObject = {
    Type : TypeEnum;
    ImageFile : MessageContentImageFileObjectImageFile;
  }
  //#endregion
