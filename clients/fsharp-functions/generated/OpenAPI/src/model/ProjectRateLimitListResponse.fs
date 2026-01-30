namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProjectRateLimit

module ProjectRateLimitListResponse =

  //#region ProjectRateLimitListResponse

  [<CLIMutable>]
  type ProjectRateLimitListResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : ProjectRateLimit[];
    [<JsonProperty(PropertyName = "first_id")>]
    FirstId : string;
    [<JsonProperty(PropertyName = "last_id")>]
    LastId : string;
    [<JsonProperty(PropertyName = "has_more")>]
    HasMore : bool;
  }

  //#endregion
