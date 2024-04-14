namespace OpenAPI.Model

open System
open System.Collections.Generic
open System.Collections.Generic

module CreateCompletionResponseChoicesInnerLogprobs =

  //#region CreateCompletionResponseChoicesInnerLogprobs


  type CreateCompletionResponse_choices_inner_logprobs = {
    TextOffset : int[];
    TokenLogprobs : decimal[];
    Tokens : string[];
    TopLogprobs : IDictionary<string, decimal>[];
  }
  //#endregion
