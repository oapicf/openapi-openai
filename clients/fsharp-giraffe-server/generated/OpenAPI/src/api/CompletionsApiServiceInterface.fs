namespace OpenAPI
open CompletionsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CompletionsApiServiceInterface =

    //#region Service interface
    type ICompletionsApiService =
      abstract member CreateCompletion:HttpContext -> CreateCompletionArgs->CreateCompletionResult
    //#endregion