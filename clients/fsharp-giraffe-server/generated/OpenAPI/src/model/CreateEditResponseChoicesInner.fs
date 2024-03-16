namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateCompletionResponseChoicesInnerLogprobs

module CreateEditResponseChoicesInner =

  //#region CreateEditResponseChoicesInner

  //#region enums
  type FinishReasonEnum = StopEnum of string  |  LengthEnum of string  
  //#endregion

  type CreateEditResponse_choices_inner = {
    Text : string;
    Index : int;
    Logprobs : CreateCompletionResponseChoicesInnerLogprobs;
    FinishReason : FinishReasonEnum;
  }
  //#endregion
