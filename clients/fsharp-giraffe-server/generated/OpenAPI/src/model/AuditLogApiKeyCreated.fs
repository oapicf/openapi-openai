namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogApiKeyCreatedData

module AuditLogApiKeyCreated =

  //#region AuditLogApiKeyCreated


  type AuditLog_api_key_created = {
    Id : string;
    Data : AuditLogApiKeyCreatedData;
  }
  //#endregion
