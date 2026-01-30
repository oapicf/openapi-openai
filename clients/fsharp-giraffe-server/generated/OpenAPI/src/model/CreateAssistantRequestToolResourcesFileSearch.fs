namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner

module CreateAssistantRequestToolResourcesFileSearch =

  //#region CreateAssistantRequestToolResourcesFileSearch


  type CreateAssistantRequest_tool_resources_file_search = {
    VectorStoreIds : string[];
    VectorStores : CreateAssistantRequestToolResourcesFileSearchVectorStoresInner[];
  }
  //#endregion
