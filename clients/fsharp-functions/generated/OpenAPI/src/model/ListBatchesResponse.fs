namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Batch

module ListBatchesResponse =

  //#region ListBatchesResponse

  [<CLIMutable>]
  type ListBatchesResponse = {
    [<JsonProperty(PropertyName = "data")>]
    Data : Batch[];
    [<JsonProperty(PropertyName = "first_id")>]
    FirstId : string;
    [<JsonProperty(PropertyName = "last_id")>]
    LastId : string;
    [<JsonProperty(PropertyName = "has_more")>]
    HasMore : bool;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
