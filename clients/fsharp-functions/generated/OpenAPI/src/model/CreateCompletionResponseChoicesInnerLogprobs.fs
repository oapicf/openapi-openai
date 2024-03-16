namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateCompletionResponseChoicesInnerLogprobs =

  //#region CreateCompletionResponseChoicesInnerLogprobs

  [<CLIMutable>]
  type CreateCompletionResponseChoicesInnerLogprobs = {
    [<JsonProperty(PropertyName = "tokens")>]
    Tokens : string[];
    [<JsonProperty(PropertyName = "token_logprobs")>]
    TokenLogprobs : decimal[];
    [<JsonProperty(PropertyName = "top_logprobs")>]
    TopLogprobs : obj[];
    [<JsonProperty(PropertyName = "text_offset")>]
    TextOffset : int[];
  }

  //#endregion
