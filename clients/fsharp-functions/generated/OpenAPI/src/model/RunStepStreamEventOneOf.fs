namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf =

  //#region RunStepStreamEventOneOf

  [<CLIMutable>]
  type RunStepStreamEventOneOf = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunStepObject;
  }

  //#endregion
