namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuneEvent

module ListFineTuneEventsResponse =

  //#region ListFineTuneEventsResponse

  [<CLIMutable>]
  type ListFineTuneEventsResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : FineTuneEvent[];
  }

  //#endregion
