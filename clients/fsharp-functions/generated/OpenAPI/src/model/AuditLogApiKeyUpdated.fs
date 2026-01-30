namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogApiKeyUpdatedChangesRequested

module AuditLogApiKeyUpdated =

  //#region AuditLogApiKeyUpdated

  [<CLIMutable>]
  type AuditLogApiKeyUpdated = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "changes_requested")>]
    ChangesRequested : AuditLogApiKeyUpdatedChangesRequested;
  }

  //#endregion
