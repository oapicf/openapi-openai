namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateCompletionResponseUsage =

  //#region CreateCompletionResponseUsage


  type CreateCompletionResponse_usage = {
    PromptTokens : int;
    CompletionTokens : int;
    TotalTokens : int;
  }
  //#endregion
