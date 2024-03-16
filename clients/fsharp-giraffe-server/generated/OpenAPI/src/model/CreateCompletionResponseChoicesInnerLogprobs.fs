namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateCompletionResponseChoicesInnerLogprobs =

  //#region CreateCompletionResponseChoicesInnerLogprobs


  type CreateCompletionResponse_choices_inner_logprobs = {
    Tokens : string[];
    TokenLogprobs : decimal[];
    TopLogprobs : obj[];
    TextOffset : int[];
  }
  //#endregion
