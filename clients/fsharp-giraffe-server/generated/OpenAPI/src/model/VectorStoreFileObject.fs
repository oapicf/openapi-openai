namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VectorStoreFileObjectChunkingStrategy
open OpenAPI.Model.VectorStoreFileObjectLastError

module VectorStoreFileObject =

  //#region VectorStoreFileObject

  //#region enums
  type ObjectEnum = VectorStoreFileEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = InProgressEnum of string  |  CompletedEnum of string  |  CancelledEnum of string  |  FailedEnum of string  
  //#endregion

  type VectorStoreFileObject = {
    Id : string;
    Object : ObjectEnum;
    UsageBytes : int;
    CreatedAt : int;
    VectorStoreId : string;
    Status : StatusEnum;
    LastError : VectorStoreFileObjectLastError;
    ChunkingStrategy : VectorStoreFileObjectChunkingStrategy;
  }
  //#endregion
