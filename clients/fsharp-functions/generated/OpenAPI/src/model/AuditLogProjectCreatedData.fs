namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogProjectCreatedData =

  //#region AuditLogProjectCreatedData

  [<CLIMutable>]
  type AuditLogProjectCreatedData = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
  }

  //#endregion
