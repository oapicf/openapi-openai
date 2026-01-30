namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChunkingStrategyRequestParam

module CreateVectorStoreFileBatchRequest =

  //#region CreateVectorStoreFileBatchRequest

  [<CLIMutable>]
  type CreateVectorStoreFileBatchRequest = {
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
    [<JsonProperty(PropertyName = "chunking_strategy")>]
    ChunkingStrategy : ChunkingStrategyRequestParam;
  }

  //#endregion
