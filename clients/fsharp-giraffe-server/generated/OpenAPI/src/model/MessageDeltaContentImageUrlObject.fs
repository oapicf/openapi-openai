namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageDeltaContentImageUrlObjectImageUrl

module MessageDeltaContentImageUrlObject =

  //#region MessageDeltaContentImageUrlObject

  //#region enums
  type TypeEnum = ImageUrlEnum of string  
  //#endregion

  type MessageDeltaContentImageUrlObject = {
    Index : int;
    Type : TypeEnum;
    ImageUrl : MessageDeltaContentImageUrlObjectImageUrl;
  }
  //#endregion
