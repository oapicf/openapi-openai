namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogRateLimitUpdatedChangesRequested

module AuditLogRateLimitUpdated =

  //#region AuditLogRateLimitUpdated

  [<CLIMutable>]
  type AuditLogRateLimitUpdated = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "changes_requested")>]
    ChangesRequested : AuditLogRateLimitUpdatedChangesRequested;
  }

  //#endregion
