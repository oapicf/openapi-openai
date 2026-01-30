namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionMessageToolCall
open OpenAPI.Model.ChatCompletionRequestAssistantMessageAudio
open OpenAPI.Model.ChatCompletionRequestAssistantMessageContent
open OpenAPI.Model.ChatCompletionRequestAssistantMessageFunctionCall
open OpenAPI.Model.string option

module ChatCompletionRequestAssistantMessage =

  //#region ChatCompletionRequestAssistantMessage

  [<CLIMutable>]
  type ChatCompletionRequestAssistantMessage = {
    [<JsonProperty(PropertyName = "content")>]
    Content : ChatCompletionRequestAssistantMessageContent;
    [<JsonProperty(PropertyName = "refusal")>]
    Refusal : string option;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "audio")>]
    Audio : ChatCompletionRequestAssistantMessageAudio;
    [<JsonProperty(PropertyName = "tool_calls")>]
    ToolCalls : ChatCompletionMessageToolCall[];
    [<JsonProperty(PropertyName = "function_call")>]
    FunctionCall : ChatCompletionRequestAssistantMessageFunctionCall;
  }

  //#endregion
