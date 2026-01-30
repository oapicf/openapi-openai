namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VectorStoreFileBatchObjectFileCounts

module VectorStoreFileBatchObject =

  //#region VectorStoreFileBatchObject

  [<CLIMutable>]
  type VectorStoreFileBatchObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "vector_store_id")>]
    VectorStoreId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "file_counts")>]
    FileCounts : VectorStoreFileBatchObjectFileCounts;
  }

  //#endregion
