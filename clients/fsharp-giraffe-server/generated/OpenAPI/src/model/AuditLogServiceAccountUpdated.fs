namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogServiceAccountUpdatedChangesRequested

module AuditLogServiceAccountUpdated =

  //#region AuditLogServiceAccountUpdated


  type AuditLog_service_account_updated = {
    Id : string;
    ChangesRequested : AuditLogServiceAccountUpdatedChangesRequested;
  }
  //#endregion
