namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf5 =

  //#region RunStepStreamEventOneOf5

  [<CLIMutable>]
  type RunStepStreamEventOneOf5 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunStepObject;
  }

  //#endregion
