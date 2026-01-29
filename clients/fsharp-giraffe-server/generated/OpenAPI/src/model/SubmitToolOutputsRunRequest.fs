namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SubmitToolOutputsRunRequestToolOutputsInner
open OpenAPI.Model.bool option

module SubmitToolOutputsRunRequest =

  //#region SubmitToolOutputsRunRequest


  type SubmitToolOutputsRunRequest = {
    ToolOutputs : SubmitToolOutputsRunRequestToolOutputsInner[];
    Stream : bool option;
  }
  //#endregion
