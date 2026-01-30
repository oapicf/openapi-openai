namespace OpenAPI.Model

open System
open System.Collections.Generic

module CompletionUsageCompletionTokensDetails =

  //#region CompletionUsageCompletionTokensDetails


  type CompletionUsage_completion_tokens_details = {
    AcceptedPredictionTokens : int;
    AudioTokens : int;
    ReasoningTokens : int;
    RejectedPredictionTokens : int;
  }
  //#endregion
