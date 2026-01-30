namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogProjectUpdatedChangesRequested

module AuditLogProjectUpdated =

  //#region AuditLogProjectUpdated


  type AuditLog_project_updated = {
    Id : string;
    ChangesRequested : AuditLogProjectUpdatedChangesRequested;
  }
  //#endregion
