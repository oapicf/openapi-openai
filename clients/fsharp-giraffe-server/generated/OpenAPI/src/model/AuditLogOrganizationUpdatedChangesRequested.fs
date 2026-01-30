namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogOrganizationUpdatedChangesRequestedSettings

module AuditLogOrganizationUpdatedChangesRequested =

  //#region AuditLogOrganizationUpdatedChangesRequested


  type AuditLog_organization_updated_changes_requested = {
    Title : string;
    Description : string;
    Name : string;
    Settings : AuditLogOrganizationUpdatedChangesRequestedSettings;
  }
  //#endregion
