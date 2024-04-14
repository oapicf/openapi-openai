namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionMessageToolCallFunction

module ChatCompletionMessageToolCall =

  //#region ChatCompletionMessageToolCall

  [<CLIMutable>]
  type ChatCompletionMessageToolCall = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : ChatCompletionMessageToolCallFunction;
  }

  //#endregion
