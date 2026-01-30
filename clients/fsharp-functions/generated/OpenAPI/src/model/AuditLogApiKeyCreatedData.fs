namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogApiKeyCreatedData =

  //#region AuditLogApiKeyCreatedData

  [<CLIMutable>]
  type AuditLogApiKeyCreatedData = {
    [<JsonProperty(PropertyName = "scopes")>]
    Scopes : string[];
  }

  //#endregion
