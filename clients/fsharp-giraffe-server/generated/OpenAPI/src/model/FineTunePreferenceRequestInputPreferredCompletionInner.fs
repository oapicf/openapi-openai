namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionMessageToolCall
open OpenAPI.Model.ChatCompletionRequestAssistantMessage
open OpenAPI.Model.ChatCompletionRequestAssistantMessageAudio
open OpenAPI.Model.ChatCompletionRequestAssistantMessageContent
open OpenAPI.Model.ChatCompletionRequestAssistantMessageFunctionCall
open OpenAPI.Model.string option

module FineTunePreferenceRequestInputPreferredCompletionInner =

  //#region FineTunePreferenceRequestInputPreferredCompletionInner

  //#region enums
  type RoleEnum = AssistantEnum of string  
  //#endregion

  type FineTunePreferenceRequestInput_preferred_completion_inner = {
    Content : ChatCompletionRequestAssistantMessageContent;
    Refusal : string option;
    Role : RoleEnum;
    Name : string;
    Audio : ChatCompletionRequestAssistantMessageAudio;
    ToolCalls : ChatCompletionMessageToolCall[];
    FunctionCall : ChatCompletionRequestAssistantMessageFunctionCall;
  }
  //#endregion
