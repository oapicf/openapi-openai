namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestMessageFunctionCall
open OpenAPI.Model.string option

module ChatCompletionStreamResponseDelta =

  //#region ChatCompletionStreamResponseDelta

  //#region enums
  type RoleEnum = SystemEnum of string  |  UserEnum of string  |  AssistantEnum of string  |  FunctionEnum of string  
  //#endregion

  type ChatCompletionStreamResponseDelta = {
    Role : RoleEnum;
    Content : string option;
    FunctionCall : ChatCompletionRequestMessageFunctionCall;
  }
  //#endregion
