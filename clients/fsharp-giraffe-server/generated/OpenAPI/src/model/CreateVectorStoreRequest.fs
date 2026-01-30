namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateVectorStoreRequestChunkingStrategy
open OpenAPI.Model.VectorStoreExpirationAfter

module CreateVectorStoreRequest =

  //#region CreateVectorStoreRequest


  type CreateVectorStoreRequest = {
    FileIds : string[];
    Name : string;
    ExpiresAfter : VectorStoreExpirationAfter;
    ChunkingStrategy : CreateVectorStoreRequestChunkingStrategy;
    Metadata : obj;
  }
  //#endregion
