namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogActorServiceAccount
open OpenAPI.Model.AuditLogActorUser

module AuditLogActorApiKey =

  //#region AuditLogActorApiKey

  //#region enums
  type TypeEnum = UserEnum of string  |  ServiceAccountEnum of string  
  //#endregion

  type AuditLogActorApiKey = {
    Id : string;
    Type : TypeEnum;
    User : AuditLogActorUser;
    ServiceAccount : AuditLogActorServiceAccount;
  }
  //#endregion
