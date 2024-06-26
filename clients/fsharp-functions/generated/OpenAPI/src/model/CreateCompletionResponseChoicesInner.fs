namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateCompletionResponseChoicesInnerLogprobs

module CreateCompletionResponseChoicesInner =

  //#region CreateCompletionResponseChoicesInner

  [<CLIMutable>]
  type CreateCompletionResponseChoicesInner = {
    [<JsonProperty(PropertyName = "finish_reason")>]
    FinishReason : string;
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "logprobs")>]
    Logprobs : CreateCompletionResponseChoicesInnerLogprobs;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
