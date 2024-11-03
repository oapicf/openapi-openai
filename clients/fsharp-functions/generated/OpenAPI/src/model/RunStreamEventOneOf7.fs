namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunObject

module RunStreamEventOneOf7 =

  //#region RunStreamEventOneOf7

  [<CLIMutable>]
  type RunStreamEventOneOf7 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunObject;
  }

  //#endregion
