namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionResponseMessage

module CreateChatCompletionResponseChoicesInner =

  //#region CreateChatCompletionResponseChoicesInner

  //#region enums
  type FinishReasonEnum = StopEnum of string  |  LengthEnum of string  |  FunctionCallEnum of string  
  //#endregion

  type CreateChatCompletionResponse_choices_inner = {
    Index : int;
    Message : ChatCompletionResponseMessage;
    FinishReason : FinishReasonEnum;
  }
  //#endregion
