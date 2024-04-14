namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionResponseMessage
open OpenAPI.Model.CreateChatCompletionResponseChoicesInnerLogprobs

module CreateChatCompletionResponseChoicesInner =

  //#region CreateChatCompletionResponseChoicesInner

  //#region enums
  type FinishReasonEnum = StopEnum of string  |  LengthEnum of string  |  ToolCallsEnum of string  |  ContentFilterEnum of string  |  FunctionCallEnum of string  
  //#endregion

  type CreateChatCompletionResponse_choices_inner = {
    FinishReason : FinishReasonEnum;
    Index : int;
    Message : ChatCompletionResponseMessage;
    Logprobs : CreateChatCompletionResponseChoicesInnerLogprobs;
  }
  //#endregion
