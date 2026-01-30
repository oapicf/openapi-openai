namespace OpenAPI
open RealtimeApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module RealtimeApiServiceInterface =

    //#region Service interface
    type IRealtimeApiService =
      abstract member CreateRealtimeSession : CreateRealtimeSessionBodyParams -> CreateRealtimeSessionResult
    //#endregion