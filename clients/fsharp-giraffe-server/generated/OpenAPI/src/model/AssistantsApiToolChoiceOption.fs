namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantsNamedToolChoice
open OpenAPI.Model.AssistantsNamedToolChoiceFunction

module AssistantsApiToolChoiceOption =

  //#region AssistantsApiToolChoiceOption

  //#region enums
  type TypeEnum = FunctionEnum of string  |  CodeInterpreterEnum of string  |  FileSearchEnum of string  
  //#endregion

  type AssistantsApiToolChoiceOption = {
    Type : TypeEnum;
    Function : AssistantsNamedToolChoiceFunction;
  }
  //#endregion
