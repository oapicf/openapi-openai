namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestMessageFunctionCall
open OpenAPI.Model.string option

module ChatCompletionResponseMessage =

  //#region ChatCompletionResponseMessage

  [<CLIMutable>]
  type ChatCompletionResponseMessage = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : string option;
    [<JsonProperty(PropertyName = "function_call")>]
    FunctionCall : ChatCompletionRequestMessageFunctionCall;
  }

  //#endregion
