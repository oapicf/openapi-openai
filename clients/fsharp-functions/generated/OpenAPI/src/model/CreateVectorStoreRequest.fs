namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateVectorStoreRequestChunkingStrategy
open OpenAPI.Model.VectorStoreExpirationAfter

module CreateVectorStoreRequest =

  //#region CreateVectorStoreRequest

  [<CLIMutable>]
  type CreateVectorStoreRequest = {
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "expires_after")>]
    ExpiresAfter : VectorStoreExpirationAfter;
    [<JsonProperty(PropertyName = "chunking_strategy")>]
    ChunkingStrategy : CreateVectorStoreRequestChunkingStrategy;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
