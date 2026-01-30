namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BatchRequestInput =

  //#region BatchRequestInput

  [<CLIMutable>]
  type BatchRequestInput = {
    [<JsonProperty(PropertyName = "custom_id")>]
    CustomId : string;
    [<JsonProperty(PropertyName = "method")>]
    Method : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
