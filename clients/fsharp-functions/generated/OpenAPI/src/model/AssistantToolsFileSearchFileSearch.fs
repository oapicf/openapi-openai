namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FileSearchRankingOptions

module AssistantToolsFileSearchFileSearch =

  //#region AssistantToolsFileSearchFileSearch

  [<CLIMutable>]
  type AssistantToolsFileSearchFileSearch = {
    [<JsonProperty(PropertyName = "max_num_results")>]
    MaxNumResults : int;
    [<JsonProperty(PropertyName = "ranking_options")>]
    RankingOptions : FileSearchRankingOptions;
  }

  //#endregion
