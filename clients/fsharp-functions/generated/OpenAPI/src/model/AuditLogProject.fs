namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogProject =

  //#region AuditLogProject

  [<CLIMutable>]
  type AuditLogProject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
