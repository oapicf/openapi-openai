namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateAssistantRequestToolResourcesCodeInterpreter
open OpenAPI.Model.ModifyThreadRequestToolResourcesFileSearch

module ModifyThreadRequestToolResources =

  //#region ModifyThreadRequestToolResources


  type ModifyThreadRequest_tool_resources = {
    CodeInterpreter : CreateAssistantRequestToolResourcesCodeInterpreter;
    FileSearch : ModifyThreadRequestToolResourcesFileSearch;
  }
  //#endregion
