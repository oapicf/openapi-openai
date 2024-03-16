namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateCompletionResponseChoicesInnerLogprobs

module CreateEditResponseChoicesInner =

  //#region CreateEditResponseChoicesInner

  [<CLIMutable>]
  type CreateEditResponseChoicesInner = {
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "logprobs")>]
    Logprobs : CreateCompletionResponseChoicesInnerLogprobs;
    [<JsonProperty(PropertyName = "finish_reason")>]
    FinishReason : string;
  }

  //#endregion
