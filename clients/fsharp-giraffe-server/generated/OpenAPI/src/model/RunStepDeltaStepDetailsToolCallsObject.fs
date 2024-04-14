namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

module RunStepDeltaStepDetailsToolCallsObject =

  //#region RunStepDeltaStepDetailsToolCallsObject

  //#region enums
  type TypeEnum = ToolCallsEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsToolCallsObject = {
    Type : TypeEnum;
    ToolCalls : RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[];
  }
  //#endregion
