namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantsNamedToolChoiceFunction
open OpenAPI.Model.ChatCompletionNamedToolChoice

module ChatCompletionToolChoiceOption =

  //#region ChatCompletionToolChoiceOption

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type ChatCompletionToolChoiceOption = {
    Type : TypeEnum;
    Function : AssistantsNamedToolChoiceFunction;
  }
  //#endregion
