namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

module RunStepDeltaStepDetailsToolCallsObject =

  //#region RunStepDeltaStepDetailsToolCallsObject

  [<CLIMutable>]
  type RunStepDeltaStepDetailsToolCallsObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "tool_calls")>]
    ToolCalls : RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[];
  }

  //#endregion
