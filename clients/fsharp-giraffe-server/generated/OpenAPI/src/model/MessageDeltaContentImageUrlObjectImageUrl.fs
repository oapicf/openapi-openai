namespace OpenAPI.Model

open System
open System.Collections.Generic

module MessageDeltaContentImageUrlObjectImageUrl =

  //#region MessageDeltaContentImageUrlObjectImageUrl

  //#region enums
  type DetailEnum = AutoEnum of string  |  LowEnum of string  |  HighEnum of string  
  //#endregion

  type MessageDeltaContentImageUrlObject_image_url = {
    Url : string;
    Detail : DetailEnum;
  }
  //#endregion
