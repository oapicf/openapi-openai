namespace OpenAPI
open RealtimeApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module RealtimeApiServiceInterface =

    //#region Service interface
    type IRealtimeApiService =
      abstract member CreateRealtimeSession:HttpContext -> CreateRealtimeSessionArgs->CreateRealtimeSessionResult
    //#endregion