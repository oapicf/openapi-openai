namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionMessageToolCall
open OpenAPI.Model.ChatCompletionRequestAssistantMessage
open OpenAPI.Model.ChatCompletionRequestAssistantMessageFunctionCall
open OpenAPI.Model.ChatCompletionRequestFunctionMessage
open OpenAPI.Model.ChatCompletionRequestSystemMessage
open OpenAPI.Model.ChatCompletionRequestToolMessage
open OpenAPI.Model.ChatCompletionRequestUserMessage
open OpenAPI.Model.string option

module ChatCompletionRequestMessage =

  //#region ChatCompletionRequestMessage

  [<CLIMutable>]
  type ChatCompletionRequestMessage = {
    [<JsonProperty(PropertyName = "content")>]
    Content : string option;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "tool_calls")>]
    ToolCalls : ChatCompletionMessageToolCall[];
    [<JsonProperty(PropertyName = "function_call")>]
    FunctionCall : ChatCompletionRequestAssistantMessageFunctionCall;
    [<JsonProperty(PropertyName = "tool_call_id")>]
    ToolCallId : string;
  }

  //#endregion
