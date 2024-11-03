namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Error

module ErrorResponse =

  //#region ErrorResponse

  [<CLIMutable>]
  type ErrorResponse = {
    [<JsonProperty(PropertyName = "error")>]
    Error : Error;
  }

  //#endregion
