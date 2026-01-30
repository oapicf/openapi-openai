namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeResponseUsageInputTokenDetails
open OpenAPI.Model.RealtimeResponseUsageOutputTokenDetails

module RealtimeResponseUsage =

  //#region RealtimeResponseUsage


  type RealtimeResponse_usage = {
    TotalTokens : int;
    InputTokens : int;
    OutputTokens : int;
    InputTokenDetails : RealtimeResponseUsageInputTokenDetails;
    OutputTokenDetails : RealtimeResponseUsageOutputTokenDetails;
  }
  //#endregion
