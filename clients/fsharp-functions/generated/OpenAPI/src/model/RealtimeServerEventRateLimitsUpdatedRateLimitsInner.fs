namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventRateLimitsUpdatedRateLimitsInner =

  //#region RealtimeServerEventRateLimitsUpdatedRateLimitsInner

  [<CLIMutable>]
  type RealtimeServerEventRateLimitsUpdatedRateLimitsInner = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "limit")>]
    Limit : int;
    [<JsonProperty(PropertyName = "remaining")>]
    Remaining : int;
    [<JsonProperty(PropertyName = "reset_seconds")>]
    ResetSeconds : decimal;
  }

  //#endregion
