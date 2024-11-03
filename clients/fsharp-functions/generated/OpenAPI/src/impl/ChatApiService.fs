namespace OpenAPI
open OpenAPI.Model.CreateChatCompletionRequest
open OpenAPI.Model.CreateChatCompletionResponse
open ChatApiHandlerParams
open ChatApiServiceInterface
open System.Collections.Generic
open System

module ChatApiServiceImplementation =

    //#region Service implementation
    type ChatApiServiceImpl() =
      interface IChatApiService with

        member this.CreateChatCompletion (parameters:CreateChatCompletionBodyParams) =
            let content = "OK" :> obj :?> CreateChatCompletionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateChatCompletionStatusCode200 { content = content }

      //#endregion

    let ChatApiService = ChatApiServiceImpl() :> IChatApiService