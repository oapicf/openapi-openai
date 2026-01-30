namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CompletionUsagePromptTokensDetails =

  //#region CompletionUsagePromptTokensDetails

  [<CLIMutable>]
  type CompletionUsagePromptTokensDetails = {
    [<JsonProperty(PropertyName = "audio_tokens")>]
    AudioTokens : int;
    [<JsonProperty(PropertyName = "cached_tokens")>]
    CachedTokens : int;
  }

  //#endregion
