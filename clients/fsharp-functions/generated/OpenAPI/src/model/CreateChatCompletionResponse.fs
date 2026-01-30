namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CompletionUsage
open OpenAPI.Model.CreateChatCompletionResponseChoicesInner
open OpenAPI.Model.string option

module CreateChatCompletionResponse =

  //#region CreateChatCompletionResponse

  [<CLIMutable>]
  type CreateChatCompletionResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "choices")>]
    Choices : CreateChatCompletionResponseChoicesInner[];
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
    Usage : CompletionUsage;
  }

  //#endregion
