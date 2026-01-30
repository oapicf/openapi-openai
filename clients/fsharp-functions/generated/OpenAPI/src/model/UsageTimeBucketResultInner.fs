namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CostsResult
open OpenAPI.Model.CostsResultAmount
open OpenAPI.Model.UsageAudioSpeechesResult
open OpenAPI.Model.UsageAudioTranscriptionsResult
open OpenAPI.Model.UsageCodeInterpreterSessionsResult
open OpenAPI.Model.UsageCompletionsResult
open OpenAPI.Model.UsageEmbeddingsResult
open OpenAPI.Model.UsageImagesResult
open OpenAPI.Model.UsageModerationsResult
open OpenAPI.Model.UsageVectorStoresResult
open OpenAPI.Model.bool option
open OpenAPI.Model.string option

module UsageTimeBucketResultInner =

  //#region UsageTimeBucketResultInner

  [<CLIMutable>]
  type UsageTimeBucketResultInner = {
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
    [<JsonProperty(PropertyName = "images")>]
    Images : int;
    [<JsonProperty(PropertyName = "source")>]
    Source : string option;
    [<JsonProperty(PropertyName = "size")>]
    Size : string option;
    [<JsonProperty(PropertyName = "characters")>]
    Characters : int;
    [<JsonProperty(PropertyName = "seconds")>]
    Seconds : int;
    [<JsonProperty(PropertyName = "usage_bytes")>]
    UsageBytes : int;
    [<JsonProperty(PropertyName = "sessions")>]
    Sessions : int;
    [<JsonProperty(PropertyName = "amount")>]
    Amount : CostsResultAmount;
    [<JsonProperty(PropertyName = "line_item")>]
    LineItem : string option;
  }

  //#endregion
