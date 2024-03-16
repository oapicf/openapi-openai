namespace OpenAPI
open OpenAIApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OpenAIApiServiceInterface =

    //#region Service interface
    type IOpenAIApiService =
      abstract member CancelFineTune:HttpContext -> CancelFineTuneArgs->CancelFineTuneResult
      abstract member CreateChatCompletion:HttpContext -> CreateChatCompletionArgs->CreateChatCompletionResult
      abstract member CreateCompletion:HttpContext -> CreateCompletionArgs->CreateCompletionResult
      abstract member CreateEdit:HttpContext -> CreateEditArgs->CreateEditResult
      abstract member CreateEmbedding:HttpContext -> CreateEmbeddingArgs->CreateEmbeddingResult
      abstract member CreateFile:HttpContext -> CreateFileArgs->CreateFileResult
      abstract member CreateFineTune:HttpContext -> CreateFineTuneArgs->CreateFineTuneResult
      abstract member CreateImage:HttpContext -> CreateImageArgs->CreateImageResult
      abstract member CreateImageEdit:HttpContext -> CreateImageEditArgs->CreateImageEditResult
      abstract member CreateImageVariation:HttpContext -> CreateImageVariationArgs->CreateImageVariationResult
      abstract member CreateModeration:HttpContext -> CreateModerationArgs->CreateModerationResult
      abstract member CreateTranscription:HttpContext -> CreateTranscriptionArgs->CreateTranscriptionResult
      abstract member CreateTranslation:HttpContext -> CreateTranslationArgs->CreateTranslationResult
      abstract member DeleteFile:HttpContext -> DeleteFileArgs->DeleteFileResult
      abstract member DeleteModel:HttpContext -> DeleteModelArgs->DeleteModelResult
      abstract member DownloadFile:HttpContext -> DownloadFileArgs->DownloadFileResult
      abstract member ListFiles:HttpContext ->ListFilesResult
      abstract member ListFineTuneEvents:HttpContext -> ListFineTuneEventsArgs->ListFineTuneEventsResult
      abstract member ListFineTunes:HttpContext ->ListFineTunesResult
      abstract member ListModels:HttpContext ->ListModelsResult
      abstract member RetrieveFile:HttpContext -> RetrieveFileArgs->RetrieveFileResult
      abstract member RetrieveFineTune:HttpContext -> RetrieveFineTuneArgs->RetrieveFineTuneResult
      abstract member RetrieveModel:HttpContext -> RetrieveModelArgs->RetrieveModelResult
    //#endregion