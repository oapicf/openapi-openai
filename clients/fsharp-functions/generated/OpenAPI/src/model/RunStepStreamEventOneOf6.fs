namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf6 =

  //#region RunStepStreamEventOneOf6

  [<CLIMutable>]
  type RunStepStreamEventOneOf6 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunStepObject;
  }

  //#endregion
