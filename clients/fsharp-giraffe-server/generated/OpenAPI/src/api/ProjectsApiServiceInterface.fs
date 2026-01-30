namespace OpenAPI
open ProjectsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ProjectsApiServiceInterface =

    //#region Service interface
    type IProjectsApiService =
      abstract member ArchiveProject:HttpContext -> ArchiveProjectArgs->ArchiveProjectResult
      abstract member CreateProject:HttpContext -> CreateProjectArgs->CreateProjectResult
      abstract member CreateProjectServiceAccount:HttpContext -> CreateProjectServiceAccountArgs->CreateProjectServiceAccountResult
      abstract member CreateProjectUser:HttpContext -> CreateProjectUserArgs->CreateProjectUserResult
      abstract member DeleteProjectApiKey:HttpContext -> DeleteProjectApiKeyArgs->DeleteProjectApiKeyResult
      abstract member DeleteProjectServiceAccount:HttpContext -> DeleteProjectServiceAccountArgs->DeleteProjectServiceAccountResult
      abstract member DeleteProjectUser:HttpContext -> DeleteProjectUserArgs->DeleteProjectUserResult
      abstract member ListProjectApiKeys:HttpContext -> ListProjectApiKeysArgs->ListProjectApiKeysResult
      abstract member ListProjectRateLimits:HttpContext -> ListProjectRateLimitsArgs->ListProjectRateLimitsResult
      abstract member ListProjectServiceAccounts:HttpContext -> ListProjectServiceAccountsArgs->ListProjectServiceAccountsResult
      abstract member ListProjectUsers:HttpContext -> ListProjectUsersArgs->ListProjectUsersResult
      abstract member ListProjects:HttpContext -> ListProjectsArgs->ListProjectsResult
      abstract member ModifyProject:HttpContext -> ModifyProjectArgs->ModifyProjectResult
      abstract member ModifyProjectUser:HttpContext -> ModifyProjectUserArgs->ModifyProjectUserResult
      abstract member RetrieveProject:HttpContext -> RetrieveProjectArgs->RetrieveProjectResult
      abstract member RetrieveProjectApiKey:HttpContext -> RetrieveProjectApiKeyArgs->RetrieveProjectApiKeyResult
      abstract member RetrieveProjectServiceAccount:HttpContext -> RetrieveProjectServiceAccountArgs->RetrieveProjectServiceAccountResult
      abstract member RetrieveProjectUser:HttpContext -> RetrieveProjectUserArgs->RetrieveProjectUserResult
      abstract member UpdateProjectRateLimits:HttpContext -> UpdateProjectRateLimitsArgs->UpdateProjectRateLimitsResult
    //#endregion