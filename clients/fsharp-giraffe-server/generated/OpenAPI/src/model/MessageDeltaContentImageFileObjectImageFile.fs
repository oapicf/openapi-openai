namespace OpenAPI.Model

open System
open System.Collections.Generic

module MessageDeltaContentImageFileObjectImageFile =

  //#region MessageDeltaContentImageFileObjectImageFile

  //#region enums
  type DetailEnum = AutoEnum of string  |  LowEnum of string  |  HighEnum of string  
  //#endregion

  type MessageDeltaContentImageFileObject_image_file = {
    FileId : string;
    Detail : DetailEnum;
  }
  //#endregion
