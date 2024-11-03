namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionMessageToolCall
open OpenAPI.Model.ChatCompletionRequestAssistantMessageFunctionCall
open OpenAPI.Model.string option

module ChatCompletionRequestAssistantMessage =

  //#region ChatCompletionRequestAssistantMessage

  //#region enums
  type RoleEnum = AssistantEnum of string  
  //#endregion

  type ChatCompletionRequestAssistantMessage = {
    Content : string option;
    Role : RoleEnum;
    Name : string;
    ToolCalls : ChatCompletionMessageToolCall[];
    FunctionCall : ChatCompletionRequestAssistantMessageFunctionCall;
  }
  //#endregion
