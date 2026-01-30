namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunStepDetailsToolCallsFileSearchRankingOptionsObject =

  //#region RunStepDetailsToolCallsFileSearchRankingOptionsObject

  [<CLIMutable>]
  type RunStepDetailsToolCallsFileSearchRankingOptionsObject = {
    [<JsonProperty(PropertyName = "ranker")>]
    Ranker : string;
    [<JsonProperty(PropertyName = "score_threshold")>]
    ScoreThreshold : decimal;
  }

  //#endregion
