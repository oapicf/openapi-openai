namespace OpenAPI
open OpenAPI.Model.User
open OpenAPI.Model.UserDeleteResponse
open OpenAPI.Model.UserListResponse
open OpenAPI.Model.UserRoleUpdateRequest
open UsersApiHandlerParams
open UsersApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module UsersApiServiceImplementation =

    //#region Service implementation
    type UsersApiServiceImpl() =
      interface IUsersApiService with

        member this.DeleteUser ctx args =
            let content = "User deleted successfully." :> obj :?> UserDeleteResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteUserStatusCode200 { content = content }

        member this.ListUsers ctx args =
            let content = "Users listed successfully." :> obj :?> UserListResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListUsersStatusCode200 { content = content }

        member this.ModifyUser ctx args =
            let content = "User role updated successfully." :> obj :?> User // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyUserStatusCode200 { content = content }

        member this.RetrieveUser ctx args =
            let content = "User retrieved successfully." :> obj :?> User // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveUserStatusCode200 { content = content }

      //#endregion

    let UsersApiService = UsersApiServiceImpl() :> IUsersApiService