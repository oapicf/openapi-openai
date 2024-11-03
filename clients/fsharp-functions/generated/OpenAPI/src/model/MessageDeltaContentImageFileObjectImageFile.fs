namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageDeltaContentImageFileObjectImageFile =

  //#region MessageDeltaContentImageFileObjectImageFile

  [<CLIMutable>]
  type MessageDeltaContentImageFileObjectImageFile = {
    [<JsonProperty(PropertyName = "file_id")>]
    FileId : string;
  }

  //#endregion
