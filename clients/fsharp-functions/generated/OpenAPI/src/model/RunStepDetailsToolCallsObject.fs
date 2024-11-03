namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsToolCallsObjectToolCallsInner

module RunStepDetailsToolCallsObject =

  //#region RunStepDetailsToolCallsObject

  [<CLIMutable>]
  type RunStepDetailsToolCallsObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "tool_calls")>]
    ToolCalls : RunStepDetailsToolCallsObjectToolCallsInner[];
  }

  //#endregion
