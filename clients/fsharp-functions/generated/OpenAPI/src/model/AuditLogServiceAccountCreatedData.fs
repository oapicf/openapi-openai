namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogServiceAccountCreatedData =

  //#region AuditLogServiceAccountCreatedData

  [<CLIMutable>]
  type AuditLogServiceAccountCreatedData = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
