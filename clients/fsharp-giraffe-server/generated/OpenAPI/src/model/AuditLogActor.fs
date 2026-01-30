namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogActorApiKey
open OpenAPI.Model.AuditLogActorSession

module AuditLogActor =

  //#region AuditLogActor

  //#region enums
  type TypeEnum = SessionEnum of string  |  ApiKeyEnum of string  
  //#endregion

  type AuditLogActor = {
    Type : TypeEnum;
    Session : AuditLogActorSession;
    ApiKey : AuditLogActorApiKey;
  }
  //#endregion
