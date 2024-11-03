namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaObjectDeltaStepDetails

module RunStepDeltaObjectDelta =

  //#region RunStepDeltaObjectDelta

  [<CLIMutable>]
  type RunStepDeltaObjectDelta = {
    [<JsonProperty(PropertyName = "step_details")>]
    StepDetails : RunStepDeltaObjectDeltaStepDetails;
  }

  //#endregion
