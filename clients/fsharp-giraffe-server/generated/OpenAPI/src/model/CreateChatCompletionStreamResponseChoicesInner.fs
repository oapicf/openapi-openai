namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionStreamResponseDelta

module CreateChatCompletionStreamResponseChoicesInner =

  //#region CreateChatCompletionStreamResponseChoicesInner

  //#region enums
  type FinishReasonEnum = StopEnum of string  |  LengthEnum of string  |  FunctionCallEnum of string  
  //#endregion

  type CreateChatCompletionStreamResponse_choices_inner = {
    Index : int;
    Delta : ChatCompletionStreamResponseDelta;
    FinishReason : FinishReasonEnum;
  }
  //#endregion
