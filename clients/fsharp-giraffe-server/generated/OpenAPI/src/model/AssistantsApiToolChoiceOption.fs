namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantsApiNamedToolChoice
open OpenAPI.Model.ChatCompletionNamedToolChoiceFunction

module AssistantsApiToolChoiceOption =

  //#region AssistantsApiToolChoiceOption

  //#region enums
  type TypeEnum = FunctionEnum of string  |  CodeInterpreterEnum of string  |  RetrievalEnum of string  
  //#endregion

  type AssistantsApiToolChoiceOption = {
    Type : TypeEnum;
    Function : ChatCompletionNamedToolChoiceFunction;
  }
  //#endregion
