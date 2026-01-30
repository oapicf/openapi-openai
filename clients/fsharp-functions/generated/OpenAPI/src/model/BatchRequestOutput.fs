namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchRequestOutputError
open OpenAPI.Model.BatchRequestOutputResponse

module BatchRequestOutput =

  //#region BatchRequestOutput

  [<CLIMutable>]
  type BatchRequestOutput = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "custom_id")>]
    CustomId : string;
    [<JsonProperty(PropertyName = "response")>]
    Response : BatchRequestOutputResponse;
    [<JsonProperty(PropertyName = "error")>]
    Error : BatchRequestOutputError;
  }

  //#endregion
