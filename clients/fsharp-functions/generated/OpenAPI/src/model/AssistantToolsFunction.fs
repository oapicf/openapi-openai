namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FunctionObject

module AssistantToolsFunction =

  //#region AssistantToolsFunction

  [<CLIMutable>]
  type AssistantToolsFunction = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : FunctionObject;
  }

  //#endregion
