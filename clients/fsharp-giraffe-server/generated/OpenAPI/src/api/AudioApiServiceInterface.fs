namespace OpenAPI
open AudioApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AudioApiServiceInterface =

    //#region Service interface
    type IAudioApiService =
      abstract member CreateSpeech:HttpContext -> CreateSpeechArgs->CreateSpeechResult
      abstract member CreateTranscription:HttpContext -> CreateTranscriptionArgs->CreateTranscriptionResult
      abstract member CreateTranslation:HttpContext -> CreateTranslationArgs->CreateTranslationResult
    //#endregion