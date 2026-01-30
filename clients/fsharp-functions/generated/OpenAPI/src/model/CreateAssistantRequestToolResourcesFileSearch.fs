namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner

module CreateAssistantRequestToolResourcesFileSearch =

  //#region CreateAssistantRequestToolResourcesFileSearch

  [<CLIMutable>]
  type CreateAssistantRequestToolResourcesFileSearch = {
    [<JsonProperty(PropertyName = "vector_store_ids")>]
    VectorStoreIds : string[];
    [<JsonProperty(PropertyName = "vector_stores")>]
    VectorStores : CreateAssistantRequestToolResourcesFileSearchVectorStoresInner[];
  }

  //#endregion
