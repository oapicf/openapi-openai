namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogUserAddedData

module AuditLogUserAdded =

  //#region AuditLogUserAdded

  [<CLIMutable>]
  type AuditLogUserAdded = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : AuditLogUserAddedData;
  }

  //#endregion
