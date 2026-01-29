namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionNamedToolChoiceFunction =

  //#region ChatCompletionNamedToolChoiceFunction

  [<CLIMutable>]
  type ChatCompletionNamedToolChoiceFunction = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
