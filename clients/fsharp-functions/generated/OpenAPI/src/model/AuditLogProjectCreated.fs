namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogProjectCreatedData

module AuditLogProjectCreated =

  //#region AuditLogProjectCreated

  [<CLIMutable>]
  type AuditLogProjectCreated = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : AuditLogProjectCreatedData;
  }

  //#endregion
