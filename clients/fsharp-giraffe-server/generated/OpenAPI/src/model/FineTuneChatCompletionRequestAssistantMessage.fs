namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionMessageToolCall
open OpenAPI.Model.ChatCompletionRequestAssistantMessageAudio
open OpenAPI.Model.ChatCompletionRequestAssistantMessageContent
open OpenAPI.Model.ChatCompletionRequestAssistantMessageFunctionCall
open OpenAPI.Model.string option

module FineTuneChatCompletionRequestAssistantMessage =

  //#region FineTuneChatCompletionRequestAssistantMessage

  //#region enums
  type RoleEnum = AssistantEnum of string  
  //#endregion
  //#region enums
  type WeightEnum = _0Enum of int  |  _1Enum of int  
  //#endregion

  type FineTuneChatCompletionRequestAssistantMessage = {
    Content : ChatCompletionRequestAssistantMessageContent;
    Refusal : string option;
    Role : RoleEnum;
    Name : string;
    Audio : ChatCompletionRequestAssistantMessageAudio;
    ToolCalls : ChatCompletionMessageToolCall[];
    FunctionCall : ChatCompletionRequestAssistantMessageFunctionCall;
    Weight : WeightEnum;
  }
  //#endregion
