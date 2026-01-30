namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionMessageToolCall
open OpenAPI.Model.ChatCompletionRequestAssistantMessageAudio
open OpenAPI.Model.ChatCompletionRequestAssistantMessageContent
open OpenAPI.Model.ChatCompletionRequestAssistantMessageFunctionCall
open OpenAPI.Model.string option

module ChatCompletionRequestAssistantMessage =

  //#region ChatCompletionRequestAssistantMessage

  //#region enums
  type RoleEnum = AssistantEnum of string  
  //#endregion

  type ChatCompletionRequestAssistantMessage = {
    Content : ChatCompletionRequestAssistantMessageContent;
    Refusal : string option;
    Role : RoleEnum;
    Name : string;
    Audio : ChatCompletionRequestAssistantMessageAudio;
    ToolCalls : ChatCompletionMessageToolCall[];
    FunctionCall : ChatCompletionRequestAssistantMessageFunctionCall;
  }
  //#endregion
