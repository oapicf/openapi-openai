namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogUserDeleted =

  //#region AuditLogUserDeleted

  [<CLIMutable>]
  type AuditLogUserDeleted = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
