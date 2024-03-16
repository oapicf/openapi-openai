namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateCompletionResponseChoicesInner
open OpenAPI.Model.CreateCompletionResponseUsage

module CreateCompletionResponse =

  //#region CreateCompletionResponse

  [<CLIMutable>]
  type CreateCompletionResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created")>]
    Created : int;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "choices")>]
    Choices : CreateCompletionResponseChoicesInner[];
    [<JsonProperty(PropertyName = "usage")>]
    Usage : CreateCompletionResponseUsage;
  }

  //#endregion
