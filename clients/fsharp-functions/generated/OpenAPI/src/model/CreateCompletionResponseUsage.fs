namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateCompletionResponseUsage =

  //#region CreateCompletionResponseUsage

  [<CLIMutable>]
  type CreateCompletionResponseUsage = {
    [<JsonProperty(PropertyName = "prompt_tokens")>]
    PromptTokens : int;
    [<JsonProperty(PropertyName = "completion_tokens")>]
    CompletionTokens : int;
    [<JsonProperty(PropertyName = "total_tokens")>]
    TotalTokens : int;
  }

  //#endregion
