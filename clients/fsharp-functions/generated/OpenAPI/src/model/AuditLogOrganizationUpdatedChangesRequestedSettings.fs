namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogOrganizationUpdatedChangesRequestedSettings =

  //#region AuditLogOrganizationUpdatedChangesRequestedSettings

  [<CLIMutable>]
  type AuditLogOrganizationUpdatedChangesRequestedSettings = {
    [<JsonProperty(PropertyName = "threads_ui_visibility")>]
    ThreadsUiVisibility : string;
    [<JsonProperty(PropertyName = "usage_dashboard_visibility")>]
    UsageDashboardVisibility : string;
  }

  //#endregion
