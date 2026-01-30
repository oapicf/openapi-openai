namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateThreadRequestToolResourcesFileSearchVectorStoresInner

module CreateThreadRequestToolResourcesFileSearch =

  //#region CreateThreadRequestToolResourcesFileSearch


  type CreateThreadRequest_tool_resources_file_search = {
    VectorStoreIds : string[];
    VectorStores : CreateThreadRequestToolResourcesFileSearchVectorStoresInner[];
  }
  //#endregion
