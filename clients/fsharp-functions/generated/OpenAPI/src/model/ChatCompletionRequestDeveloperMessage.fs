namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestDeveloperMessageContent

module ChatCompletionRequestDeveloperMessage =

  //#region ChatCompletionRequestDeveloperMessage

  [<CLIMutable>]
  type ChatCompletionRequestDeveloperMessage = {
    [<JsonProperty(PropertyName = "content")>]
    Content : ChatCompletionRequestDeveloperMessageContent;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
