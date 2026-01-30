namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FileSearchRankingOptions =

  //#region FileSearchRankingOptions

  [<CLIMutable>]
  type FileSearchRankingOptions = {
    [<JsonProperty(PropertyName = "ranker")>]
    Ranker : string;
    [<JsonProperty(PropertyName = "score_threshold")>]
    ScoreThreshold : decimal;
  }

  //#endregion
