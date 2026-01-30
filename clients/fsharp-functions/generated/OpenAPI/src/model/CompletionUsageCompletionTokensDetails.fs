namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CompletionUsageCompletionTokensDetails =

  //#region CompletionUsageCompletionTokensDetails

  [<CLIMutable>]
  type CompletionUsageCompletionTokensDetails = {
    [<JsonProperty(PropertyName = "accepted_prediction_tokens")>]
    AcceptedPredictionTokens : int;
    [<JsonProperty(PropertyName = "audio_tokens")>]
    AudioTokens : int;
    [<JsonProperty(PropertyName = "reasoning_tokens")>]
    ReasoningTokens : int;
    [<JsonProperty(PropertyName = "rejected_prediction_tokens")>]
    RejectedPredictionTokens : int;
  }

  //#endregion
