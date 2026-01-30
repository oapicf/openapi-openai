namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module UsageImagesResult =

  //#region UsageImagesResult

  [<CLIMutable>]
  type UsageImagesResult = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "images")>]
    Images : int;
    [<JsonProperty(PropertyName = "num_model_requests")>]
    NumModelRequests : int;
    [<JsonProperty(PropertyName = "source")>]
    Source : string option;
    [<JsonProperty(PropertyName = "size")>]
    Size : string option;
    [<JsonProperty(PropertyName = "project_id")>]
    ProjectId : string option;
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : string option;
    [<JsonProperty(PropertyName = "api_key_id")>]
    ApiKeyId : string option;
    [<JsonProperty(PropertyName = "model")>]
    Model : string option;
  }

  //#endregion
