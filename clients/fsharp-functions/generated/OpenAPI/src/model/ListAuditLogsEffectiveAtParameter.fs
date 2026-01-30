namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ListAuditLogsEffectiveAtParameter =

  //#region ListAuditLogsEffectiveAtParameter

  [<CLIMutable>]
  type ListAuditLogsEffectiveAtParameter = {
    [<JsonProperty(PropertyName = "gt")>]
    Gt : int;
    [<JsonProperty(PropertyName = "gte")>]
    Gte : int;
    [<JsonProperty(PropertyName = "lt")>]
    Lt : int;
    [<JsonProperty(PropertyName = "lte")>]
    Lte : int;
  }

  //#endregion
