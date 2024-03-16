namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateChatCompletionResponseChoicesInner
open OpenAPI.Model.CreateCompletionResponseUsage

module CreateChatCompletionResponse =

  //#region CreateChatCompletionResponse

  [<CLIMutable>]
  type CreateChatCompletionResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created")>]
    Created : int;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "choices")>]
    Choices : CreateChatCompletionResponseChoicesInner[];
    [<JsonProperty(PropertyName = "usage")>]
    Usage : CreateCompletionResponseUsage;
  }

  //#endregion
