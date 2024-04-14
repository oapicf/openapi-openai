namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionMessageToolCall
open OpenAPI.Model.ChatCompletionRequestAssistantMessage
open OpenAPI.Model.ChatCompletionRequestAssistantMessageFunctionCall
open OpenAPI.Model.ChatCompletionRequestFunctionMessage
open OpenAPI.Model.ChatCompletionRequestSystemMessage
open OpenAPI.Model.ChatCompletionRequestToolMessage
open OpenAPI.Model.ChatCompletionRequestUserMessage
open OpenAPI.Model.string option

module ChatCompletionRequestMessage =

  //#region ChatCompletionRequestMessage

  //#region enums
  type RoleEnum = FunctionEnum of string  
  //#endregion

  type ChatCompletionRequestMessage = {
    Content : string option;
    Role : RoleEnum;
    Name : string;
    ToolCalls : ChatCompletionMessageToolCall[];
    FunctionCall : ChatCompletionRequestAssistantMessageFunctionCall;
    ToolCallId : string;
  }
  //#endregion
