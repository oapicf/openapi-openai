namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaContentImageFileObject
open OpenAPI.Model.MessageDeltaContentImageFileObjectImageFile
open OpenAPI.Model.MessageDeltaContentTextObject
open OpenAPI.Model.MessageDeltaContentTextObjectText

module MessageDeltaObjectDeltaContentInner =

  //#region MessageDeltaObjectDeltaContentInner

  [<CLIMutable>]
  type MessageDeltaObjectDeltaContentInner = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image_file")>]
    ImageFile : MessageDeltaContentImageFileObjectImageFile;
    [<JsonProperty(PropertyName = "text")>]
    Text : MessageDeltaContentTextObjectText;
  }

  //#endregion
