namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionNamedToolChoice
open OpenAPI.Model.ChatCompletionNamedToolChoiceFunction

module ChatCompletionToolChoiceOption =

  //#region ChatCompletionToolChoiceOption

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type ChatCompletionToolChoiceOption = {
    Type : TypeEnum;
    Function : ChatCompletionNamedToolChoiceFunction;
  }
  //#endregion
