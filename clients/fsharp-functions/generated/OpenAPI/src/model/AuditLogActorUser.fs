namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogActorUser =

  //#region AuditLogActorUser

  [<CLIMutable>]
  type AuditLogActorUser = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
  }

  //#endregion
