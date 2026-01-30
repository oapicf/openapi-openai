namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ModifyAssistantRequestToolResourcesCodeInterpreter
open OpenAPI.Model.ModifyAssistantRequestToolResourcesFileSearch

module ModifyAssistantRequestToolResources =

  //#region ModifyAssistantRequestToolResources


  type ModifyAssistantRequest_tool_resources = {
    CodeInterpreter : ModifyAssistantRequestToolResourcesCodeInterpreter;
    FileSearch : ModifyAssistantRequestToolResourcesFileSearch;
  }
  //#endregion
