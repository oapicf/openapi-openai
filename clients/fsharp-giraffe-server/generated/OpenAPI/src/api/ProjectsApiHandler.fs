namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ProjectsApiHandlerParams
open ProjectsApiServiceInterface
open ProjectsApiServiceImplementation
open OpenAPI.Model.ErrorResponse
open OpenAPI.Model.Project
open OpenAPI.Model.ProjectApiKey
open OpenAPI.Model.ProjectApiKeyDeleteResponse
open OpenAPI.Model.ProjectApiKeyListResponse
open OpenAPI.Model.ProjectCreateRequest
open OpenAPI.Model.ProjectListResponse
open OpenAPI.Model.ProjectRateLimit
open OpenAPI.Model.ProjectRateLimitListResponse
open OpenAPI.Model.ProjectRateLimitUpdateRequest
open OpenAPI.Model.ProjectServiceAccount
open OpenAPI.Model.ProjectServiceAccountCreateRequest
open OpenAPI.Model.ProjectServiceAccountCreateResponse
open OpenAPI.Model.ProjectServiceAccountDeleteResponse
open OpenAPI.Model.ProjectServiceAccountListResponse
open OpenAPI.Model.ProjectUpdateRequest
open OpenAPI.Model.ProjectUser
open OpenAPI.Model.ProjectUserCreateRequest
open OpenAPI.Model.ProjectUserDeleteResponse
open OpenAPI.Model.ProjectUserListResponse
open OpenAPI.Model.ProjectUserUpdateRequest

module ProjectsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ArchiveProject
    /// <summary>
    /// Archives a project in the organization. Archived projects cannot be used or updated.
    /// </summary>

    let ArchiveProject (pathParams:ArchiveProjectPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ArchiveProjectArgs
          let result = ProjectsApiService.ArchiveProject ctx serviceArgs
          return! (match result with
                      | ArchiveProjectStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateProject
    /// <summary>
    /// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    /// </summary>

    let CreateProject  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateProjectBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateProjectArgs
          let result = ProjectsApiService.CreateProject ctx serviceArgs
          return! (match result with
                      | CreateProjectStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateProjectServiceAccount
    /// <summary>
    /// Creates a new service account in the project. This also returns an unredacted API key for the service account.
    /// </summary>

    let CreateProjectServiceAccount (pathParams:CreateProjectServiceAccountPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateProjectServiceAccountBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateProjectServiceAccountArgs
          let result = ProjectsApiService.CreateProjectServiceAccount ctx serviceArgs
          return! (match result with
                      | CreateProjectServiceAccountStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CreateProjectServiceAccountStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateProjectUser
    /// <summary>
    /// Adds a user to the project. Users must already be members of the organization to be added to a project.
    /// </summary>

    let CreateProjectUser (pathParams:CreateProjectUserPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateProjectUserBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateProjectUserArgs
          let result = ProjectsApiService.CreateProjectUser ctx serviceArgs
          return! (match result with
                      | CreateProjectUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CreateProjectUserStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteProjectApiKey
    /// <summary>
    /// Deletes an API key from the project.
    /// </summary>

    let DeleteProjectApiKey (pathParams:DeleteProjectApiKeyPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteProjectApiKeyArgs
          let result = ProjectsApiService.DeleteProjectApiKey ctx serviceArgs
          return! (match result with
                      | DeleteProjectApiKeyStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteProjectApiKeyStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteProjectServiceAccount
    /// <summary>
    /// Deletes a service account from the project.
    /// </summary>

    let DeleteProjectServiceAccount (pathParams:DeleteProjectServiceAccountPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteProjectServiceAccountArgs
          let result = ProjectsApiService.DeleteProjectServiceAccount ctx serviceArgs
          return! (match result with
                      | DeleteProjectServiceAccountStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteProjectUser
    /// <summary>
    /// Deletes a user from the project.
    /// </summary>

    let DeleteProjectUser (pathParams:DeleteProjectUserPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteProjectUserArgs
          let result = ProjectsApiService.DeleteProjectUser ctx serviceArgs
          return! (match result with
                      | DeleteProjectUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteProjectUserStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListProjectApiKeys
    /// <summary>
    /// Returns a list of API keys in the project.
    /// </summary>

    let ListProjectApiKeys (pathParams:ListProjectApiKeysPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListProjectApiKeysQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListProjectApiKeysArgs
          let result = ProjectsApiService.ListProjectApiKeys ctx serviceArgs
          return! (match result with
                      | ListProjectApiKeysStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListProjectRateLimits
    /// <summary>
    /// Returns the rate limits per model for a project.
    /// </summary>

    let ListProjectRateLimits (pathParams:ListProjectRateLimitsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListProjectRateLimitsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListProjectRateLimitsArgs
          let result = ProjectsApiService.ListProjectRateLimits ctx serviceArgs
          return! (match result with
                      | ListProjectRateLimitsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListProjectServiceAccounts
    /// <summary>
    /// Returns a list of service accounts in the project.
    /// </summary>

    let ListProjectServiceAccounts (pathParams:ListProjectServiceAccountsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListProjectServiceAccountsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListProjectServiceAccountsArgs
          let result = ProjectsApiService.ListProjectServiceAccounts ctx serviceArgs
          return! (match result with
                      | ListProjectServiceAccountsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ListProjectServiceAccountsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListProjectUsers
    /// <summary>
    /// Returns a list of users in the project.
    /// </summary>

    let ListProjectUsers (pathParams:ListProjectUsersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListProjectUsersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListProjectUsersArgs
          let result = ProjectsApiService.ListProjectUsers ctx serviceArgs
          return! (match result with
                      | ListProjectUsersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ListProjectUsersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListProjects
    /// <summary>
    /// Returns a list of projects.
    /// </summary>

    let ListProjects  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListProjectsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ListProjectsArgs
          let result = ProjectsApiService.ListProjects ctx serviceArgs
          return! (match result with
                      | ListProjectsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ModifyProject
    /// <summary>
    /// Modifies a project in the organization.
    /// </summary>

    let ModifyProject (pathParams:ModifyProjectPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ModifyProjectBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ModifyProjectArgs
          let result = ProjectsApiService.ModifyProject ctx serviceArgs
          return! (match result with
                      | ModifyProjectStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ModifyProjectStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ModifyProjectUser
    /// <summary>
    /// Modifies a user&#39;s role in the project.
    /// </summary>

    let ModifyProjectUser (pathParams:ModifyProjectUserPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ModifyProjectUserBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ModifyProjectUserArgs
          let result = ProjectsApiService.ModifyProjectUser ctx serviceArgs
          return! (match result with
                      | ModifyProjectUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ModifyProjectUserStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveProject
    /// <summary>
    /// Retrieves a project.
    /// </summary>

    let RetrieveProject (pathParams:RetrieveProjectPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveProjectArgs
          let result = ProjectsApiService.RetrieveProject ctx serviceArgs
          return! (match result with
                      | RetrieveProjectStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveProjectApiKey
    /// <summary>
    /// Retrieves an API key in the project.
    /// </summary>

    let RetrieveProjectApiKey (pathParams:RetrieveProjectApiKeyPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveProjectApiKeyArgs
          let result = ProjectsApiService.RetrieveProjectApiKey ctx serviceArgs
          return! (match result with
                      | RetrieveProjectApiKeyStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveProjectServiceAccount
    /// <summary>
    /// Retrieves a service account in the project.
    /// </summary>

    let RetrieveProjectServiceAccount (pathParams:RetrieveProjectServiceAccountPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveProjectServiceAccountArgs
          let result = ProjectsApiService.RetrieveProjectServiceAccount ctx serviceArgs
          return! (match result with
                      | RetrieveProjectServiceAccountStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveProjectUser
    /// <summary>
    /// Retrieves a user in the project.
    /// </summary>

    let RetrieveProjectUser (pathParams:RetrieveProjectUserPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveProjectUserArgs
          let result = ProjectsApiService.RetrieveProjectUser ctx serviceArgs
          return! (match result with
                      | RetrieveProjectUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateProjectRateLimits
    /// <summary>
    /// Updates a project rate limit.
    /// </summary>

    let UpdateProjectRateLimits (pathParams:UpdateProjectRateLimitsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateProjectRateLimitsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateProjectRateLimitsArgs
          let result = ProjectsApiService.UpdateProjectRateLimits ctx serviceArgs
          return! (match result with
                      | UpdateProjectRateLimitsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateProjectRateLimitsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

