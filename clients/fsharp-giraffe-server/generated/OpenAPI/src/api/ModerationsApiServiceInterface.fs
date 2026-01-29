namespace OpenAPI
open ModerationsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ModerationsApiServiceInterface =

    //#region Service interface
    type IModerationsApiService =
      abstract member CreateModeration:HttpContext -> CreateModerationArgs->CreateModerationResult
    //#endregion