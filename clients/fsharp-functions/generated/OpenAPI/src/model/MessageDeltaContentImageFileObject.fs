namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaContentImageFileObjectImageFile

module MessageDeltaContentImageFileObject =

  //#region MessageDeltaContentImageFileObject

  [<CLIMutable>]
  type MessageDeltaContentImageFileObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image_file")>]
    ImageFile : MessageDeltaContentImageFileObjectImageFile;
  }

  //#endregion
