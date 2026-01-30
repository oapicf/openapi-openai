namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.StaticChunkingStrategy

module StaticChunkingStrategyResponseParam =

  //#region StaticChunkingStrategyResponseParam

  //#region enums
  type TypeEnum = StaticEnum of string  
  //#endregion

  type StaticChunkingStrategyResponseParam = {
    Type : TypeEnum;
    Static : StaticChunkingStrategy;
  }
  //#endregion
