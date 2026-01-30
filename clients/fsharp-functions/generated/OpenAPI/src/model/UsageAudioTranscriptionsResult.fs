namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module UsageAudioTranscriptionsResult =

  //#region UsageAudioTranscriptionsResult

  [<CLIMutable>]
  type UsageAudioTranscriptionsResult = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "seconds")>]
    Seconds : int;
    [<JsonProperty(PropertyName = "num_model_requests")>]
    NumModelRequests : int;
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
