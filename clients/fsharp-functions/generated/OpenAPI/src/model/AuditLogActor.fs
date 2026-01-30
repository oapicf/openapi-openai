namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogActorApiKey
open OpenAPI.Model.AuditLogActorSession

module AuditLogActor =

  //#region AuditLogActor

  [<CLIMutable>]
  type AuditLogActor = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "session")>]
    Session : AuditLogActorSession;
    [<JsonProperty(PropertyName = "api_key")>]
    ApiKey : AuditLogActorApiKey;
  }

  //#endregion
