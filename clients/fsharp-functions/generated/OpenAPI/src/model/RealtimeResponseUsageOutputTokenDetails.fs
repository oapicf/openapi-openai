namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeResponseUsageOutputTokenDetails =

  //#region RealtimeResponseUsageOutputTokenDetails

  [<CLIMutable>]
  type RealtimeResponseUsageOutputTokenDetails = {
    [<JsonProperty(PropertyName = "text_tokens")>]
    TextTokens : int;
    [<JsonProperty(PropertyName = "audio_tokens")>]
    AudioTokens : int;
  }

  //#endregion
