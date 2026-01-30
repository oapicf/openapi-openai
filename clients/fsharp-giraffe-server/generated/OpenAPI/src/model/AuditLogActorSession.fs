namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogActorUser

module AuditLogActorSession =

  //#region AuditLogActorSession


  type AuditLogActorSession = {
    User : AuditLogActorUser;
    IpAddress : string;
  }
  //#endregion
