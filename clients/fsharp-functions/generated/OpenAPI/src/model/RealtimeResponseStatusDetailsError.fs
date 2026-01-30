namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeResponseStatusDetailsError =

  //#region RealtimeResponseStatusDetailsError

  [<CLIMutable>]
  type RealtimeResponseStatusDetailsError = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
  }

  //#endregion
