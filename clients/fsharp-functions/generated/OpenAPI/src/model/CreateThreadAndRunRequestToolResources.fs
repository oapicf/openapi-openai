namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantObjectToolResourcesFileSearch
open OpenAPI.Model.CreateAssistantRequestToolResourcesCodeInterpreter

module CreateThreadAndRunRequestToolResources =

  //#region CreateThreadAndRunRequestToolResources

  [<CLIMutable>]
  type CreateThreadAndRunRequestToolResources = {
    [<JsonProperty(PropertyName = "code_interpreter")>]
    CodeInterpreter : CreateAssistantRequestToolResourcesCodeInterpreter;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : AssistantObjectToolResourcesFileSearch;
  }

  //#endregion
