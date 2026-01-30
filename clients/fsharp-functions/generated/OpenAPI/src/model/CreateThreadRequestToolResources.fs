namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateAssistantRequestToolResourcesCodeInterpreter
open OpenAPI.Model.CreateThreadRequestToolResourcesFileSearch

module CreateThreadRequestToolResources =

  //#region CreateThreadRequestToolResources

  [<CLIMutable>]
  type CreateThreadRequestToolResources = {
    [<JsonProperty(PropertyName = "code_interpreter")>]
    CodeInterpreter : CreateAssistantRequestToolResourcesCodeInterpreter;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : CreateThreadRequestToolResourcesFileSearch;
  }

  //#endregion
