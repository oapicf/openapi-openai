namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepObject
open OpenAPI.Model.RunStepStreamEventOneOf
open OpenAPI.Model.RunStepStreamEventOneOf1
open OpenAPI.Model.RunStepStreamEventOneOf2
open OpenAPI.Model.RunStepStreamEventOneOf3
open OpenAPI.Model.RunStepStreamEventOneOf4
open OpenAPI.Model.RunStepStreamEventOneOf5
open OpenAPI.Model.RunStepStreamEventOneOf6

module RunStepStreamEvent =

  //#region RunStepStreamEvent

  [<CLIMutable>]
  type RunStepStreamEvent = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : RunStepObject;
  }

  //#endregion
