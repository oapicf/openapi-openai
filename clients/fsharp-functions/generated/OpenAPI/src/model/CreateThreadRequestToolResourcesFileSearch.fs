namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateThreadRequestToolResourcesFileSearchVectorStoresInner

module CreateThreadRequestToolResourcesFileSearch =

  //#region CreateThreadRequestToolResourcesFileSearch

  [<CLIMutable>]
  type CreateThreadRequestToolResourcesFileSearch = {
    [<JsonProperty(PropertyName = "vector_store_ids")>]
    VectorStoreIds : string[];
    [<JsonProperty(PropertyName = "vector_stores")>]
    VectorStores : CreateThreadRequestToolResourcesFileSearchVectorStoresInner[];
  }

  //#endregion
