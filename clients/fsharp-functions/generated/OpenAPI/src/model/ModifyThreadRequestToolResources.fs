namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateAssistantRequestToolResourcesCodeInterpreter
open OpenAPI.Model.ModifyThreadRequestToolResourcesFileSearch

module ModifyThreadRequestToolResources =

  //#region ModifyThreadRequestToolResources

  [<CLIMutable>]
  type ModifyThreadRequestToolResources = {
    [<JsonProperty(PropertyName = "code_interpreter")>]
    CodeInterpreter : CreateAssistantRequestToolResourcesCodeInterpreter;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : ModifyThreadRequestToolResourcesFileSearch;
  }

  //#endregion
