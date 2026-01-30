namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageContentImageFileObject
open OpenAPI.Model.MessageContentImageFileObjectImageFile
open OpenAPI.Model.MessageContentImageUrlObject
open OpenAPI.Model.MessageContentImageUrlObjectImageUrl
open OpenAPI.Model.MessageRequestContentTextObject

module ArrayOfContentPartsInner =

  //#region ArrayOfContentPartsInner

  [<CLIMutable>]
  type ArrayOfContentPartsInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image_file")>]
    ImageFile : MessageContentImageFileObjectImageFile;
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : MessageContentImageUrlObjectImageUrl;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
