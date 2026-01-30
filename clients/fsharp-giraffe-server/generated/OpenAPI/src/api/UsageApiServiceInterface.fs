namespace OpenAPI
open UsageApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module UsageApiServiceInterface =

    //#region Service interface
    type IUsageApiService =
      abstract member UsageAudioSpeeches:HttpContext -> UsageAudioSpeechesArgs->UsageAudioSpeechesResult
      abstract member UsageAudioTranscriptions:HttpContext -> UsageAudioTranscriptionsArgs->UsageAudioTranscriptionsResult
      abstract member UsageCodeInterpreterSessions:HttpContext -> UsageCodeInterpreterSessionsArgs->UsageCodeInterpreterSessionsResult
      abstract member UsageCompletions:HttpContext -> UsageCompletionsArgs->UsageCompletionsResult
      abstract member UsageCosts:HttpContext -> UsageCostsArgs->UsageCostsResult
      abstract member UsageEmbeddings:HttpContext -> UsageEmbeddingsArgs->UsageEmbeddingsResult
      abstract member UsageImages:HttpContext -> UsageImagesArgs->UsageImagesResult
      abstract member UsageModerations:HttpContext -> UsageModerationsArgs->UsageModerationsResult
      abstract member UsageVectorStores:HttpContext -> UsageVectorStoresArgs->UsageVectorStoresResult
    //#endregion