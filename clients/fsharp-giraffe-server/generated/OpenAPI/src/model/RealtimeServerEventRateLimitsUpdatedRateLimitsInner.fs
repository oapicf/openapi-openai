namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventRateLimitsUpdatedRateLimitsInner =

  //#region RealtimeServerEventRateLimitsUpdatedRateLimitsInner

  //#region enums
  type NameEnum = RequestsEnum of string  |  TokensEnum of string  
  //#endregion

  type RealtimeServerEventRateLimitsUpdated_rate_limits_inner = {
    Name : NameEnum;
    Limit : int;
    Remaining : int;
    ResetSeconds : decimal;
  }
  //#endregion
