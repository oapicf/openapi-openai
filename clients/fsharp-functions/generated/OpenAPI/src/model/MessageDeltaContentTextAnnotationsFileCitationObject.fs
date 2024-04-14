namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation

module MessageDeltaContentTextAnnotationsFileCitationObject =

  //#region MessageDeltaContentTextAnnotationsFileCitationObject

  [<CLIMutable>]
  type MessageDeltaContentTextAnnotationsFileCitationObject = {
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
  }

  //#endregion
