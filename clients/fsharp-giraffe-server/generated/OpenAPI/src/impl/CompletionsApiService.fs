namespace OpenAPI
open OpenAPI.Model.CreateCompletionRequest
open OpenAPI.Model.CreateCompletionResponse
open CompletionsApiHandlerParams
open CompletionsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module CompletionsApiServiceImplementation =

    //#region Service implementation
    type CompletionsApiServiceImpl() =
      interface ICompletionsApiService with

        member this.CreateCompletion ctx args =
            let content = "OK" :> obj :?> CreateCompletionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateCompletionStatusCode200 { content = content }

      //#endregion

    let CompletionsApiService = CompletionsApiServiceImpl() :> ICompletionsApiService