namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuningJobCheckpoint
open OpenAPI.Model.string option

module ListFineTuningJobCheckpointsResponse =

  //#region ListFineTuningJobCheckpointsResponse

  [<CLIMutable>]
  type ListFineTuningJobCheckpointsResponse = {
    [<JsonProperty(PropertyName = "data")>]
    Data : FineTuningJobCheckpoint[];
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "first_id")>]
    FirstId : string option;
    [<JsonProperty(PropertyName = "last_id")>]
    LastId : string option;
    [<JsonProperty(PropertyName = "has_more")>]
    HasMore : bool;
  }

  //#endregion
