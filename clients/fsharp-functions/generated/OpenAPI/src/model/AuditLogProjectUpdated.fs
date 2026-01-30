namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogProjectUpdatedChangesRequested

module AuditLogProjectUpdated =

  //#region AuditLogProjectUpdated

  [<CLIMutable>]
  type AuditLogProjectUpdated = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "changes_requested")>]
    ChangesRequested : AuditLogProjectUpdatedChangesRequested;
  }

  //#endregion
