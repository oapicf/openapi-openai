namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogRateLimitDeleted =

  //#region AuditLogRateLimitDeleted

  [<CLIMutable>]
  type AuditLogRateLimitDeleted = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
