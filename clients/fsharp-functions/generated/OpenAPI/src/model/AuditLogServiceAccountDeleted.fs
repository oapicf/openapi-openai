namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogServiceAccountDeleted =

  //#region AuditLogServiceAccountDeleted

  [<CLIMutable>]
  type AuditLogServiceAccountDeleted = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
