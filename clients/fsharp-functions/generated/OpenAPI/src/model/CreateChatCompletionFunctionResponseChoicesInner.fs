namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionResponseMessage

module CreateChatCompletionFunctionResponseChoicesInner =

  //#region CreateChatCompletionFunctionResponseChoicesInner

  [<CLIMutable>]
  type CreateChatCompletionFunctionResponseChoicesInner = {
    [<JsonProperty(PropertyName = "finish_reason")>]
    FinishReason : string;
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : ChatCompletionResponseMessage;
  }

  //#endregion
