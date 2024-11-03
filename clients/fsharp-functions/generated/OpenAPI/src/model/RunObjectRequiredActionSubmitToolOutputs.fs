namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunToolCallObject

module RunObjectRequiredActionSubmitToolOutputs =

  //#region RunObjectRequiredActionSubmitToolOutputs

  [<CLIMutable>]
  type RunObjectRequiredActionSubmitToolOutputs = {
    [<JsonProperty(PropertyName = "tool_calls")>]
    ToolCalls : RunToolCallObject[];
  }

  //#endregion
