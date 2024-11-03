namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionTokenLogprobTopLogprobsInner =

  //#region ChatCompletionTokenLogprobTopLogprobsInner

  [<CLIMutable>]
  type ChatCompletionTokenLogprobTopLogprobsInner = {
    [<JsonProperty(PropertyName = "token")>]
    Token : string;
    [<JsonProperty(PropertyName = "logprob")>]
    Logprob : decimal;
    [<JsonProperty(PropertyName = "bytes")>]
    Bytes : int[];
  }

  //#endregion
