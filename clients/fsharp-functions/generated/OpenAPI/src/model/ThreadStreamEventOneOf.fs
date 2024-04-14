namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ThreadObject

module ThreadStreamEventOneOf =

  //#region ThreadStreamEventOneOf

  [<CLIMutable>]
  type ThreadStreamEventOneOf = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : ThreadObject;
  }

  //#endregion
