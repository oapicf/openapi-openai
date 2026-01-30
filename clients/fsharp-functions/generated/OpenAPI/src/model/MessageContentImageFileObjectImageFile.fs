namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageContentImageFileObjectImageFile =

  //#region MessageContentImageFileObjectImageFile

  [<CLIMutable>]
  type MessageContentImageFileObjectImageFile = {
    [<JsonProperty(PropertyName = "file_id")>]
    FileId : string;
    [<JsonProperty(PropertyName = "detail")>]
    Detail : string;
  }

  //#endregion
