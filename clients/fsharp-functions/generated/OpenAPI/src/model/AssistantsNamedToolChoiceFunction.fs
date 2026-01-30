namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssistantsNamedToolChoiceFunction =

  //#region AssistantsNamedToolChoiceFunction

  [<CLIMutable>]
  type AssistantsNamedToolChoiceFunction = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
