namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageContentTextAnnotationsFileCitationObjectFileCitation

module MessageContentTextAnnotationsFileCitationObject =

  //#region MessageContentTextAnnotationsFileCitationObject

  [<CLIMutable>]
  type MessageContentTextAnnotationsFileCitationObject = {
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
  }

  //#endregion
