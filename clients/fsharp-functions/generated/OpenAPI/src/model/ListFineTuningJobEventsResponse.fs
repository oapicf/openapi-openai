namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuningJobEvent

module ListFineTuningJobEventsResponse =

  //#region ListFineTuningJobEventsResponse

  [<CLIMutable>]
  type ListFineTuningJobEventsResponse = {
    [<JsonProperty(PropertyName = "data")>]
    Data : FineTuningJobEvent[];
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
