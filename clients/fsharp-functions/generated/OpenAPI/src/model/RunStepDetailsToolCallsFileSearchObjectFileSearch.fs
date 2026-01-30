namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchRankingOptionsObject
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchResultObject

module RunStepDetailsToolCallsFileSearchObjectFileSearch =

  //#region RunStepDetailsToolCallsFileSearchObjectFileSearch

  [<CLIMutable>]
  type RunStepDetailsToolCallsFileSearchObjectFileSearch = {
    [<JsonProperty(PropertyName = "ranking_options")>]
    RankingOptions : RunStepDetailsToolCallsFileSearchRankingOptionsObject;
    [<JsonProperty(PropertyName = "results")>]
    Results : RunStepDetailsToolCallsFileSearchResultObject[];
  }

  //#endregion
