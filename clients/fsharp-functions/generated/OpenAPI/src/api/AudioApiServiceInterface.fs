namespace OpenAPI
open AudioApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AudioApiServiceInterface =

    //#region Service interface
    type IAudioApiService =
      abstract member CreateSpeech : CreateSpeechBodyParams -> CreateSpeechResult
      abstract member CreateTranscription : unit -> CreateTranscriptionResult
      abstract member CreateTranslation : unit -> CreateTranslationResult
    //#endregion