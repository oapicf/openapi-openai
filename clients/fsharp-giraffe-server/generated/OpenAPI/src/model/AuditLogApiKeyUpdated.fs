namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogApiKeyUpdatedChangesRequested

module AuditLogApiKeyUpdated =

  //#region AuditLogApiKeyUpdated


  type AuditLog_api_key_updated = {
    Id : string;
    ChangesRequested : AuditLogApiKeyUpdatedChangesRequested;
  }
  //#endregion
