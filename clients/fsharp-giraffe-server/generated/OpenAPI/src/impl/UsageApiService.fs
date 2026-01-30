namespace OpenAPI
open OpenAPI.Model.UsageResponse
open UsageApiHandlerParams
open UsageApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module UsageApiServiceImplementation =

    //#region Service implementation
    type UsageApiServiceImpl() =
      interface IUsageApiService with

        member this.UsageAudioSpeeches ctx args =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageAudioSpeechesStatusCode200 { content = content }

        member this.UsageAudioTranscriptions ctx args =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageAudioTranscriptionsStatusCode200 { content = content }

        member this.UsageCodeInterpreterSessions ctx args =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageCodeInterpreterSessionsStatusCode200 { content = content }

        member this.UsageCompletions ctx args =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageCompletionsStatusCode200 { content = content }

        member this.UsageCosts ctx args =
            let content = "Costs data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageCostsStatusCode200 { content = content }

        member this.UsageEmbeddings ctx args =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageEmbeddingsStatusCode200 { content = content }

        member this.UsageImages ctx args =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageImagesStatusCode200 { content = content }

        member this.UsageModerations ctx args =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageModerationsStatusCode200 { content = content }

        member this.UsageVectorStores ctx args =
            let content = "Usage data retrieved successfully." :> obj :?> UsageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UsageVectorStoresStatusCode200 { content = content }

      //#endregion

    let UsageApiService = UsageApiServiceImpl() :> IUsageApiService