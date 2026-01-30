namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionMessageToolCallChunk
open OpenAPI.Model.ChatCompletionStreamResponseDeltaFunctionCall
open OpenAPI.Model.string option

module ChatCompletionStreamResponseDelta =

  //#region ChatCompletionStreamResponseDelta

  [<CLIMutable>]
  type ChatCompletionStreamResponseDelta = {
    [<JsonProperty(PropertyName = "content")>]
    Content : string option;
    [<JsonProperty(PropertyName = "function_call")>]
    FunctionCall : ChatCompletionStreamResponseDeltaFunctionCall;
    [<JsonProperty(PropertyName = "tool_calls")>]
    ToolCalls : ChatCompletionMessageToolCallChunk[];
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "refusal")>]
    Refusal : string option;
  }

  //#endregion
