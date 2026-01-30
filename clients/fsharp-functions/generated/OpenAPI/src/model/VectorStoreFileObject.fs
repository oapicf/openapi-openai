namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VectorStoreFileObjectChunkingStrategy
open OpenAPI.Model.VectorStoreFileObjectLastError

module VectorStoreFileObject =

  //#region VectorStoreFileObject

  [<CLIMutable>]
  type VectorStoreFileObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "usage_bytes")>]
    UsageBytes : int;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "vector_store_id")>]
    VectorStoreId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "last_error")>]
    LastError : VectorStoreFileObjectLastError;
    [<JsonProperty(PropertyName = "chunking_strategy")>]
    ChunkingStrategy : VectorStoreFileObjectChunkingStrategy;
  }

  //#endregion
