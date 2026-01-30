namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogApiKeyDeleted =

  //#region AuditLogApiKeyDeleted

  [<CLIMutable>]
  type AuditLogApiKeyDeleted = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
