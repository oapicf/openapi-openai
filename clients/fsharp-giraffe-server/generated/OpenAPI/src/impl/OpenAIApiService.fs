namespace OpenAPI
open OpenAPI.Model.CreateChatCompletionRequest
open OpenAPI.Model.CreateChatCompletionResponse
open OpenAPI.Model.CreateCompletionRequest
open OpenAPI.Model.CreateCompletionResponse
open OpenAPI.Model.CreateEditRequest
open OpenAPI.Model.CreateEditResponse
open OpenAPI.Model.CreateEmbeddingRequest
open OpenAPI.Model.CreateEmbeddingResponse
open OpenAPI.Model.CreateFineTuneRequest
open OpenAPI.Model.CreateImageRequest
open OpenAPI.Model.CreateModerationRequest
open OpenAPI.Model.CreateModerationResponse
open OpenAPI.Model.CreateTranscriptionRequestModel
open OpenAPI.Model.CreateTranscriptionResponse
open OpenAPI.Model.CreateTranslationResponse
open OpenAPI.Model.DeleteFileResponse
open OpenAPI.Model.DeleteModelResponse
open OpenAPI.Model.FineTune
open OpenAPI.Model.ImagesResponse
open OpenAPI.Model.ListFilesResponse
open OpenAPI.Model.ListFineTuneEventsResponse
open OpenAPI.Model.ListFineTunesResponse
open OpenAPI.Model.ListModelsResponse
open OpenAPI.Model.Model
open OpenAPI.Model.OpenAIFile
open OpenAPI.Model.int option
open OpenAPI.Model.string option
open OpenAIApiHandlerParams
open OpenAIApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module OpenAIApiServiceImplementation =

    //#region Service implementation
    type OpenAIApiServiceImpl() =
      interface IOpenAIApiService with

        member this.CancelFineTune ctx args =
            let content = "OK" :> obj :?> FineTune // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelFineTuneStatusCode200 { content = content }

        member this.CreateChatCompletion ctx args =
            let content = "OK" :> obj :?> CreateChatCompletionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateChatCompletionStatusCode200 { content = content }

        member this.CreateCompletion ctx args =
            let content = "OK" :> obj :?> CreateCompletionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateCompletionStatusCode200 { content = content }

        member this.CreateEdit ctx args =
            let content = "OK" :> obj :?> CreateEditResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateEditStatusCode200 { content = content }

        member this.CreateEmbedding ctx args =
            let content = "OK" :> obj :?> CreateEmbeddingResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateEmbeddingStatusCode200 { content = content }

        member this.CreateFile ctx args =
            let content = "OK" :> obj :?> OpenAIFile // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateFileStatusCode200 { content = content }

        member this.CreateFineTune ctx args =
            let content = "OK" :> obj :?> FineTune // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateFineTuneStatusCode200 { content = content }

        member this.CreateImage ctx args =
            let content = "OK" :> obj :?> ImagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateImageStatusCode200 { content = content }

        member this.CreateImageEdit ctx args =
            let content = "OK" :> obj :?> ImagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateImageEditStatusCode200 { content = content }

        member this.CreateImageVariation ctx args =
            let content = "OK" :> obj :?> ImagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateImageVariationStatusCode200 { content = content }

        member this.CreateModeration ctx args =
            let content = "OK" :> obj :?> CreateModerationResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateModerationStatusCode200 { content = content }

        member this.CreateTranscription ctx args =
            let content = "OK" :> obj :?> CreateTranscriptionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateTranscriptionStatusCode200 { content = content }

        member this.CreateTranslation ctx args =
            let content = "OK" :> obj :?> CreateTranslationResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateTranslationStatusCode200 { content = content }

        member this.DeleteFile ctx args =
            let content = "OK" :> obj :?> DeleteFileResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteFileStatusCode200 { content = content }

        member this.DeleteModel ctx args =
            let content = "OK" :> obj :?> DeleteModelResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteModelStatusCode200 { content = content }

        member this.DownloadFile ctx args =
            let content = "OK" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DownloadFileStatusCode200 { content = content }

        member this.ListFiles ctx  =
            let content = "OK" :> obj :?> ListFilesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFilesStatusCode200 { content = content }

        member this.ListFineTuneEvents ctx args =
            let content = "OK" :> obj :?> ListFineTuneEventsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFineTuneEventsStatusCode200 { content = content }

        member this.ListFineTunes ctx  =
            let content = "OK" :> obj :?> ListFineTunesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFineTunesStatusCode200 { content = content }

        member this.ListModels ctx  =
            let content = "OK" :> obj :?> ListModelsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListModelsStatusCode200 { content = content }

        member this.RetrieveFile ctx args =
            let content = "OK" :> obj :?> OpenAIFile // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveFileStatusCode200 { content = content }

        member this.RetrieveFineTune ctx args =
            let content = "OK" :> obj :?> FineTune // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveFineTuneStatusCode200 { content = content }

        member this.RetrieveModel ctx args =
            let content = "OK" :> obj :?> Model // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveModelStatusCode200 { content = content }

      //#endregion

    let OpenAIApiService = OpenAIApiServiceImpl() :> IOpenAIApiService