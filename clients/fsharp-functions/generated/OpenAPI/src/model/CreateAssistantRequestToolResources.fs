namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateAssistantRequestToolResourcesCodeInterpreter
open OpenAPI.Model.CreateAssistantRequestToolResourcesFileSearch

module CreateAssistantRequestToolResources =

  //#region CreateAssistantRequestToolResources

  [<CLIMutable>]
  type CreateAssistantRequestToolResources = {
    [<JsonProperty(PropertyName = "code_interpreter")>]
    CodeInterpreter : CreateAssistantRequestToolResourcesCodeInterpreter;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : CreateAssistantRequestToolResourcesFileSearch;
  }

  //#endregion
