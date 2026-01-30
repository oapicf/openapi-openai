namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionMessageToolCall
open OpenAPI.Model.ChatCompletionResponseMessageAudio
open OpenAPI.Model.ChatCompletionResponseMessageFunctionCall
open OpenAPI.Model.string option

module ChatCompletionResponseMessage =

  //#region ChatCompletionResponseMessage

  [<CLIMutable>]
  type ChatCompletionResponseMessage = {
    [<JsonProperty(PropertyName = "content")>]
    Content : string option;
    [<JsonProperty(PropertyName = "refusal")>]
    Refusal : string option;
    [<JsonProperty(PropertyName = "tool_calls")>]
    ToolCalls : ChatCompletionMessageToolCall[];
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "function_call")>]
    FunctionCall : ChatCompletionResponseMessageFunctionCall;
    [<JsonProperty(PropertyName = "audio")>]
    Audio : ChatCompletionResponseMessageAudio;
  }

  //#endregion
