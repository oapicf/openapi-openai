namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open UsersApiHandlerParams
open UsersApiServiceInterface
open UsersApiServiceImplementation
open OpenAPI.Model.User
open OpenAPI.Model.UserDeleteResponse
open OpenAPI.Model.UserListResponse
open OpenAPI.Model.UserRoleUpdateRequest

module UsersApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteUser
    /// <summary>
    /// Deletes a user from the organization.
    /// </summary>

    let DeleteUser (pathParams:DeleteUserPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteUserArgs
          let result = UsersApiService.DeleteUser ctx serviceArgs
          return! (match result with
                      | DeleteUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListUsers
    /// <summary>
    /// Lists all of the users in the organization.
    /// </summary>

    let ListUsers  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListUsersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ListUsersArgs
          let result = UsersApiService.ListUsers ctx serviceArgs
          return! (match result with
                      | ListUsersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ModifyUser
    /// <summary>
    /// Modifies a user&#39;s role in the organization.
    /// </summary>

    let ModifyUser (pathParams:ModifyUserPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ModifyUserBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ModifyUserArgs
          let result = UsersApiService.ModifyUser ctx serviceArgs
          return! (match result with
                      | ModifyUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveUser
    /// <summary>
    /// Retrieves a user by their identifier.
    /// </summary>

    let RetrieveUser (pathParams:RetrieveUserPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveUserArgs
          let result = UsersApiService.RetrieveUser ctx serviceArgs
          return! (match result with
                      | RetrieveUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

