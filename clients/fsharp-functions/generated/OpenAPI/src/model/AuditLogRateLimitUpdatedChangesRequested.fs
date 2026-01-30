namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogRateLimitUpdatedChangesRequested =

  //#region AuditLogRateLimitUpdatedChangesRequested

  [<CLIMutable>]
  type AuditLogRateLimitUpdatedChangesRequested = {
    [<JsonProperty(PropertyName = "max_requests_per_1_minute")>]
    MaxRequestsPer1Minute : int;
    [<JsonProperty(PropertyName = "max_tokens_per_1_minute")>]
    MaxTokensPer1Minute : int;
    [<JsonProperty(PropertyName = "max_images_per_1_minute")>]
    MaxImagesPer1Minute : int;
    [<JsonProperty(PropertyName = "max_audio_megabytes_per_1_minute")>]
    MaxAudioMegabytesPer1Minute : int;
    [<JsonProperty(PropertyName = "max_requests_per_1_day")>]
    MaxRequestsPer1Day : int;
    [<JsonProperty(PropertyName = "batch_1_day_max_input_tokens")>]
    Batch1DayMaxInputTokens : int;
  }

  //#endregion
