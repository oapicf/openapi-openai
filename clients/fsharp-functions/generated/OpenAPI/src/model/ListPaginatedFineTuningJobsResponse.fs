namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuningJob

module ListPaginatedFineTuningJobsResponse =

  //#region ListPaginatedFineTuningJobsResponse

  [<CLIMutable>]
  type ListPaginatedFineTuningJobsResponse = {
    [<JsonProperty(PropertyName = "data")>]
    Data : FineTuningJob[];
    [<JsonProperty(PropertyName = "has_more")>]
    HasMore : bool;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
