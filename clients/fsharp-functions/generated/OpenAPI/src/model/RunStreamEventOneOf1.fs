namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunObject

module RunStreamEventOneOf1 =

  //#region RunStreamEventOneOf1

  [<CLIMutable>]
  type RunStreamEventOneOf1 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunObject;
  }

  //#endregion
