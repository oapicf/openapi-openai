namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunStepCompletionUsage =

  //#region RunStepCompletionUsage


  type RunStepCompletionUsage = {
    CompletionTokens : int;
    PromptTokens : int;
    TotalTokens : int;
  }
  //#endregion
