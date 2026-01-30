namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionMessageToolCall
open OpenAPI.Model.ChatCompletionResponseMessageAudio
open OpenAPI.Model.ChatCompletionResponseMessageFunctionCall
open OpenAPI.Model.string option

module ChatCompletionResponseMessage =

  //#region ChatCompletionResponseMessage

  //#region enums
  type RoleEnum = AssistantEnum of string  
  //#endregion

  type ChatCompletionResponseMessage = {
    Content : string option;
    Refusal : string option;
    ToolCalls : ChatCompletionMessageToolCall[];
    Role : RoleEnum;
    FunctionCall : ChatCompletionResponseMessageFunctionCall;
    Audio : ChatCompletionResponseMessageAudio;
  }
  //#endregion
