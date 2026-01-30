namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogOrganizationUpdatedChangesRequested

module AuditLogOrganizationUpdated =

  //#region AuditLogOrganizationUpdated

  [<CLIMutable>]
  type AuditLogOrganizationUpdated = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "changes_requested")>]
    ChangesRequested : AuditLogOrganizationUpdatedChangesRequested;
  }

  //#endregion
