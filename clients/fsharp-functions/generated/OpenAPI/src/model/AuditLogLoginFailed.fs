namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogLoginFailed =

  //#region AuditLogLoginFailed

  [<CLIMutable>]
  type AuditLogLoginFailed = {
    [<JsonProperty(PropertyName = "error_code")>]
    ErrorCode : string;
    [<JsonProperty(PropertyName = "error_message")>]
    ErrorMessage : string;
  }

  //#endregion
