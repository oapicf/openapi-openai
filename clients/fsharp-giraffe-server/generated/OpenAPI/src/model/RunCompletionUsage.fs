namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunCompletionUsage =

  //#region RunCompletionUsage


  type RunCompletionUsage = {
    CompletionTokens : int;
    PromptTokens : int;
    TotalTokens : int;
  }
  //#endregion
