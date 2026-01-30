namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.bool option
open OpenAPI.Model.string option

module UsageCompletionsResult =

  //#region UsageCompletionsResult

  [<CLIMutable>]
  type UsageCompletionsResult = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "input_tokens")>]
    InputTokens : int;
    [<JsonProperty(PropertyName = "input_cached_tokens")>]
    InputCachedTokens : int;
    [<JsonProperty(PropertyName = "output_tokens")>]
    OutputTokens : int;
    [<JsonProperty(PropertyName = "input_audio_tokens")>]
    InputAudioTokens : int;
    [<JsonProperty(PropertyName = "output_audio_tokens")>]
    OutputAudioTokens : int;
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
    [<JsonProperty(PropertyName = "batch")>]
    Batch : bool option;
  }

  //#endregion
