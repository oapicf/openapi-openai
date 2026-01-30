namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantsNamedToolChoiceFunction

module ChatCompletionNamedToolChoice =

  //#region ChatCompletionNamedToolChoice

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type ChatCompletionNamedToolChoice = {
    Type : TypeEnum;
    Function : AssistantsNamedToolChoiceFunction;
  }
  //#endregion
