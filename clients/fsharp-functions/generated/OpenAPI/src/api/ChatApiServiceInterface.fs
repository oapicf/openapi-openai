namespace OpenAPI
open ChatApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ChatApiServiceInterface =

    //#region Service interface
    type IChatApiService =
      abstract member CreateChatCompletion : CreateChatCompletionBodyParams -> CreateChatCompletionResult
    //#endregion