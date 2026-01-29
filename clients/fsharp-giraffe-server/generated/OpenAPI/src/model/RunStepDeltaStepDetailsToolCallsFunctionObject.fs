namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

module RunStepDeltaStepDetailsToolCallsFunctionObject =

  //#region RunStepDeltaStepDetailsToolCallsFunctionObject

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsToolCallsFunctionObject = {
    Index : int;
    Id : string;
    Type : TypeEnum;
    Function : RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
  }
  //#endregion
