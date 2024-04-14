namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SubmitToolOutputsRunRequestToolOutputsInner =

  //#region SubmitToolOutputsRunRequestToolOutputsInner

  [<CLIMutable>]
  type SubmitToolOutputsRunRequestToolOutputsInner = {
    [<JsonProperty(PropertyName = "tool_call_id")>]
    ToolCallId : string;
    [<JsonProperty(PropertyName = "output")>]
    Output : string;
  }

  //#endregion
