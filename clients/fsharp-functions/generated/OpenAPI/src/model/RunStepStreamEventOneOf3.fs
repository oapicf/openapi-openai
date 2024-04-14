namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf3 =

  //#region RunStepStreamEventOneOf3

  [<CLIMutable>]
  type RunStepStreamEventOneOf3 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunStepObject;
  }

  //#endregion
