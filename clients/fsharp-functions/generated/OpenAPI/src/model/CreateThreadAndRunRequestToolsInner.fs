namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantToolsCode
open OpenAPI.Model.AssistantToolsFunction
open OpenAPI.Model.AssistantToolsRetrieval
open OpenAPI.Model.FunctionObject

module CreateThreadAndRunRequestToolsInner =

  //#region CreateThreadAndRunRequestToolsInner

  [<CLIMutable>]
  type CreateThreadAndRunRequestToolsInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : FunctionObject;
  }

  //#endregion
