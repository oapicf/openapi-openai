namespace OpenAPI.Model

open System
open System.Collections.Generic

module CompletionUsage =

  //#region CompletionUsage


  type CompletionUsage = {
    CompletionTokens : int;
    PromptTokens : int;
    TotalTokens : int;
  }
  //#endregion
