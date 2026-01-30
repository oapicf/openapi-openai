namespace OpenAPI.Model

open System
open System.Collections.Generic

module FileSearchRankingOptions =

  //#region FileSearchRankingOptions

  //#region enums
  type RankerEnum = AutoEnum of string  |  Default20240821Enum of string  
  //#endregion

  type FileSearchRankingOptions = {
    Ranker : RankerEnum;
    ScoreThreshold : decimal;
  }
  //#endregion
