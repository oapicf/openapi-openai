namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsToolCallsCodeObject
open OpenAPI.Model.RunStepDetailsToolCallsCodeObjectCodeInterpreter
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchObject
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchObjectFileSearch
open OpenAPI.Model.RunStepDetailsToolCallsFunctionObject
open OpenAPI.Model.RunStepDetailsToolCallsFunctionObjectFunction

module RunStepDetailsToolCallsObjectToolCallsInner =

  //#region RunStepDetailsToolCallsObjectToolCallsInner

  //#region enums
  type TypeEnum = CodeInterpreterEnum of string  |  FileSearchEnum of string  |  FunctionEnum of string  
  //#endregion

  type RunStepDetailsToolCallsObject_tool_calls_inner = {
    Id : string;
    Type : TypeEnum;
    CodeInterpreter : RunStepDetailsToolCallsCodeObjectCodeInterpreter;
    FileSearch : RunStepDetailsToolCallsFileSearchObjectFileSearch;
    Function : RunStepDetailsToolCallsFunctionObjectFunction;
  }
  //#endregion
