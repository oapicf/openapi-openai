namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module VectorStoreFileBatchObjectFileCounts =

  //#region VectorStoreFileBatchObjectFileCounts

  [<CLIMutable>]
  type VectorStoreFileBatchObjectFileCounts = {
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
