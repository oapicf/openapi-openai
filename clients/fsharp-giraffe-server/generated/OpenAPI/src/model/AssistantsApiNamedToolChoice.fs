namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionNamedToolChoiceFunction

module AssistantsApiNamedToolChoice =

  //#region AssistantsApiNamedToolChoice

  //#region enums
  type TypeEnum = FunctionEnum of string  |  CodeInterpreterEnum of string  |  RetrievalEnum of string  
  //#endregion

  type AssistantsApiNamedToolChoice = {
    Type : TypeEnum;
    Function : ChatCompletionNamedToolChoiceFunction;
  }
  //#endregion
