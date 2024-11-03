namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantsApiNamedToolChoice
open OpenAPI.Model.ChatCompletionNamedToolChoiceFunction

module AssistantsApiToolChoiceOption =

  //#region AssistantsApiToolChoiceOption

  [<CLIMutable>]
  type AssistantsApiToolChoiceOption = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : ChatCompletionNamedToolChoiceFunction;
  }

  //#endregion
