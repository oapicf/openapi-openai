namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunObject

module RunStreamEventOneOf9 =

  //#region RunStreamEventOneOf9

  [<CLIMutable>]
  type RunStreamEventOneOf9 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunObject;
  }

  //#endregion
