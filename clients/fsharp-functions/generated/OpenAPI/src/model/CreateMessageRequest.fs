namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateMessageRequestAttachmentsInner
open OpenAPI.Model.CreateMessageRequestContent

module CreateMessageRequest =

  //#region CreateMessageRequest

  [<CLIMutable>]
  type CreateMessageRequest = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : CreateMessageRequestContent;
    [<JsonProperty(PropertyName = "attachments")>]
    Attachments : CreateMessageRequestAttachmentsInner[];
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
