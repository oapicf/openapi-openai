namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionNamedToolChoice
open OpenAPI.Model.ChatCompletionNamedToolChoiceFunction

module ChatCompletionToolChoiceOption =

  //#region ChatCompletionToolChoiceOption

  [<CLIMutable>]
  type ChatCompletionToolChoiceOption = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : ChatCompletionNamedToolChoiceFunction;
  }

  //#endregion
