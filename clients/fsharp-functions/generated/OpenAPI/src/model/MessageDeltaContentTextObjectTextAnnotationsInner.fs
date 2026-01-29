namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFileCitationObject
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFilePathObject
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath

module MessageDeltaContentTextObjectTextAnnotationsInner =

  //#region MessageDeltaContentTextObjectTextAnnotationsInner

  [<CLIMutable>]
  type MessageDeltaContentTextObjectTextAnnotationsInner = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "file_citation")>]
    FileCitation : MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
    [<JsonProperty(PropertyName = "start_index")>]
    StartIndex : int;
    [<JsonProperty(PropertyName = "end_index")>]
    EndIndex : int;
    [<JsonProperty(PropertyName = "file_path")>]
    FilePath : MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
  }

  //#endregion
