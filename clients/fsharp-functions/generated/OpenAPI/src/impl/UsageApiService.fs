namespace OpenAPI
open OpenAPI.Model.UsageResponse
open UsageApiHandlerParams
open UsageApiServiceInterface
open System.Collections.Generic
open System

module UsageApiServiceImplementation =

    //#region Service implementation
    type UsageApiServiceImpl() =
      interface IUsageApiService with

        member this.UsageAudioSpeeches () =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageAudioSpeechesStatusCode200 { content = content }

        member this.UsageAudioTranscriptions () =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageAudioTranscriptionsStatusCode200 { content = content }

        member this.UsageCodeInterpreterSessions () =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageCodeInterpreterSessionsStatusCode200 { content = content }

        member this.UsageCompletions () =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageCompletionsStatusCode200 { content = content }

        member this.UsageCosts () =
            let content = "Costs data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageCostsStatusCode200 { content = content }

        member this.UsageEmbeddings () =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageEmbeddingsStatusCode200 { content = content }

        member this.UsageImages () =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageImagesStatusCode200 { content = content }

        member this.UsageModerations () =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageModerationsStatusCode200 { content = content }

        member this.UsageVectorStores () =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageVectorStoresStatusCode200 { content = content }

      //#endregion

    let UsageApiService = UsageApiServiceImpl() :> IUsageApiService