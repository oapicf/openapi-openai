namespace OpenAPI.Model

open System
open System.Collections.Generic

module ProjectRateLimitUpdateRequest =

  //#region ProjectRateLimitUpdateRequest


  type ProjectRateLimitUpdateRequest = {
    MaxRequestsPer1Minute : int;
    MaxTokensPer1Minute : int;
    MaxImagesPer1Minute : int;
    MaxAudioMegabytesPer1Minute : int;
    MaxRequestsPer1Day : int;
    Batch1DayMaxInputTokens : int;
  }
  //#endregion
