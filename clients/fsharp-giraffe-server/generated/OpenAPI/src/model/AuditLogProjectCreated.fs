namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogProjectCreatedData

module AuditLogProjectCreated =

  //#region AuditLogProjectCreated


  type AuditLog_project_created = {
    Id : string;
    Data : AuditLogProjectCreatedData;
  }
  //#endregion
