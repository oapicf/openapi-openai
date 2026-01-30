namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.StaticChunkingStrategyStatic

module StaticChunkingStrategy =

  //#region StaticChunkingStrategy

  //#region enums
  type TypeEnum = StaticEnum of string  
  //#endregion

  type Static_Chunking_Strategy = {
    Type : TypeEnum;
    Static : StaticChunkingStrategyStatic;
  }
  //#endregion
