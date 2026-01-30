namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogApiKeyCreatedData

module AuditLogApiKeyCreated =

  //#region AuditLogApiKeyCreated

  [<CLIMutable>]
  type AuditLogApiKeyCreated = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : AuditLogApiKeyCreatedData;
  }

  //#endregion
