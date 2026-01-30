namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantsNamedToolChoiceFunction
open OpenAPI.Model.ChatCompletionNamedToolChoice

module ChatCompletionToolChoiceOption =

  //#region ChatCompletionToolChoiceOption

  [<CLIMutable>]
  type ChatCompletionToolChoiceOption = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : AssistantsNamedToolChoiceFunction;
  }

  //#endregion
