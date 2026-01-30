namespace OpenAPI.Model

open System
open System.Collections.Generic

module AutoChunkingStrategy =

  //#region AutoChunkingStrategy

  //#region enums
  type TypeEnum = AutoEnum of string  
  //#endregion

  type Auto_Chunking_Strategy = {
    Type : TypeEnum;
  }
  //#endregion
