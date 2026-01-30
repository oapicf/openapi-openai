namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageContentImageUrlObjectImageUrl

module MessageContentImageUrlObject =

  //#region MessageContentImageUrlObject

  [<CLIMutable>]
  type MessageContentImageUrlObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : MessageContentImageUrlObjectImageUrl;
  }

  //#endregion
