namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogActorServiceAccount =

  //#region AuditLogActorServiceAccount

  [<CLIMutable>]
  type AuditLogActorServiceAccount = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
