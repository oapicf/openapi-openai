namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OtherChunkingStrategyResponseParam
open OpenAPI.Model.StaticChunkingStrategy
open OpenAPI.Model.StaticChunkingStrategyResponseParam

module VectorStoreFileObjectChunkingStrategy =

  //#region VectorStoreFileObjectChunkingStrategy

  //#region enums
  type TypeEnum = StaticEnum of string  |  OtherEnum of string  
  //#endregion

  type VectorStoreFileObject_chunking_strategy = {
    Type : TypeEnum;
    Static : StaticChunkingStrategy;
  }
  //#endregion
