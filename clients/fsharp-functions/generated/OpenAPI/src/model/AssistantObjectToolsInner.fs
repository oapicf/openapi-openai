namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantToolsCode
open OpenAPI.Model.AssistantToolsFileSearch
open OpenAPI.Model.AssistantToolsFileSearchFileSearch
open OpenAPI.Model.AssistantToolsFunction
open OpenAPI.Model.FunctionObject

module AssistantObjectToolsInner =

  //#region AssistantObjectToolsInner

  [<CLIMutable>]
  type AssistantObjectToolsInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : AssistantToolsFileSearchFileSearch;
    [<JsonProperty(PropertyName = "function")>]
    Function : FunctionObject;
  }

  //#endregion
