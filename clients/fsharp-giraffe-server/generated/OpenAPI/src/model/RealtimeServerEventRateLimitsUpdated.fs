namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner

module RealtimeServerEventRateLimitsUpdated =

  //#region RealtimeServerEventRateLimitsUpdated

  //#region enums
  type TypeEnum = RateLimitsUpdatedEnum of string  
  //#endregion

  type RealtimeServerEventRateLimitsUpdated = {
    EventId : string;
    Type : TypeEnum;
    RateLimits : RealtimeServerEventRateLimitsUpdatedRateLimitsInner[];
  }
  //#endregion
