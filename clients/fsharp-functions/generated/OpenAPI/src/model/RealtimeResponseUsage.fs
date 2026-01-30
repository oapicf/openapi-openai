namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeResponseUsageInputTokenDetails
open OpenAPI.Model.RealtimeResponseUsageOutputTokenDetails

module RealtimeResponseUsage =

  //#region RealtimeResponseUsage

  [<CLIMutable>]
  type RealtimeResponseUsage = {
    [<JsonProperty(PropertyName = "total_tokens")>]
    TotalTokens : int;
    [<JsonProperty(PropertyName = "input_tokens")>]
    InputTokens : int;
    [<JsonProperty(PropertyName = "output_tokens")>]
    OutputTokens : int;
    [<JsonProperty(PropertyName = "input_token_details")>]
    InputTokenDetails : RealtimeResponseUsageInputTokenDetails;
    [<JsonProperty(PropertyName = "output_token_details")>]
    OutputTokenDetails : RealtimeResponseUsageOutputTokenDetails;
  }

  //#endregion
