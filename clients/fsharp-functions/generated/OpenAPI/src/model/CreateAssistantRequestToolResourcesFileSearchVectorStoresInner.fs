namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

module CreateAssistantRequestToolResourcesFileSearchVectorStoresInner =

  //#region CreateAssistantRequestToolResourcesFileSearchVectorStoresInner

  [<CLIMutable>]
  type CreateAssistantRequestToolResourcesFileSearchVectorStoresInner = {
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
    [<JsonProperty(PropertyName = "chunking_strategy")>]
    ChunkingStrategy : CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
