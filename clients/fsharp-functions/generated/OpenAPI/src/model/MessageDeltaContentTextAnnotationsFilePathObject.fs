namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath

module MessageDeltaContentTextAnnotationsFilePathObject =

  //#region MessageDeltaContentTextAnnotationsFilePathObject

  [<CLIMutable>]
  type MessageDeltaContentTextAnnotationsFilePathObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "file_path")>]
    FilePath : MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
    [<JsonProperty(PropertyName = "start_index")>]
    StartIndex : int;
    [<JsonProperty(PropertyName = "end_index")>]
    EndIndex : int;
  }

  //#endregion
