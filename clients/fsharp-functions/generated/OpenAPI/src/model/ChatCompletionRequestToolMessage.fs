namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestToolMessageContent

module ChatCompletionRequestToolMessage =

  //#region ChatCompletionRequestToolMessage

  [<CLIMutable>]
  type ChatCompletionRequestToolMessage = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : ChatCompletionRequestToolMessageContent;
    [<JsonProperty(PropertyName = "tool_call_id")>]
    ToolCallId : string;
  }

  //#endregion
