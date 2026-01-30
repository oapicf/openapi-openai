namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsFileSearchObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsFunctionObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

module RunStepDeltaStepDetailsToolCallsObjectToolCallsInner =

  //#region RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

  //#region enums
  type TypeEnum = CodeInterpreterEnum of string  |  FileSearchEnum of string  |  FunctionEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner = {
    Index : int;
    Id : string;
    Type : TypeEnum;
    CodeInterpreter : RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
    FileSearch : obj;
    Function : RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
  }
  //#endregion
