namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChunkingStrategyRequestParam

module CreateVectorStoreFileBatchRequest =

  //#region CreateVectorStoreFileBatchRequest


  type CreateVectorStoreFileBatchRequest = {
    FileIds : string[];
    ChunkingStrategy : ChunkingStrategyRequestParam;
  }
  //#endregion
