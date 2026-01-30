namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogApiKeyUpdatedChangesRequested =

  //#region AuditLogApiKeyUpdatedChangesRequested

  [<CLIMutable>]
  type AuditLogApiKeyUpdatedChangesRequested = {
    [<JsonProperty(PropertyName = "scopes")>]
    Scopes : string[];
  }

  //#endregion
