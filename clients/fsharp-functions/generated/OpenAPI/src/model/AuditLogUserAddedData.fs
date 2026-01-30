namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogUserAddedData =

  //#region AuditLogUserAddedData

  [<CLIMutable>]
  type AuditLogUserAddedData = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
