namespace OpenAPI.Model

open System
open System.Collections.Generic

module AuditLogRateLimitUpdatedChangesRequested =

  //#region AuditLogRateLimitUpdatedChangesRequested


  type AuditLog_rate_limit_updated_changes_requested = {
    MaxRequestsPer1Minute : int;
    MaxTokensPer1Minute : int;
    MaxImagesPer1Minute : int;
    MaxAudioMegabytesPer1Minute : int;
    MaxRequestsPer1Day : int;
    Batch1DayMaxInputTokens : int;
  }
  //#endregion
