namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateChatCompletionStreamResponseChoicesInner
open OpenAPI.Model.CreateChatCompletionStreamResponseUsage
open OpenAPI.Model.string option

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
    [<JsonProperty(PropertyName = "service_tier")>]
    ServiceTier : string option;
    [<JsonProperty(PropertyName = "system_fingerprint")>]
    SystemFingerprint : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "usage")>]
    Usage : CreateChatCompletionStreamResponseUsage;
  }

  //#endregion
