namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.StaticChunkingStrategy

module StaticChunkingStrategyRequestParam =

  //#region StaticChunkingStrategyRequestParam

  //#region enums
  type TypeEnum = StaticEnum of string  
  //#endregion

  type StaticChunkingStrategyRequestParam = {
    Type : TypeEnum;
    Static : StaticChunkingStrategy;
  }
  //#endregion
