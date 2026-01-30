namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogOrganizationUpdatedChangesRequestedSettings

module AuditLogOrganizationUpdatedChangesRequested =

  //#region AuditLogOrganizationUpdatedChangesRequested

  [<CLIMutable>]
  type AuditLogOrganizationUpdatedChangesRequested = {
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "settings")>]
    Settings : AuditLogOrganizationUpdatedChangesRequestedSettings;
  }

  //#endregion
