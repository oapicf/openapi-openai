namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeResponseUsageInputTokenDetails =

  //#region RealtimeResponseUsageInputTokenDetails

  [<CLIMutable>]
  type RealtimeResponseUsageInputTokenDetails = {
    [<JsonProperty(PropertyName = "cached_tokens")>]
    CachedTokens : int;
    [<JsonProperty(PropertyName = "text_tokens")>]
    TextTokens : int;
    [<JsonProperty(PropertyName = "audio_tokens")>]
    AudioTokens : int;
  }

  //#endregion
