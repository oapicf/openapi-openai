namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateCompletionResponseChoicesInnerLogprobs

module CreateCompletionResponseChoicesInner =

  //#region CreateCompletionResponseChoicesInner

  //#region enums
  type FinishReasonEnum = StopEnum of string  |  LengthEnum of string  |  ContentFilterEnum of string  
  //#endregion

  type CreateCompletionResponse_choices_inner = {
    FinishReason : FinishReasonEnum;
    Index : int;
    Logprobs : CreateCompletionResponseChoicesInnerLogprobs;
    Text : string;
  }
  //#endregion
