namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionTokenLogprobTopLogprobsInner

module ChatCompletionTokenLogprob =

  //#region ChatCompletionTokenLogprob


  type ChatCompletionTokenLogprob = {
    Token : string;
    Logprob : decimal;
    Bytes : int[];
    TopLogprobs : ChatCompletionTokenLogprobTopLogprobsInner[];
  }
  //#endregion
