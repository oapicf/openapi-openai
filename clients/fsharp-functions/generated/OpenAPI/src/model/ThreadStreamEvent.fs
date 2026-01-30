namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ThreadObject

module ThreadStreamEvent =

  //#region ThreadStreamEvent

  [<CLIMutable>]
  type ThreadStreamEvent = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : bool;
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : ThreadObject;
  }

  //#endregion
