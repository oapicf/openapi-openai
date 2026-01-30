namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantToolsFileSearchFileSearch

module AssistantToolsFileSearch =

  //#region AssistantToolsFileSearch

  [<CLIMutable>]
  type AssistantToolsFileSearch = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : AssistantToolsFileSearchFileSearch;
  }

  //#endregion
