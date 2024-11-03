namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateChatCompletionStreamResponseChoicesInner

module CreateChatCompletionStreamResponse =

  //#region CreateChatCompletionStreamResponse

  [<CLIMutable>]
  type CreateChatCompletionStreamResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "choices")>]
    Choices : CreateChatCompletionStreamResponseChoicesInner[];
    [<JsonProperty(PropertyName = "created")>]
    Created : int;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "system_fingerprint")>]
    SystemFingerprint : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
