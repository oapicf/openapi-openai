namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProjectUser

module ProjectUserListResponse =

  //#region ProjectUserListResponse

  [<CLIMutable>]
  type ProjectUserListResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : ProjectUser[];
    [<JsonProperty(PropertyName = "first_id")>]
    FirstId : string;
    [<JsonProperty(PropertyName = "last_id")>]
    LastId : string;
    [<JsonProperty(PropertyName = "has_more")>]
    HasMore : bool;
  }

  //#endregion
