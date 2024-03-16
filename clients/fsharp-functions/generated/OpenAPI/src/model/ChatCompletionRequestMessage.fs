namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestMessageFunctionCall

module ChatCompletionRequestMessage =

  //#region ChatCompletionRequestMessage

  [<CLIMutable>]
  type ChatCompletionRequestMessage = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "function_call")>]
    FunctionCall : ChatCompletionRequestMessageFunctionCall;
  }

  //#endregion
