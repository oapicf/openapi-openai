namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionMessageToolCall
open OpenAPI.Model.ChatCompletionRequestAssistantMessageFunctionCall
open OpenAPI.Model.string option

module ChatCompletionResponseMessage =

  //#region ChatCompletionResponseMessage

  //#region enums
  type RoleEnum = AssistantEnum of string  
  //#endregion

  type ChatCompletionResponseMessage = {
    Content : string option;
    ToolCalls : ChatCompletionMessageToolCall[];
    Role : RoleEnum;
    FunctionCall : ChatCompletionRequestAssistantMessageFunctionCall;
  }
  //#endregion
