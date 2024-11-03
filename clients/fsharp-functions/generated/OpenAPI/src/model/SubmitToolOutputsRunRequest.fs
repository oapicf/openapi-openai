namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SubmitToolOutputsRunRequestToolOutputsInner
open OpenAPI.Model.bool option

module SubmitToolOutputsRunRequest =

  //#region SubmitToolOutputsRunRequest

  [<CLIMutable>]
  type SubmitToolOutputsRunRequest = {
    [<JsonProperty(PropertyName = "tool_outputs")>]
    ToolOutputs : SubmitToolOutputsRunRequestToolOutputsInner[];
    [<JsonProperty(PropertyName = "stream")>]
    Stream : bool option;
  }

  //#endregion
