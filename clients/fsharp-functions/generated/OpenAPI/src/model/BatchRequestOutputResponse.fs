namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BatchRequestOutputResponse =

  //#region BatchRequestOutputResponse

  [<CLIMutable>]
  type BatchRequestOutputResponse = {
    [<JsonProperty(PropertyName = "status_code")>]
    StatusCode : int;
    [<JsonProperty(PropertyName = "request_id")>]
    RequestId : string;
    [<JsonProperty(PropertyName = "body")>]
    Body : obj;
  }

  //#endregion
