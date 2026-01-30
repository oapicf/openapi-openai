namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogUserAddedData

module AuditLogUserAdded =

  //#region AuditLogUserAdded


  type AuditLog_user_added = {
    Id : string;
    Data : AuditLogUserAddedData;
  }
  //#endregion
