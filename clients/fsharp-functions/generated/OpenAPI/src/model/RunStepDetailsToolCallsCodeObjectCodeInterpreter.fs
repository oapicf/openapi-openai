namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

module RunStepDetailsToolCallsCodeObjectCodeInterpreter =

  //#region RunStepDetailsToolCallsCodeObjectCodeInterpreter

  [<CLIMutable>]
  type RunStepDetailsToolCallsCodeObjectCodeInterpreter = {
    [<JsonProperty(PropertyName = "input")>]
    Input : string;
    [<JsonProperty(PropertyName = "outputs")>]
    Outputs : RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner[];
  }

  //#endregion
