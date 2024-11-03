namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageDeltaContentImageFileObjectImageFile

module MessageDeltaContentImageFileObject =

  //#region MessageDeltaContentImageFileObject

  //#region enums
  type TypeEnum = ImageFileEnum of string  
  //#endregion

  type MessageDeltaContentImageFileObject = {
    Index : int;
    Type : TypeEnum;
    ImageFile : MessageDeltaContentImageFileObjectImageFile;
  }
  //#endregion
