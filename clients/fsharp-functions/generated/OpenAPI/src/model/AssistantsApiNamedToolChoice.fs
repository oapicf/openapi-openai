namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionNamedToolChoiceFunction

module AssistantsApiNamedToolChoice =

  //#region AssistantsApiNamedToolChoice

  [<CLIMutable>]
  type AssistantsApiNamedToolChoice = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : ChatCompletionNamedToolChoiceFunction;
  }

  //#endregion
