namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaContentImageUrlObjectImageUrl

module MessageDeltaContentImageUrlObject =

  //#region MessageDeltaContentImageUrlObject

  [<CLIMutable>]
  type MessageDeltaContentImageUrlObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : MessageDeltaContentImageUrlObjectImageUrl;
  }

  //#endregion
