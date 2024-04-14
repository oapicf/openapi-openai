namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunToolCallObjectFunction

module RunToolCallObject =

  //#region RunToolCallObject

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type RunToolCallObject = {
    Id : string;
    Type : TypeEnum;
    Function : RunToolCallObjectFunction;
  }
  //#endregion
