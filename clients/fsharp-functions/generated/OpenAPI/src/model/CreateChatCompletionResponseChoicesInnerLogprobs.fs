namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionTokenLogprob

module CreateChatCompletionResponseChoicesInnerLogprobs =

  //#region CreateChatCompletionResponseChoicesInnerLogprobs

  [<CLIMutable>]
  type CreateChatCompletionResponseChoicesInnerLogprobs = {
    [<JsonProperty(PropertyName = "content")>]
    Content : ChatCompletionTokenLogprob[];
  }

  //#endregion
