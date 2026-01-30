namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VectorStoreFileBatchObjectFileCounts

module VectorStoreFileBatchObject =

  //#region VectorStoreFileBatchObject

  //#region enums
  type ObjectEnum = VectorStoreFilesBatchEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = InProgressEnum of string  |  CompletedEnum of string  |  CancelledEnum of string  |  FailedEnum of string  
  //#endregion

  type VectorStoreFileBatchObject = {
    Id : string;
    Object : ObjectEnum;
    CreatedAt : int;
    VectorStoreId : string;
    Status : StatusEnum;
    FileCounts : VectorStoreFileBatchObjectFileCounts;
  }
  //#endregion
