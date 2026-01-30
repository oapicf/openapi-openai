namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChunkingStrategyRequestParam

module CreateVectorStoreFileRequest =

  //#region CreateVectorStoreFileRequest


  type CreateVectorStoreFileRequest = {
    FileId : string;
    ChunkingStrategy : ChunkingStrategyRequestParam;
  }
  //#endregion
