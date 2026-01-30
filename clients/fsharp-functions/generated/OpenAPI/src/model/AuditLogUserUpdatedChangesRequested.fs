namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogUserUpdatedChangesRequested =

  //#region AuditLogUserUpdatedChangesRequested

  [<CLIMutable>]
  type AuditLogUserUpdatedChangesRequested = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
