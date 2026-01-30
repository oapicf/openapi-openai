namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateMessageRequestAttachmentsInnerToolsInner

module CreateMessageRequestAttachmentsInner =

  //#region CreateMessageRequestAttachmentsInner

  [<CLIMutable>]
  type CreateMessageRequestAttachmentsInner = {
    [<JsonProperty(PropertyName = "file_id")>]
    FileId : string;
    [<JsonProperty(PropertyName = "tools")>]
    Tools : CreateMessageRequestAttachmentsInnerToolsInner[];
  }

  //#endregion
