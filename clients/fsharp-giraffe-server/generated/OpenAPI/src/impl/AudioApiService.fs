namespace OpenAPI
open OpenAPI.Model.CreateSpeechRequest
open OpenAPI.Model.CreateTranscription200Response
open OpenAPI.Model.CreateTranscriptionRequestModel
open OpenAPI.Model.CreateTranslation200Response
open AudioApiHandlerParams
open AudioApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module AudioApiServiceImplementation =

    //#region Service implementation
    type AudioApiServiceImpl() =
      interface IAudioApiService with

        member this.CreateSpeech ctx args =
            let content = "OK" :> obj :?> System.IO.Stream // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateSpeechStatusCode200 { content = content }

        member this.CreateTranscription ctx args =
            let content = "OK" :> obj :?> CreateTranscription200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateTranscriptionStatusCode200 { content = content }

        member this.CreateTranslation ctx args =
            let content = "OK" :> obj :?> CreateTranslation200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateTranslationStatusCode200 { content = content }

      //#endregion

    let AudioApiService = AudioApiServiceImpl() :> IAudioApiService