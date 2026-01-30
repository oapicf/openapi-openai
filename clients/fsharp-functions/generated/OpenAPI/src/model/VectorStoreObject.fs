namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VectorStoreExpirationAfter
open OpenAPI.Model.VectorStoreObjectFileCounts
open OpenAPI.Model.int option

module VectorStoreObject =

  //#region VectorStoreObject

  [<CLIMutable>]
  type VectorStoreObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "usage_bytes")>]
    UsageBytes : int;
    [<JsonProperty(PropertyName = "file_counts")>]
    FileCounts : VectorStoreObjectFileCounts;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "expires_after")>]
    ExpiresAfter : VectorStoreExpirationAfter;
    [<JsonProperty(PropertyName = "expires_at")>]
    ExpiresAt : int option;
    [<JsonProperty(PropertyName = "last_active_at")>]
    LastActiveAt : int option;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
