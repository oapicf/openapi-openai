namespace OpenAPI
open OpenAIApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OpenAIApiServiceInterface =

    //#region Service interface
    type IOpenAIApiService =
      abstract member CancelFineTune : unit -> CancelFineTuneResult
      abstract member CreateChatCompletion : CreateChatCompletionBodyParams -> CreateChatCompletionResult
      abstract member CreateCompletion : CreateCompletionBodyParams -> CreateCompletionResult
      abstract member CreateEdit : CreateEditBodyParams -> CreateEditResult
      abstract member CreateEmbedding : CreateEmbeddingBodyParams -> CreateEmbeddingResult
      abstract member CreateFile : unit -> CreateFileResult
      abstract member CreateFineTune : CreateFineTuneBodyParams -> CreateFineTuneResult
      abstract member CreateImage : CreateImageBodyParams -> CreateImageResult
      abstract member CreateImageEdit : unit -> CreateImageEditResult
      abstract member CreateImageVariation : unit -> CreateImageVariationResult
      abstract member CreateModeration : CreateModerationBodyParams -> CreateModerationResult
      abstract member CreateTranscription : unit -> CreateTranscriptionResult
      abstract member CreateTranslation : unit -> CreateTranslationResult
      abstract member DeleteFile : unit -> DeleteFileResult
      abstract member DeleteModel : unit -> DeleteModelResult
      abstract member DownloadFile : unit -> DownloadFileResult
      abstract member ListFiles : unit -> ListFilesResult
      abstract member ListFineTuneEvents : unit -> ListFineTuneEventsResult
      abstract member ListFineTunes : unit -> ListFineTunesResult
      abstract member ListModels : unit -> ListModelsResult
      abstract member RetrieveFile : unit -> RetrieveFileResult
      abstract member RetrieveFineTune : unit -> RetrieveFineTuneResult
      abstract member RetrieveModel : unit -> RetrieveModelResult
    //#endregion