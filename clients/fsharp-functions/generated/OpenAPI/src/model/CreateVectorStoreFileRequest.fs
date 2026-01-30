namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChunkingStrategyRequestParam

module CreateVectorStoreFileRequest =

  //#region CreateVectorStoreFileRequest

  [<CLIMutable>]
  type CreateVectorStoreFileRequest = {
    [<JsonProperty(PropertyName = "file_id")>]
    FileId : string;
    [<JsonProperty(PropertyName = "chunking_strategy")>]
    ChunkingStrategy : ChunkingStrategyRequestParam;
  }

  //#endregion
