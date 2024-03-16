namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateEmbeddingResponseUsage =

  //#region CreateEmbeddingResponseUsage

  [<CLIMutable>]
  type CreateEmbeddingResponseUsage = {
    [<JsonProperty(PropertyName = "prompt_tokens")>]
    PromptTokens : int;
    [<JsonProperty(PropertyName = "total_tokens")>]
    TotalTokens : int;
  }

  //#endregion
