namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VectorStoreExpirationAfter
open OpenAPI.Model.VectorStoreObjectFileCounts
open OpenAPI.Model.int option

module VectorStoreObject =

  //#region VectorStoreObject

  //#region enums
  type ObjectEnum = VectorStoreEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = ExpiredEnum of string  |  InProgressEnum of string  |  CompletedEnum of string  
  //#endregion

  type VectorStoreObject = {
    Id : string;
    Object : ObjectEnum;
    CreatedAt : int;
    Name : string;
    UsageBytes : int;
    FileCounts : VectorStoreObjectFileCounts;
    Status : StatusEnum;
    ExpiresAfter : VectorStoreExpirationAfter;
    ExpiresAt : int option;
    LastActiveAt : int option;
    Metadata : obj;
  }
  //#endregion
