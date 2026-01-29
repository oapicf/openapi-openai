namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionNamedToolChoiceFunction

module ChatCompletionNamedToolChoice =

  //#region ChatCompletionNamedToolChoice

  [<CLIMutable>]
  type ChatCompletionNamedToolChoice = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : ChatCompletionNamedToolChoiceFunction;
  }

  //#endregion
