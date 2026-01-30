namespace OpenAPI
open ProjectsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ProjectsApiServiceInterface =

    //#region Service interface
    type IProjectsApiService =
      abstract member ArchiveProject : unit -> ArchiveProjectResult
      abstract member CreateProject : CreateProjectBodyParams -> CreateProjectResult
      abstract member CreateProjectServiceAccount : CreateProjectServiceAccountBodyParams -> CreateProjectServiceAccountResult
      abstract member CreateProjectUser : CreateProjectUserBodyParams -> CreateProjectUserResult
      abstract member DeleteProjectApiKey : unit -> DeleteProjectApiKeyResult
      abstract member DeleteProjectServiceAccount : unit -> DeleteProjectServiceAccountResult
      abstract member DeleteProjectUser : unit -> DeleteProjectUserResult
      abstract member ListProjectApiKeys : unit -> ListProjectApiKeysResult
      abstract member ListProjectRateLimits : unit -> ListProjectRateLimitsResult
      abstract member ListProjectServiceAccounts : unit -> ListProjectServiceAccountsResult
      abstract member ListProjectUsers : unit -> ListProjectUsersResult
      abstract member ListProjects : unit -> ListProjectsResult
      abstract member ModifyProject : ModifyProjectBodyParams -> ModifyProjectResult
      abstract member ModifyProjectUser : ModifyProjectUserBodyParams -> ModifyProjectUserResult
      abstract member RetrieveProject : unit -> RetrieveProjectResult
      abstract member RetrieveProjectApiKey : unit -> RetrieveProjectApiKeyResult
      abstract member RetrieveProjectServiceAccount : unit -> RetrieveProjectServiceAccountResult
      abstract member RetrieveProjectUser : unit -> RetrieveProjectUserResult
      abstract member UpdateProjectRateLimits : UpdateProjectRateLimitsBodyParams -> UpdateProjectRateLimitsResult
    //#endregion