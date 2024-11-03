namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

module RunStepDeltaStepDetailsToolCallsCodeObject =

  //#region RunStepDeltaStepDetailsToolCallsCodeObject

  //#region enums
  type TypeEnum = CodeInterpreterEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsToolCallsCodeObject = {
    Index : int;
    Id : string;
    Type : TypeEnum;
    CodeInterpreter : RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
  }
  //#endregion
