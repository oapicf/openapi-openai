namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CompletionUsageCompletionTokensDetails
open OpenAPI.Model.CompletionUsagePromptTokensDetails

module CompletionUsage =

  //#region CompletionUsage


  type CompletionUsage = {
    CompletionTokens : int;
    PromptTokens : int;
    TotalTokens : int;
    CompletionTokensDetails : CompletionUsageCompletionTokensDetails;
    PromptTokensDetails : CompletionUsagePromptTokensDetails;
  }
  //#endregion
