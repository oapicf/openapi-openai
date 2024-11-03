namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionResponseMessage

module CreateChatCompletionFunctionResponseChoicesInner =

  //#region CreateChatCompletionFunctionResponseChoicesInner

  //#region enums
  type FinishReasonEnum = StopEnum of string  |  LengthEnum of string  |  FunctionCallEnum of string  |  ContentFilterEnum of string  
  //#endregion

  type CreateChatCompletionFunctionResponse_choices_inner = {
    FinishReason : FinishReasonEnum;
    Index : int;
    Message : ChatCompletionResponseMessage;
  }
  //#endregion
