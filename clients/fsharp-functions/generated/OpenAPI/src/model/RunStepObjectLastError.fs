namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunStepObjectLastError =

  //#region RunStepObjectLastError

  [<CLIMutable>]
  type RunStepObjectLastError = {
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
