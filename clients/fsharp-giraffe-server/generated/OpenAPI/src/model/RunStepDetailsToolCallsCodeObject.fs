namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsToolCallsCodeObjectCodeInterpreter

module RunStepDetailsToolCallsCodeObject =

  //#region RunStepDetailsToolCallsCodeObject

  //#region enums
  type TypeEnum = CodeInterpreterEnum of string  
  //#endregion

  type RunStepDetailsToolCallsCodeObject = {
    Id : string;
    Type : TypeEnum;
    CodeInterpreter : RunStepDetailsToolCallsCodeObjectCodeInterpreter;
  }
  //#endregion
