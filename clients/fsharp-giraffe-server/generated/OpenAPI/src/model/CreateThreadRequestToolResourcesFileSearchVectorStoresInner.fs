namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

module CreateThreadRequestToolResourcesFileSearchVectorStoresInner =

  //#region CreateThreadRequestToolResourcesFileSearchVectorStoresInner


  type CreateThreadRequest_tool_resources_file_search_vector_stores_inner = {
    FileIds : string[];
    ChunkingStrategy : CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;
    Metadata : obj;
  }
  //#endregion
