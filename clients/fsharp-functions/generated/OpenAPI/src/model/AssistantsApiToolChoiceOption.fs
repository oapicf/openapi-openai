namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantsNamedToolChoice
open OpenAPI.Model.AssistantsNamedToolChoiceFunction

module AssistantsApiToolChoiceOption =

  //#region AssistantsApiToolChoiceOption

  [<CLIMutable>]
  type AssistantsApiToolChoiceOption = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : AssistantsNamedToolChoiceFunction;
  }

  //#endregion
