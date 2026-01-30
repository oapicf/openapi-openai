namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionMessageToolCallChunk
open OpenAPI.Model.ChatCompletionStreamResponseDeltaFunctionCall
open OpenAPI.Model.string option

module ChatCompletionStreamResponseDelta =

  //#region ChatCompletionStreamResponseDelta

  //#region enums
  type RoleEnum = SystemEnum of string  |  UserEnum of string  |  AssistantEnum of string  |  ToolEnum of string  
  //#endregion

  type ChatCompletionStreamResponseDelta = {
    Content : string option;
    FunctionCall : ChatCompletionStreamResponseDeltaFunctionCall;
    ToolCalls : ChatCompletionMessageToolCallChunk[];
    Role : RoleEnum;
    Refusal : string option;
  }
  //#endregion
