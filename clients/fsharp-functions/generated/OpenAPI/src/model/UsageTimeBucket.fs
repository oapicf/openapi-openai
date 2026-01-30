namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UsageTimeBucketResultInner

module UsageTimeBucket =

  //#region UsageTimeBucket

  [<CLIMutable>]
  type UsageTimeBucket = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : int;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int;
    [<JsonProperty(PropertyName = "result")>]
    Result : UsageTimeBucketResultInner[];
  }

  //#endregion
