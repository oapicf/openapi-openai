namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UsageTimeBucket

module UsageResponse =

  //#region UsageResponse

  [<CLIMutable>]
  type UsageResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : UsageTimeBucket[];
    [<JsonProperty(PropertyName = "has_more")>]
    HasMore : bool;
    [<JsonProperty(PropertyName = "next_page")>]
    NextPage : string;
  }

  //#endregion
