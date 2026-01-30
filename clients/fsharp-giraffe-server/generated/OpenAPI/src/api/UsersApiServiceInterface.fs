namespace OpenAPI
open UsersApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module UsersApiServiceInterface =

    //#region Service interface
    type IUsersApiService =
      abstract member DeleteUser:HttpContext -> DeleteUserArgs->DeleteUserResult
      abstract member ListUsers:HttpContext -> ListUsersArgs->ListUsersResult
      abstract member ModifyUser:HttpContext -> ModifyUserArgs->ModifyUserResult
      abstract member RetrieveUser:HttpContext -> RetrieveUserArgs->RetrieveUserResult
    //#endregion