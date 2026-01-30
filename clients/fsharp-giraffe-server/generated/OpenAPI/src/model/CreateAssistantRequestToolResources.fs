namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateAssistantRequestToolResourcesCodeInterpreter
open OpenAPI.Model.CreateAssistantRequestToolResourcesFileSearch

module CreateAssistantRequestToolResources =

  //#region CreateAssistantRequestToolResources


  type CreateAssistantRequest_tool_resources = {
    CodeInterpreter : CreateAssistantRequestToolResourcesCodeInterpreter;
    FileSearch : CreateAssistantRequestToolResourcesFileSearch;
  }
  //#endregion
