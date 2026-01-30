namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

module CreateThreadRequestToolResourcesFileSearchVectorStoresInner =

  //#region CreateThreadRequestToolResourcesFileSearchVectorStoresInner

  [<CLIMutable>]
  type CreateThreadRequestToolResourcesFileSearchVectorStoresInner = {
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
    [<JsonProperty(PropertyName = "chunking_strategy")>]
    ChunkingStrategy : CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
