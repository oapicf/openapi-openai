namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogActorUser

module AuditLogActorSession =

  //#region AuditLogActorSession

  [<CLIMutable>]
  type AuditLogActorSession = {
    [<JsonProperty(PropertyName = "user")>]
    User : AuditLogActorUser;
    [<JsonProperty(PropertyName = "ip_address")>]
    IpAddress : string;
  }

  //#endregion
