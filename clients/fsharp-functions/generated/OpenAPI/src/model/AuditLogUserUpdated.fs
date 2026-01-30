namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogUserUpdatedChangesRequested

module AuditLogUserUpdated =

  //#region AuditLogUserUpdated

  [<CLIMutable>]
  type AuditLogUserUpdated = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "changes_requested")>]
    ChangesRequested : AuditLogUserUpdatedChangesRequested;
  }

  //#endregion
