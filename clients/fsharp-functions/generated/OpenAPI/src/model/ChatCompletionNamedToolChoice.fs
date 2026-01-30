namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantsNamedToolChoiceFunction

module ChatCompletionNamedToolChoice =

  //#region ChatCompletionNamedToolChoice

  [<CLIMutable>]
  type ChatCompletionNamedToolChoice = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : AssistantsNamedToolChoiceFunction;
  }

  //#endregion
