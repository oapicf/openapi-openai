namespace OpenAPI
open CompletionsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CompletionsApiServiceInterface =

    //#region Service interface
    type ICompletionsApiService =
      abstract member CreateCompletion : CreateCompletionBodyParams -> CreateCompletionResult
    //#endregion