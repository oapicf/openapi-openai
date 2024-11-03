namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsToolCallsFunctionObjectFunction

module RunStepDetailsToolCallsFunctionObject =

  //#region RunStepDetailsToolCallsFunctionObject

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type RunStepDetailsToolCallsFunctionObject = {
    Id : string;
    Type : TypeEnum;
    Function : RunStepDetailsToolCallsFunctionObjectFunction;
  }
  //#endregion
