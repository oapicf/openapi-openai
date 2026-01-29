namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestUserMessageContent

module ChatCompletionRequestUserMessage =

  //#region ChatCompletionRequestUserMessage

  [<CLIMutable>]
  type ChatCompletionRequestUserMessage = {
    [<JsonProperty(PropertyName = "content")>]
    Content : ChatCompletionRequestUserMessageContent;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
