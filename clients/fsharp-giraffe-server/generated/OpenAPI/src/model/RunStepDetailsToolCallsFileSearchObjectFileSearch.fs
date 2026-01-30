namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchRankingOptionsObject
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchResultObject

module RunStepDetailsToolCallsFileSearchObjectFileSearch =

  //#region RunStepDetailsToolCallsFileSearchObjectFileSearch


  type RunStepDetailsToolCallsFileSearchObject_file_search = {
    RankingOptions : RunStepDetailsToolCallsFileSearchRankingOptionsObject;
    Results : RunStepDetailsToolCallsFileSearchResultObject[];
  }
  //#endregion
