namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DefaultProjectErrorResponse =

  //#region DefaultProjectErrorResponse

  [<CLIMutable>]
  type DefaultProjectErrorResponse = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
