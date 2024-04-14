namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageContentTextAnnotationsFileCitationObjectFileCitation =

  //#region MessageContentTextAnnotationsFileCitationObjectFileCitation

  [<CLIMutable>]
  type MessageContentTextAnnotationsFileCitationObjectFileCitation = {
    [<JsonProperty(PropertyName = "file_id")>]
    FileId : string;
    [<JsonProperty(PropertyName = "quote")>]
    Quote : string;
  }

  //#endregion
