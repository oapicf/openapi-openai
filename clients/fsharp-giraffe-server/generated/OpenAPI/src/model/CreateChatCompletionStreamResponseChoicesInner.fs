namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionStreamResponseDelta
open OpenAPI.Model.CreateChatCompletionResponseChoicesInnerLogprobs
open OpenAPI.Model.string option

module CreateChatCompletionStreamResponseChoicesInner =

  //#region CreateChatCompletionStreamResponseChoicesInner

  //#region enums
  type FinishReasonEnum = StopEnum of string option  |  LengthEnum of string option  |  ToolCallsEnum of string option  |  ContentFilterEnum of string option  |  FunctionCallEnum of string option  
  //#endregion

  type CreateChatCompletionStreamResponse_choices_inner = {
    Delta : ChatCompletionStreamResponseDelta;
    Logprobs : CreateChatCompletionResponseChoicesInnerLogprobs;
    FinishReason : FinishReasonEnum;
    Index : int;
  }
  //#endregion
