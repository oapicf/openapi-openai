namespace OpenAPI.Model

open System
open System.Collections.Generic
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

  //#region enums
  type ObjectEnum = OrganizationCostsResultEnum of string  
  //#endregion

  type UsageTimeBucket_result_inner = {
    Object : ObjectEnum;
    InputTokens : int;
    InputCachedTokens : int;
    OutputTokens : int;
    InputAudioTokens : int;
    OutputAudioTokens : int;
    NumModelRequests : int;
    ProjectId : string option;
    UserId : string option;
    ApiKeyId : string option;
    Model : string option;
    Batch : bool option;
    Images : int;
    Source : string option;
    Size : string option;
    Characters : int;
    Seconds : int;
    UsageBytes : int;
    Sessions : int;
    Amount : CostsResultAmount;
    LineItem : string option;
  }
  //#endregion
