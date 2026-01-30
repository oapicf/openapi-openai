namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageContentImageUrlObjectImageUrl

module MessageContentImageUrlObject =

  //#region MessageContentImageUrlObject

  //#region enums
  type TypeEnum = ImageUrlEnum of string  
  //#endregion

  type MessageContentImageUrlObject = {
    Type : TypeEnum;
    ImageUrl : MessageContentImageUrlObjectImageUrl;
  }
  //#endregion
