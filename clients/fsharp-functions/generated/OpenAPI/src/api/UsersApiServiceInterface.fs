namespace OpenAPI
open UsersApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module UsersApiServiceInterface =

    //#region Service interface
    type IUsersApiService =
      abstract member DeleteUser : unit -> DeleteUserResult
      abstract member ListUsers : unit -> ListUsersResult
      abstract member ModifyUser : ModifyUserBodyParams -> ModifyUserResult
      abstract member RetrieveUser : unit -> RetrieveUserResult
    //#endregion