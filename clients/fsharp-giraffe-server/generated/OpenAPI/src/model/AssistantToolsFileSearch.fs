namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantToolsFileSearchFileSearch

module AssistantToolsFileSearch =

  //#region AssistantToolsFileSearch

  //#region enums
  type TypeEnum = FileSearchEnum of string  
  //#endregion

  type AssistantToolsFileSearch = {
    Type : TypeEnum;
    FileSearch : AssistantToolsFileSearchFileSearch;
  }
  //#endregion
