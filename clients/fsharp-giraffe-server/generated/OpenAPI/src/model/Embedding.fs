namespace OpenAPI.Model

open System
open System.Collections.Generic

module Embedding =

  //#region Embedding

  //#region enums
  type ObjectEnum = EmbeddingEnum of string  
  //#endregion

  type Embedding = {
    Index : int;
    _Embedding : decimal[];
    Object : ObjectEnum;
  }
  //#endregion
