namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestMessageFunctionCall
open OpenAPI.Model.string option

module ChatCompletionStreamResponseDelta =

  //#region ChatCompletionStreamResponseDelta

  [<CLIMutable>]
  type ChatCompletionStreamResponseDelta = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : string option;
    [<JsonProperty(PropertyName = "function_call")>]
    FunctionCall : ChatCompletionRequestMessageFunctionCall;
  }

  //#endregion
