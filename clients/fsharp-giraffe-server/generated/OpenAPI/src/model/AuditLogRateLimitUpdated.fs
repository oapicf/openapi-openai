namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogRateLimitUpdatedChangesRequested

module AuditLogRateLimitUpdated =

  //#region AuditLogRateLimitUpdated


  type AuditLog_rate_limit_updated = {
    Id : string;
    ChangesRequested : AuditLogRateLimitUpdatedChangesRequested;
  }
  //#endregion
