namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunObject

module RunStreamEventOneOf3 =

  //#region RunStreamEventOneOf3

  [<CLIMutable>]
  type RunStreamEventOneOf3 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunObject;
  }

  //#endregion
