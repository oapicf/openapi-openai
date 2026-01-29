namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsToolCallsCodeObject
open OpenAPI.Model.RunStepDetailsToolCallsCodeObjectCodeInterpreter
open OpenAPI.Model.RunStepDetailsToolCallsFunctionObject
open OpenAPI.Model.RunStepDetailsToolCallsFunctionObjectFunction
open OpenAPI.Model.RunStepDetailsToolCallsRetrievalObject

module RunStepDetailsToolCallsObjectToolCallsInner =

  //#region RunStepDetailsToolCallsObjectToolCallsInner

  //#region enums
  type TypeEnum = CodeInterpreterEnum of string  |  RetrievalEnum of string  |  FunctionEnum of string  
  //#endregion

  type RunStepDetailsToolCallsObject_tool_calls_inner = {
    Id : string;
    Type : TypeEnum;
    CodeInterpreter : RunStepDetailsToolCallsCodeObjectCodeInterpreter;
    Retrieval : obj;
    Function : RunStepDetailsToolCallsFunctionObjectFunction;
  }
  //#endregion
