namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssistantObjectToolResourcesFileSearch =

  //#region AssistantObjectToolResourcesFileSearch

  [<CLIMutable>]
  type AssistantObjectToolResourcesFileSearch = {
    [<JsonProperty(PropertyName = "vector_store_ids")>]
    VectorStoreIds : string[];
  }

  //#endregion
