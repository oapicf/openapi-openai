namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FunctionObject

module ChatCompletionTool =

  //#region ChatCompletionTool

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type ChatCompletionTool = {
    Type : TypeEnum;
    Function : FunctionObject;
  }
  //#endregion
