namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ModifyAssistantRequestToolResourcesFileSearch =

  //#region ModifyAssistantRequestToolResourcesFileSearch

  [<CLIMutable>]
  type ModifyAssistantRequestToolResourcesFileSearch = {
    [<JsonProperty(PropertyName = "vector_store_ids")>]
    VectorStoreIds : string[];
  }

  //#endregion
