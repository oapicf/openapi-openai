namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogProjectUpdatedChangesRequested =

  //#region AuditLogProjectUpdatedChangesRequested

  [<CLIMutable>]
  type AuditLogProjectUpdatedChangesRequested = {
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
  }

  //#endregion
