namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FunctionObject

module AssistantToolsFunction =

  //#region AssistantToolsFunction

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type AssistantToolsFunction = {
    Type : TypeEnum;
    Function : FunctionObject;
  }
  //#endregion
