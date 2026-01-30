namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogProjectArchived =

  //#region AuditLogProjectArchived

  [<CLIMutable>]
  type AuditLogProjectArchived = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
