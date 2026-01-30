namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AutoChunkingStrategyRequestParam
open OpenAPI.Model.StaticChunkingStrategy
open OpenAPI.Model.StaticChunkingStrategyRequestParam

module ChunkingStrategyRequestParam =

  //#region ChunkingStrategyRequestParam

  //#region enums
  type TypeEnum = AutoEnum of string  |  StaticEnum of string  
  //#endregion

  type ChunkingStrategyRequestParam = {
    Type : TypeEnum;
    Static : StaticChunkingStrategy;
  }
  //#endregion
