namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf1 =

  //#region RunStepStreamEventOneOf1

  [<CLIMutable>]
  type RunStepStreamEventOneOf1 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunStepObject;
  }

  //#endregion
