namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantsNamedToolChoiceFunction

module AssistantsNamedToolChoice =

  //#region AssistantsNamedToolChoice

  [<CLIMutable>]
  type AssistantsNamedToolChoice = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : AssistantsNamedToolChoiceFunction;
  }

  //#endregion
