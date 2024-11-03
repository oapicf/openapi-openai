namespace OpenAPI.Model

open System
open System.Collections.Generic

module ChatCompletionTokenLogprobTopLogprobsInner =

  //#region ChatCompletionTokenLogprobTopLogprobsInner


  type ChatCompletionTokenLogprob_top_logprobs_inner = {
    Token : string;
    Logprob : decimal;
    Bytes : int[];
  }
  //#endregion
