namespace OpenAPI.Model

open System
open System.Collections.Generic

module VectorStoreExpirationAfter =

  //#region VectorStoreExpirationAfter

  //#region enums
  type AnchorEnum = LastActiveAtEnum of string  
  //#endregion

  type VectorStoreExpirationAfter = {
    Anchor : AnchorEnum;
    Days : int;
  }
  //#endregion
