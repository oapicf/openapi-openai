namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionResponseMessage
open OpenAPI.Model.CreateChatCompletionResponseChoicesInnerLogprobs

module CreateChatCompletionResponseChoicesInner =

  //#region CreateChatCompletionResponseChoicesInner

  [<CLIMutable>]
  type CreateChatCompletionResponseChoicesInner = {
    [<JsonProperty(PropertyName = "finish_reason")>]
    FinishReason : string;
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : ChatCompletionResponseMessage;
    [<JsonProperty(PropertyName = "logprobs")>]
    Logprobs : CreateChatCompletionResponseChoicesInnerLogprobs;
  }

  //#endregion
