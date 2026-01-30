namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogInviteAccepted =

  //#region AuditLogInviteAccepted

  [<CLIMutable>]
  type AuditLogInviteAccepted = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
