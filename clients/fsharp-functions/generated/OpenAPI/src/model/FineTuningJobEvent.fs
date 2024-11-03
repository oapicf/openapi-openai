namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FineTuningJobEvent =

  //#region FineTuningJobEvent

  [<CLIMutable>]
  type FineTuningJobEvent = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "level")>]
    Level : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
