namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageContentTextAnnotationsFilePathObjectFilePath

module MessageContentTextAnnotationsFilePathObject =

  //#region MessageContentTextAnnotationsFilePathObject

  [<CLIMutable>]
  type MessageContentTextAnnotationsFilePathObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "file_path")>]
    FilePath : MessageContentTextAnnotationsFilePathObjectFilePath;
    [<JsonProperty(PropertyName = "start_index")>]
    StartIndex : int;
    [<JsonProperty(PropertyName = "end_index")>]
    EndIndex : int;
  }

  //#endregion
