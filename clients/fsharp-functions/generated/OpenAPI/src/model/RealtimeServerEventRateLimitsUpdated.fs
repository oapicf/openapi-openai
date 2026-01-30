namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner

module RealtimeServerEventRateLimitsUpdated =

  //#region RealtimeServerEventRateLimitsUpdated

  [<CLIMutable>]
  type RealtimeServerEventRateLimitsUpdated = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "rate_limits")>]
    RateLimits : RealtimeServerEventRateLimitsUpdatedRateLimitsInner[];
  }

  //#endregion
