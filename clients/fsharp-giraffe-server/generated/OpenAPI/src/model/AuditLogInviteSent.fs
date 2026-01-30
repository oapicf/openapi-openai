namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLogInviteSentData

module AuditLogInviteSent =

  //#region AuditLogInviteSent


  type AuditLog_invite_sent = {
    Id : string;
    Data : AuditLogInviteSentData;
  }
  //#endregion
