namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestMessageFunctionCall
open OpenAPI.Model.string option

module ChatCompletionResponseMessage =

  //#region ChatCompletionResponseMessage

  //#region enums
  type RoleEnum = SystemEnum of string  |  UserEnum of string  |  AssistantEnum of string  |  FunctionEnum of string  
  //#endregion

  type ChatCompletionResponseMessage = {
    Role : RoleEnum;
    Content : string option;
    FunctionCall : ChatCompletionRequestMessageFunctionCall;
  }
  //#endregion
