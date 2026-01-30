namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogServiceAccountCreatedData

module AuditLogServiceAccountCreated =

  //#region AuditLogServiceAccountCreated

  [<CLIMutable>]
  type AuditLogServiceAccountCreated = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : AuditLogServiceAccountCreatedData;
  }

  //#endregion
