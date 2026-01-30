namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantToolsCode
open OpenAPI.Model.AssistantToolsFileSearchTypeOnly

module CreateMessageRequestAttachmentsInnerToolsInner =

  //#region CreateMessageRequestAttachmentsInnerToolsInner

  [<CLIMutable>]
  type CreateMessageRequestAttachmentsInnerToolsInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
