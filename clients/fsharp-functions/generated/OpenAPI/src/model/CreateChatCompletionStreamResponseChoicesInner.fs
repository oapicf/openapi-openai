namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionStreamResponseDelta
open OpenAPI.Model.CreateChatCompletionResponseChoicesInnerLogprobs
open OpenAPI.Model.string option

module CreateChatCompletionStreamResponseChoicesInner =

  //#region CreateChatCompletionStreamResponseChoicesInner

  [<CLIMutable>]
  type CreateChatCompletionStreamResponseChoicesInner = {
    [<JsonProperty(PropertyName = "delta")>]
    Delta : ChatCompletionStreamResponseDelta;
    [<JsonProperty(PropertyName = "logprobs")>]
    Logprobs : CreateChatCompletionResponseChoicesInnerLogprobs;
    [<JsonProperty(PropertyName = "finish_reason")>]
    FinishReason : string option;
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
  }

  //#endregion
