namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module CreateCompletionResponseChoicesInnerLogprobs =

  //#region CreateCompletionResponseChoicesInnerLogprobs

  [<CLIMutable>]
  type CreateCompletionResponseChoicesInnerLogprobs = {
    [<JsonProperty(PropertyName = "text_offset")>]
    TextOffset : int[];
    [<JsonProperty(PropertyName = "token_logprobs")>]
    TokenLogprobs : decimal[];
    [<JsonProperty(PropertyName = "tokens")>]
    Tokens : string[];
    [<JsonProperty(PropertyName = "top_logprobs")>]
    TopLogprobs : IDictionary<string, decimal>[];
  }

  //#endregion
