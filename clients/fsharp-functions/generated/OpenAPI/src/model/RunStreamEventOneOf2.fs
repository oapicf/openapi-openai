namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunObject

module RunStreamEventOneOf2 =

  //#region RunStreamEventOneOf2

  [<CLIMutable>]
  type RunStreamEventOneOf2 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunObject;
  }

  //#endregion
