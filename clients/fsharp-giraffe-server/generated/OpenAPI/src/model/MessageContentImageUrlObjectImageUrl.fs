namespace OpenAPI.Model

open System
open System.Collections.Generic

module MessageContentImageUrlObjectImageUrl =

  //#region MessageContentImageUrlObjectImageUrl

  //#region enums
  type DetailEnum = AutoEnum of string  |  LowEnum of string  |  HighEnum of string  
  //#endregion

  type MessageContentImageUrlObject_image_url = {
    Url : string;
    Detail : DetailEnum;
  }
  //#endregion
