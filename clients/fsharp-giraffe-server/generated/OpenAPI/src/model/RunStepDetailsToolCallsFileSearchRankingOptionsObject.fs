namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunStepDetailsToolCallsFileSearchRankingOptionsObject =

  //#region RunStepDetailsToolCallsFileSearchRankingOptionsObject

  //#region enums
  type RankerEnum = Default20240821Enum of string  
  //#endregion

  type RunStepDetailsToolCallsFileSearchRankingOptionsObject = {
    Ranker : RankerEnum;
    ScoreThreshold : decimal;
  }
  //#endregion
