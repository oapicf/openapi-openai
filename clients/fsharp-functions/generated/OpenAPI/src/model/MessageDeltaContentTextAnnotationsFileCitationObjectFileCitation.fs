namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation =

  //#region MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation

  [<CLIMutable>]
  type MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation = {
    [<JsonProperty(PropertyName = "file_id")>]
    FileId : string;
    [<JsonProperty(PropertyName = "quote")>]
    Quote : string;
  }

  //#endregion
