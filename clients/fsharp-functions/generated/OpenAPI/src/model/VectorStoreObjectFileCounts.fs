namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module VectorStoreObjectFileCounts =

  //#region VectorStoreObjectFileCounts

  [<CLIMutable>]
  type VectorStoreObjectFileCounts = {
    [<JsonProperty(PropertyName = "in_progress")>]
    InProgress : int;
    [<JsonProperty(PropertyName = "completed")>]
    Completed : int;
    [<JsonProperty(PropertyName = "failed")>]
    Failed : int;
    [<JsonProperty(PropertyName = "cancelled")>]
    Cancelled : int;
    [<JsonProperty(PropertyName = "total")>]
    Total : int;
  }

  //#endregion
