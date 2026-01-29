namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsFunctionObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsRetrievalObject

module RunStepDeltaStepDetailsToolCallsObjectToolCallsInner =

  //#region RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

  //#region enums
  type TypeEnum = CodeInterpreterEnum of string  |  RetrievalEnum of string  |  FunctionEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner = {
    Index : int;
    Id : string;
    Type : TypeEnum;
    CodeInterpreter : RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
    Retrieval : obj;
    Function : RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
  }
  //#endregion
