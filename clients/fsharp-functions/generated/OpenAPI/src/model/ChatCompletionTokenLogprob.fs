namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionTokenLogprobTopLogprobsInner

module ChatCompletionTokenLogprob =

  //#region ChatCompletionTokenLogprob

  [<CLIMutable>]
  type ChatCompletionTokenLogprob = {
    [<JsonProperty(PropertyName = "token")>]
    Token : string;
    [<JsonProperty(PropertyName = "logprob")>]
    Logprob : decimal;
    [<JsonProperty(PropertyName = "bytes")>]
    Bytes : int[];
    [<JsonProperty(PropertyName = "top_logprobs")>]
    TopLogprobs : ChatCompletionTokenLogprobTopLogprobsInner[];
  }

  //#endregion
