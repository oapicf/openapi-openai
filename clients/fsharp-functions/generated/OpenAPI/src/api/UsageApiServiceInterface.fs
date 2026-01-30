namespace OpenAPI
open UsageApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module UsageApiServiceInterface =

    //#region Service interface
    type IUsageApiService =
      abstract member UsageAudioSpeeches : unit -> UsageAudioSpeechesResult
      abstract member UsageAudioTranscriptions : unit -> UsageAudioTranscriptionsResult
      abstract member UsageCodeInterpreterSessions : unit -> UsageCodeInterpreterSessionsResult
      abstract member UsageCompletions : unit -> UsageCompletionsResult
      abstract member UsageCosts : unit -> UsageCostsResult
      abstract member UsageEmbeddings : unit -> UsageEmbeddingsResult
      abstract member UsageImages : unit -> UsageImagesResult
      abstract member UsageModerations : unit -> UsageModerationsResult
      abstract member UsageVectorStores : unit -> UsageVectorStoresResult
    //#endregion