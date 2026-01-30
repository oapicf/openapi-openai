namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateAssistantRequestToolResourcesCodeInterpreter
open OpenAPI.Model.CreateThreadRequestToolResourcesFileSearch

module CreateThreadRequestToolResources =

  //#region CreateThreadRequestToolResources


  type CreateThreadRequest_tool_resources = {
    CodeInterpreter : CreateAssistantRequestToolResourcesCodeInterpreter;
    FileSearch : CreateThreadRequestToolResourcesFileSearch;
  }
  //#endregion
