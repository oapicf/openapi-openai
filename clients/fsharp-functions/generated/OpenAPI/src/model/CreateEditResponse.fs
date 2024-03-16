namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateCompletionResponseUsage
open OpenAPI.Model.CreateEditResponseChoicesInner

module CreateEditResponse =

  //#region CreateEditResponse

  [<CLIMutable>]
  type CreateEditResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created")>]
    Created : int;
    [<JsonProperty(PropertyName = "choices")>]
    Choices : CreateEditResponseChoicesInner[];
    [<JsonProperty(PropertyName = "usage")>]
    Usage : CreateCompletionResponseUsage;
  }

  //#endregion
