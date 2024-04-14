namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaObject

module RunStepStreamEventOneOf2 =

  //#region RunStepStreamEventOneOf2

  [<CLIMutable>]
  type RunStepStreamEventOneOf2 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunStepDeltaObject;
  }

  //#endregion
