namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogOrganizationUpdatedChangesRequested

module AuditLogOrganizationUpdated =

  //#region AuditLogOrganizationUpdated


  type AuditLog_organization_updated = {
    Id : string;
    ChangesRequested : AuditLogOrganizationUpdatedChangesRequested;
  }
  //#endregion
