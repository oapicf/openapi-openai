namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogServiceAccountUpdatedChangesRequested

module AuditLogServiceAccountUpdated =

  //#region AuditLogServiceAccountUpdated

  [<CLIMutable>]
  type AuditLogServiceAccountUpdated = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "changes_requested")>]
    ChangesRequested : AuditLogServiceAccountUpdatedChangesRequested;
  }

  //#endregion
