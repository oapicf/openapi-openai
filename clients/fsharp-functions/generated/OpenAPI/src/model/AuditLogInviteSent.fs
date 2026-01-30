namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogInviteSentData

module AuditLogInviteSent =

  //#region AuditLogInviteSent

  [<CLIMutable>]
  type AuditLogInviteSent = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : AuditLogInviteSentData;
  }

  //#endregion
