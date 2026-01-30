namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AutoChunkingStrategyRequestParam
open OpenAPI.Model.StaticChunkingStrategy
open OpenAPI.Model.StaticChunkingStrategyRequestParam

module CreateVectorStoreRequestChunkingStrategy =

  //#region CreateVectorStoreRequestChunkingStrategy

  //#region enums
  type TypeEnum = AutoEnum of string  |  StaticEnum of string  
  //#endregion

  type CreateVectorStoreRequest_chunking_strategy = {
    Type : TypeEnum;
    Static : StaticChunkingStrategy;
  }
  //#endregion
