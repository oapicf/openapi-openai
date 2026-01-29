namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateImageRequestModel
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateImageRequest =

  //#region CreateImageRequest

  [<CLIMutable>]
  type CreateImageRequest = {
    [<JsonProperty(PropertyName = "prompt")>]
    Prompt : string;
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateImageRequestModel;
    [<JsonProperty(PropertyName = "n")>]
    N : int option;
    [<JsonProperty(PropertyName = "quality")>]
    Quality : string;
    [<JsonProperty(PropertyName = "response_format")>]
    ResponseFormat : string option;
    [<JsonProperty(PropertyName = "size")>]
    Size : string option;
    [<JsonProperty(PropertyName = "style")>]
    Style : string option;
    [<JsonProperty(PropertyName = "user")>]
    User : string;
  }

  //#endregion
