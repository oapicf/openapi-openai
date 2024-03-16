namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestMessageFunctionCall

module ChatCompletionRequestMessage =

  //#region ChatCompletionRequestMessage

  //#region enums
  type RoleEnum = SystemEnum of string  |  UserEnum of string  |  AssistantEnum of string  |  FunctionEnum of string  
  //#endregion

  type ChatCompletionRequestMessage = {
    Role : RoleEnum;
    Content : string;
    Name : string;
    FunctionCall : ChatCompletionRequestMessageFunctionCall;
  }
  //#endregion
