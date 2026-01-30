namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module UsageVectorStoresResult =

  //#region UsageVectorStoresResult

  [<CLIMutable>]
  type UsageVectorStoresResult = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "usage_bytes")>]
    UsageBytes : int;
    [<JsonProperty(PropertyName = "project_id")>]
    ProjectId : string option;
  }

  //#endregion
