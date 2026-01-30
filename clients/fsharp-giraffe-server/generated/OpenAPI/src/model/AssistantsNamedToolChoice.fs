namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantsNamedToolChoiceFunction

module AssistantsNamedToolChoice =

  //#region AssistantsNamedToolChoice

  //#region enums
  type TypeEnum = FunctionEnum of string  |  CodeInterpreterEnum of string  |  FileSearchEnum of string  
  //#endregion

  type AssistantsNamedToolChoice = {
    Type : TypeEnum;
    Function : AssistantsNamedToolChoiceFunction;
  }
  //#endregion
