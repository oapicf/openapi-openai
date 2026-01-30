namespace OpenAPI.Model

open System
open System.Collections.Generic

module MessageContentImageFileObjectImageFile =

  //#region MessageContentImageFileObjectImageFile

  //#region enums
  type DetailEnum = AutoEnum of string  |  LowEnum of string  |  HighEnum of string  
  //#endregion

  type MessageContentImageFileObject_image_file = {
    FileId : string;
    Detail : DetailEnum;
  }
  //#endregion
