namespace OpenAPI.Model

open System
open System.Collections.Generic

module ProjectRateLimit =

  //#region ProjectRateLimit

  //#region enums
  type ObjectEnum = ProjectRateLimitEnum of string  
  //#endregion

  type ProjectRateLimit = {
    Object : ObjectEnum;
    Id : string;
    Model : string;
    MaxRequestsPer1Minute : int;
    MaxTokensPer1Minute : int;
    MaxImagesPer1Minute : int;
    MaxAudioMegabytesPer1Minute : int;
    MaxRequestsPer1Day : int;
    Batch1DayMaxInputTokens : int;
  }
  //#endregion
