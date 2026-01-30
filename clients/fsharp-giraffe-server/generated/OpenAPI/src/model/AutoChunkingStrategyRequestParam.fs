namespace OpenAPI.Model

open System
open System.Collections.Generic

module AutoChunkingStrategyRequestParam =

  //#region AutoChunkingStrategyRequestParam

  //#region enums
  type TypeEnum = AutoEnum of string  
  //#endregion

  type AutoChunkingStrategyRequestParam = {
    Type : TypeEnum;
  }
  //#endregion
