namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateChatCompletionStreamResponseUsage =

  //#region CreateChatCompletionStreamResponseUsage

  [<CLIMutable>]
  type CreateChatCompletionStreamResponseUsage = {
    [<JsonProperty(PropertyName = "completion_tokens")>]
    CompletionTokens : int;
    [<JsonProperty(PropertyName = "prompt_tokens")>]
    PromptTokens : int;
    [<JsonProperty(PropertyName = "total_tokens")>]
    TotalTokens : int;
  }

  //#endregion
