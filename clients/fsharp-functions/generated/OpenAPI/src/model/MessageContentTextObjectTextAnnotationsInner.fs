namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageContentTextAnnotationsFileCitationObject
open OpenAPI.Model.MessageContentTextAnnotationsFileCitationObjectFileCitation
open OpenAPI.Model.MessageContentTextAnnotationsFilePathObject
open OpenAPI.Model.MessageContentTextAnnotationsFilePathObjectFilePath

module MessageContentTextObjectTextAnnotationsInner =

  //#region MessageContentTextObjectTextAnnotationsInner

  [<CLIMutable>]
  type MessageContentTextObjectTextAnnotationsInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "file_citation")>]
    FileCitation : MessageContentTextAnnotationsFileCitationObjectFileCitation;
    [<JsonProperty(PropertyName = "start_index")>]
    StartIndex : int;
    [<JsonProperty(PropertyName = "end_index")>]
    EndIndex : int;
    [<JsonProperty(PropertyName = "file_path")>]
    FilePath : MessageContentTextAnnotationsFilePathObjectFilePath;
  }

  //#endregion
