namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ModifyAssistantRequestToolResourcesCodeInterpreter
open OpenAPI.Model.ModifyAssistantRequestToolResourcesFileSearch

module ModifyAssistantRequestToolResources =

  //#region ModifyAssistantRequestToolResources

  [<CLIMutable>]
  type ModifyAssistantRequestToolResources = {
    [<JsonProperty(PropertyName = "code_interpreter")>]
    CodeInterpreter : ModifyAssistantRequestToolResourcesCodeInterpreter;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : ModifyAssistantRequestToolResourcesFileSearch;
  }

  //#endregion
