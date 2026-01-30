namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ModifyThreadRequestToolResourcesFileSearch =

  //#region ModifyThreadRequestToolResourcesFileSearch

  [<CLIMutable>]
  type ModifyThreadRequestToolResourcesFileSearch = {
    [<JsonProperty(PropertyName = "vector_store_ids")>]
    VectorStoreIds : string[];
  }

  //#endregion
