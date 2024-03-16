namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FineTuneEvent =

  //#region FineTuneEvent

  [<CLIMutable>]
  type FineTuneEvent = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "level")>]
    Level : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
