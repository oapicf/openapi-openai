namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CompletionUsage
open OpenAPI.Model.CreateChatCompletionFunctionResponseChoicesInner

module CreateChatCompletionFunctionResponse =

  //#region CreateChatCompletionFunctionResponse

  [<CLIMutable>]
  type CreateChatCompletionFunctionResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "choices")>]
    Choices : CreateChatCompletionFunctionResponseChoicesInner[];
    [<JsonProperty(PropertyName = "created")>]
    Created : int;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "system_fingerprint")>]
    SystemFingerprint : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "usage")>]
    Usage : CompletionUsage;
  }

  //#endregion
