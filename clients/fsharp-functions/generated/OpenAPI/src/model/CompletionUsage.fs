namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CompletionUsageCompletionTokensDetails
open OpenAPI.Model.CompletionUsagePromptTokensDetails

module CompletionUsage =

  //#region CompletionUsage

  [<CLIMutable>]
  type CompletionUsage = {
    [<JsonProperty(PropertyName = "completion_tokens")>]
    CompletionTokens : int;
    [<JsonProperty(PropertyName = "prompt_tokens")>]
    PromptTokens : int;
    [<JsonProperty(PropertyName = "total_tokens")>]
    TotalTokens : int;
    [<JsonProperty(PropertyName = "completion_tokens_details")>]
    CompletionTokensDetails : CompletionUsageCompletionTokensDetails;
    [<JsonProperty(PropertyName = "prompt_tokens_details")>]
    PromptTokensDetails : CompletionUsagePromptTokensDetails;
  }

  //#endregion
