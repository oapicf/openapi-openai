namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageContentImageFileObjectImageFile

module MessageContentImageFileObject =

  //#region MessageContentImageFileObject

  [<CLIMutable>]
  type MessageContentImageFileObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image_file")>]
    ImageFile : MessageContentImageFileObjectImageFile;
  }

  //#endregion
