namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Project

module ProjectListResponse =

  //#region ProjectListResponse

  [<CLIMutable>]
  type ProjectListResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : Project[];
    [<JsonProperty(PropertyName = "first_id")>]
    FirstId : string;
    [<JsonProperty(PropertyName = "last_id")>]
    LastId : string;
    [<JsonProperty(PropertyName = "has_more")>]
    HasMore : bool;
  }

  //#endregion
