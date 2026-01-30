namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantObjectToolResourcesFileSearch
open OpenAPI.Model.CreateAssistantRequestToolResourcesCodeInterpreter

module CreateThreadAndRunRequestToolResources =

  //#region CreateThreadAndRunRequestToolResources


  type CreateThreadAndRunRequest_tool_resources = {
    CodeInterpreter : CreateAssistantRequestToolResourcesCodeInterpreter;
    FileSearch : AssistantObjectToolResourcesFileSearch;
  }
  //#endregion
