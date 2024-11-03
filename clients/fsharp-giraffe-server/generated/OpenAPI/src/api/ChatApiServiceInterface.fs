namespace OpenAPI
open ChatApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ChatApiServiceInterface =

    //#region Service interface
    type IChatApiService =
      abstract member CreateChatCompletion:HttpContext -> CreateChatCompletionArgs->CreateChatCompletionResult
    //#endregion