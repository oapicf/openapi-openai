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

module OpenAIApiServiceImplementation =

    //#region Service implementation
    type OpenAIApiServiceImpl() =
      interface IOpenAIApiService with

        member this.CancelFineTune () =
            let content = "OK" :> obj :?> FineTune // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelFineTuneStatusCode200 { content = content }

        member this.CreateChatCompletion (parameters:CreateChatCompletionBodyParams) =
            let content = "OK" :> obj :?> CreateChatCompletionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateChatCompletionStatusCode200 { content = content }

        member this.CreateCompletion (parameters:CreateCompletionBodyParams) =
            let content = "OK" :> obj :?> CreateCompletionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateCompletionStatusCode200 { content = content }

        member this.CreateEdit (parameters:CreateEditBodyParams) =
            let content = "OK" :> obj :?> CreateEditResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateEditStatusCode200 { content = content }

        member this.CreateEmbedding (parameters:CreateEmbeddingBodyParams) =
            let content = "OK" :> obj :?> CreateEmbeddingResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateEmbeddingStatusCode200 { content = content }

        member this.CreateFile () =
            let content = "OK" :> obj :?> OpenAIFile // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateFileStatusCode200 { content = content }

        member this.CreateFineTune (parameters:CreateFineTuneBodyParams) =
            let content = "OK" :> obj :?> FineTune // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateFineTuneStatusCode200 { content = content }

        member this.CreateImage (parameters:CreateImageBodyParams) =
            let content = "OK" :> obj :?> ImagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateImageStatusCode200 { content = content }

        member this.CreateImageEdit () =
            let content = "OK" :> obj :?> ImagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateImageEditStatusCode200 { content = content }

        member this.CreateImageVariation () =
            let content = "OK" :> obj :?> ImagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateImageVariationStatusCode200 { content = content }

        member this.CreateModeration (parameters:CreateModerationBodyParams) =
            let content = "OK" :> obj :?> CreateModerationResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateModerationStatusCode200 { content = content }

        member this.CreateTranscription () =
            let content = "OK" :> obj :?> CreateTranscriptionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateTranscriptionStatusCode200 { content = content }

        member this.CreateTranslation () =
            let content = "OK" :> obj :?> CreateTranslationResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateTranslationStatusCode200 { content = content }

        member this.DeleteFile () =
            let content = "OK" :> obj :?> DeleteFileResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteFileStatusCode200 { content = content }

        member this.DeleteModel () =
            let content = "OK" :> obj :?> DeleteModelResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteModelStatusCode200 { content = content }

        member this.DownloadFile () =
            let content = "OK" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DownloadFileStatusCode200 { content = content }

        member this.ListFiles () =
            let content = "OK" :> obj :?> ListFilesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFilesStatusCode200 { content = content }

        member this.ListFineTuneEvents () =
            let content = "OK" :> obj :?> ListFineTuneEventsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFineTuneEventsStatusCode200 { content = content }

        member this.ListFineTunes () =
            let content = "OK" :> obj :?> ListFineTunesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFineTunesStatusCode200 { content = content }

        member this.ListModels () =
            let content = "OK" :> obj :?> ListModelsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListModelsStatusCode200 { content = content }

        member this.RetrieveFile () =
            let content = "OK" :> obj :?> OpenAIFile // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveFileStatusCode200 { content = content }

        member this.RetrieveFineTune () =
            let content = "OK" :> obj :?> FineTune // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveFineTuneStatusCode200 { content = content }

        member this.RetrieveModel () =
            let content = "OK" :> obj :?> Model // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveModelStatusCode200 { content = content }

      //#endregion

    let OpenAIApiService = OpenAIApiServiceImpl() :> IOpenAIApiService