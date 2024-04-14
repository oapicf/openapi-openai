namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FunctionObject

module ChatCompletionTool =

  //#region ChatCompletionTool

  [<CLIMutable>]
  type ChatCompletionTool = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : FunctionObject;
  }

  //#endregion
