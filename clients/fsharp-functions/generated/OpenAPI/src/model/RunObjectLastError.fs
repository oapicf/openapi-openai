namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunObjectLastError =

  //#region RunObjectLastError

  [<CLIMutable>]
  type RunObjectLastError = {
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
