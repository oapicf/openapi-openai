namespace OpenAPI
open ModerationsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ModerationsApiServiceInterface =

    //#region Service interface
    type IModerationsApiService =
      abstract member CreateModeration : CreateModerationBodyParams -> CreateModerationResult
    //#endregion