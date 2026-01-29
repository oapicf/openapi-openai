namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsToolCallsObjectToolCallsInner

module RunStepDetailsToolCallsObject =

  //#region RunStepDetailsToolCallsObject

  //#region enums
  type TypeEnum = ToolCallsEnum of string  
  //#endregion

  type RunStepDetailsToolCallsObject = {
    Type : TypeEnum;
    ToolCalls : RunStepDetailsToolCallsObjectToolCallsInner[];
  }
  //#endregion
