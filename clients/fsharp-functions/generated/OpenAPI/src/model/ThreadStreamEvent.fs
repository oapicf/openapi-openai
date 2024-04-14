namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ThreadObject
open OpenAPI.Model.ThreadStreamEventOneOf

module ThreadStreamEvent =

  //#region ThreadStreamEvent

  [<CLIMutable>]
  type ThreadStreamEvent = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : ThreadObject;
  }

  //#endregion
