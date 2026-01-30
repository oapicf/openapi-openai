namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageContentImageFileObject
open OpenAPI.Model.MessageContentImageFileObjectImageFile
open OpenAPI.Model.MessageContentImageUrlObject
open OpenAPI.Model.MessageContentImageUrlObjectImageUrl
open OpenAPI.Model.MessageContentRefusalObject
open OpenAPI.Model.MessageContentTextObject
open OpenAPI.Model.MessageContentTextObjectText

module MessageObjectContentInner =

  //#region MessageObjectContentInner

  [<CLIMutable>]
  type MessageObjectContentInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image_file")>]
    ImageFile : MessageContentImageFileObjectImageFile;
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : MessageContentImageUrlObjectImageUrl;
    [<JsonProperty(PropertyName = "text")>]
    Text : MessageContentTextObjectText;
    [<JsonProperty(PropertyName = "refusal")>]
    Refusal : string;
  }

  //#endregion
