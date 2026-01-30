namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AutoChunkingStrategy
open OpenAPI.Model.StaticChunkingStrategy
open OpenAPI.Model.StaticChunkingStrategyStatic

module CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy =

  //#region CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

  //#region enums
  type TypeEnum = AutoEnum of string  |  StaticEnum of string  
  //#endregion

  type CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy = {
    Type : TypeEnum;
    Static : StaticChunkingStrategyStatic;
  }
  //#endregion
