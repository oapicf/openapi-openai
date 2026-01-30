namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogActorServiceAccount
open OpenAPI.Model.AuditLogActorUser

module AuditLogActorApiKey =

  //#region AuditLogActorApiKey

  [<CLIMutable>]
  type AuditLogActorApiKey = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "user")>]
    User : AuditLogActorUser;
    [<JsonProperty(PropertyName = "service_account")>]
    ServiceAccount : AuditLogActorServiceAccount;
  }

  //#endregion
