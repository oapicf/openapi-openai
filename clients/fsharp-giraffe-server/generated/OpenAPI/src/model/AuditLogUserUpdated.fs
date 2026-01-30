namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogUserUpdatedChangesRequested

module AuditLogUserUpdated =

  //#region AuditLogUserUpdated


  type AuditLog_user_updated = {
    Id : string;
    ChangesRequested : AuditLogUserUpdatedChangesRequested;
  }
  //#endregion
