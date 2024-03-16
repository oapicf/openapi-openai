namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateImageRequest =

  //#region CreateImageRequest

  [<CLIMutable>]
  type CreateImageRequest = {
    [<JsonProperty(PropertyName = "prompt")>]
    Prompt : string;
    [<JsonProperty(PropertyName = "n")>]
    N : int option;
    [<JsonProperty(PropertyName = "size")>]
    Size : string option;
    [<JsonProperty(PropertyName = "response_format")>]
    ResponseFormat : string option;
    [<JsonProperty(PropertyName = "user")>]
    User : string;
  }

  //#endregion
