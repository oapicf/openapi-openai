namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogInviteSentData =

  //#region AuditLogInviteSentData

  [<CLIMutable>]
  type AuditLogInviteSentData = {
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
