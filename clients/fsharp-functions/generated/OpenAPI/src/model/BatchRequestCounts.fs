namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BatchRequestCounts =

  //#region BatchRequestCounts

  [<CLIMutable>]
  type BatchRequestCounts = {
    [<JsonProperty(PropertyName = "total")>]
    Total : int;
    [<JsonProperty(PropertyName = "completed")>]
    Completed : int;
    [<JsonProperty(PropertyName = "failed")>]
    Failed : int;
  }

  //#endregion
