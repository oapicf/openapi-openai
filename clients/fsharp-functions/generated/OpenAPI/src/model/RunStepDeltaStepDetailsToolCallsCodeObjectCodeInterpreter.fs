namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

module RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter =

  //#region RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

  [<CLIMutable>]
  type RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter = {
    [<JsonProperty(PropertyName = "input")>]
    Input : string;
    [<JsonProperty(PropertyName = "outputs")>]
    Outputs : RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner[];
  }

  //#endregion
