namespace OpenAPI

open OpenAPI.Model.UsageResponse
open System.Collections.Generic
open System

module UsageApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type UsageAudioSpeechesQueryParams = {
      startTime : int ;


      endTime : int option;


      bucketWidth : string option;


      projectIds : string[] option;


      userIds : string[] option;


      apiKeyIds : string[] option;


      models : string[] option;


      groupBy : string[] option;


      limit : int option;


      page : string option;

    }
    //#endregion


    type UsageAudioSpeechesStatusCode200Response = {
      content:UsageResponse;
      
    }
    type UsageAudioSpeechesResult = UsageAudioSpeechesStatusCode200 of UsageAudioSpeechesStatusCode200Response

    type UsageAudioSpeechesArgs = {
      queryParams:Result<UsageAudioSpeechesQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UsageAudioTranscriptionsQueryParams = {
      startTime : int ;


      endTime : int option;


      bucketWidth : string option;


      projectIds : string[] option;


      userIds : string[] option;


      apiKeyIds : string[] option;


      models : string[] option;


      groupBy : string[] option;


      limit : int option;


      page : string option;

    }
    //#endregion


    type UsageAudioTranscriptionsStatusCode200Response = {
      content:UsageResponse;
      
    }
    type UsageAudioTranscriptionsResult = UsageAudioTranscriptionsStatusCode200 of UsageAudioTranscriptionsStatusCode200Response

    type UsageAudioTranscriptionsArgs = {
      queryParams:Result<UsageAudioTranscriptionsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UsageCodeInterpreterSessionsQueryParams = {
      startTime : int ;


      endTime : int option;


      bucketWidth : string option;


      projectIds : string[] option;


      groupBy : string[] option;


      limit : int option;


      page : string option;

    }
    //#endregion


    type UsageCodeInterpreterSessionsStatusCode200Response = {
      content:UsageResponse;
      
    }
    type UsageCodeInterpreterSessionsResult = UsageCodeInterpreterSessionsStatusCode200 of UsageCodeInterpreterSessionsStatusCode200Response

    type UsageCodeInterpreterSessionsArgs = {
      queryParams:Result<UsageCodeInterpreterSessionsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UsageCompletionsQueryParams = {
      startTime : int ;


      endTime : int option;


      bucketWidth : string option;


      projectIds : string[] option;


      userIds : string[] option;


      apiKeyIds : string[] option;


      models : string[] option;


      batch : bool option;


      groupBy : string[] option;


      limit : int option;


      page : string option;

    }
    //#endregion


    type UsageCompletionsStatusCode200Response = {
      content:UsageResponse;
      
    }
    type UsageCompletionsResult = UsageCompletionsStatusCode200 of UsageCompletionsStatusCode200Response

    type UsageCompletionsArgs = {
      queryParams:Result<UsageCompletionsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UsageCostsQueryParams = {
      startTime : int ;


      endTime : int option;


      bucketWidth : string option;


      projectIds : string[] option;


      groupBy : string[] option;


      limit : int option;


      page : string option;

    }
    //#endregion


    type UsageCostsStatusCode200Response = {
      content:UsageResponse;
      
    }
    type UsageCostsResult = UsageCostsStatusCode200 of UsageCostsStatusCode200Response

    type UsageCostsArgs = {
      queryParams:Result<UsageCostsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UsageEmbeddingsQueryParams = {
      startTime : int ;


      endTime : int option;


      bucketWidth : string option;


      projectIds : string[] option;


      userIds : string[] option;


      apiKeyIds : string[] option;


      models : string[] option;


      groupBy : string[] option;


      limit : int option;


      page : string option;

    }
    //#endregion


    type UsageEmbeddingsStatusCode200Response = {
      content:UsageResponse;
      
    }
    type UsageEmbeddingsResult = UsageEmbeddingsStatusCode200 of UsageEmbeddingsStatusCode200Response

    type UsageEmbeddingsArgs = {
      queryParams:Result<UsageEmbeddingsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UsageImagesQueryParams = {
      startTime : int ;


      endTime : int option;


      bucketWidth : string option;


      sources : string[] option;


      sizes : string[] option;


      projectIds : string[] option;


      userIds : string[] option;


      apiKeyIds : string[] option;


      models : string[] option;


      groupBy : string[] option;


      limit : int option;


      page : string option;

    }
    //#endregion


    type UsageImagesStatusCode200Response = {
      content:UsageResponse;
      
    }
    type UsageImagesResult = UsageImagesStatusCode200 of UsageImagesStatusCode200Response

    type UsageImagesArgs = {
      queryParams:Result<UsageImagesQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UsageModerationsQueryParams = {
      startTime : int ;


      endTime : int option;


      bucketWidth : string option;


      projectIds : string[] option;


      userIds : string[] option;


      apiKeyIds : string[] option;


      models : string[] option;


      groupBy : string[] option;


      limit : int option;


      page : string option;

    }
    //#endregion


    type UsageModerationsStatusCode200Response = {
      content:UsageResponse;
      
    }
    type UsageModerationsResult = UsageModerationsStatusCode200 of UsageModerationsStatusCode200Response

    type UsageModerationsArgs = {
      queryParams:Result<UsageModerationsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UsageVectorStoresQueryParams = {
      startTime : int ;


      endTime : int option;


      bucketWidth : string option;


      projectIds : string[] option;


      groupBy : string[] option;


      limit : int option;


      page : string option;

    }
    //#endregion


    type UsageVectorStoresStatusCode200Response = {
      content:UsageResponse;
      
    }
    type UsageVectorStoresResult = UsageVectorStoresStatusCode200 of UsageVectorStoresStatusCode200Response

    type UsageVectorStoresArgs = {
      queryParams:Result<UsageVectorStoresQueryParams,string>;
    }
