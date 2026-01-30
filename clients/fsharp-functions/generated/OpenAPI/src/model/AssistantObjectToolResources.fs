namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantObjectToolResourcesCodeInterpreter
open OpenAPI.Model.AssistantObjectToolResourcesFileSearch

module AssistantObjectToolResources =

  //#region AssistantObjectToolResources

  [<CLIMutable>]
  type AssistantObjectToolResources = {
    [<JsonProperty(PropertyName = "code_interpreter")>]
    CodeInterpreter : AssistantObjectToolResourcesCodeInterpreter;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : AssistantObjectToolResourcesFileSearch;
  }

  //#endregion
