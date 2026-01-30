namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogServiceAccountUpdatedChangesRequested =

  //#region AuditLogServiceAccountUpdatedChangesRequested

  [<CLIMutable>]
  type AuditLogServiceAccountUpdatedChangesRequested = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
