namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionStreamResponseDelta

module CreateChatCompletionStreamResponseChoicesInner =

  //#region CreateChatCompletionStreamResponseChoicesInner

  [<CLIMutable>]
  type CreateChatCompletionStreamResponseChoicesInner = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "delta")>]
    Delta : ChatCompletionStreamResponseDelta;
    [<JsonProperty(PropertyName = "finish_reason")>]
    FinishReason : string;
  }

  //#endregion
