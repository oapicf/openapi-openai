namespace OpenAPI
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
open ProjectsApiHandlerParams
open ProjectsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ProjectsApiServiceImplementation =

    //#region Service implementation
    type ProjectsApiServiceImpl() =
      interface IProjectsApiService with

        member this.ArchiveProject ctx args =
            let content = "Project archived successfully." :> obj :?> Project // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ArchiveProjectStatusCode200 { content = content }

        member this.CreateProject ctx args =
            let content = "Project created successfully." :> obj :?> Project // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateProjectStatusCode200 { content = content }

        member this.CreateProjectServiceAccount ctx args =
          if true then
            let content = "Project service account created successfully." :> obj :?> ProjectServiceAccountCreateResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateProjectServiceAccountStatusCode200 { content = content }
          else
            let content = "Error response when project is archived." :> obj :?> ErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateProjectServiceAccountStatusCode400 { content = content }

        member this.CreateProjectUser ctx args =
          if true then
            let content = "User added to project successfully." :> obj :?> ProjectUser // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateProjectUserStatusCode200 { content = content }
          else
            let content = "Error response for various conditions." :> obj :?> ErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateProjectUserStatusCode400 { content = content }

        member this.DeleteProjectApiKey ctx args =
          if true then
            let content = "Project API key deleted successfully." :> obj :?> ProjectApiKeyDeleteResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteProjectApiKeyStatusCode200 { content = content }
          else
            let content = "Error response for various conditions." :> obj :?> ErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteProjectApiKeyStatusCode400 { content = content }

        member this.DeleteProjectServiceAccount ctx args =
            let content = "Project service account deleted successfully." :> obj :?> ProjectServiceAccountDeleteResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteProjectServiceAccountStatusCode200 { content = content }

        member this.DeleteProjectUser ctx args =
          if true then
            let content = "Project user deleted successfully." :> obj :?> ProjectUserDeleteResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteProjectUserStatusCode200 { content = content }
          else
            let content = "Error response for various conditions." :> obj :?> ErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteProjectUserStatusCode400 { content = content }

        member this.ListProjectApiKeys ctx args =
            let content = "Project API keys listed successfully." :> obj :?> ProjectApiKeyListResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListProjectApiKeysStatusCode200 { content = content }

        member this.ListProjectRateLimits ctx args =
            let content = "Project rate limits listed successfully." :> obj :?> ProjectRateLimitListResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListProjectRateLimitsStatusCode200 { content = content }

        member this.ListProjectServiceAccounts ctx args =
          if true then
            let content = "Project service accounts listed successfully." :> obj :?> ProjectServiceAccountListResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListProjectServiceAccountsStatusCode200 { content = content }
          else
            let content = "Error response when project is archived." :> obj :?> ErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListProjectServiceAccountsStatusCode400 { content = content }

        member this.ListProjectUsers ctx args =
          if true then
            let content = "Project users listed successfully." :> obj :?> ProjectUserListResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListProjectUsersStatusCode200 { content = content }
          else
            let content = "Error response when project is archived." :> obj :?> ErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListProjectUsersStatusCode400 { content = content }

        member this.ListProjects ctx args =
            let content = "Projects listed successfully." :> obj :?> ProjectListResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListProjectsStatusCode200 { content = content }

        member this.ModifyProject ctx args =
          if true then
            let content = "Project updated successfully." :> obj :?> Project // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyProjectStatusCode200 { content = content }
          else
            let content = "Error response when updating the default project." :> obj :?> ErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyProjectStatusCode400 { content = content }

        member this.ModifyProjectUser ctx args =
          if true then
            let content = "Project user&#39;s role updated successfully." :> obj :?> ProjectUser // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyProjectUserStatusCode200 { content = content }
          else
            let content = "Error response for various conditions." :> obj :?> ErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyProjectUserStatusCode400 { content = content }

        member this.RetrieveProject ctx args =
            let content = "Project retrieved successfully." :> obj :?> Project // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveProjectStatusCode200 { content = content }

        member this.RetrieveProjectApiKey ctx args =
            let content = "Project API key retrieved successfully." :> obj :?> ProjectApiKey // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveProjectApiKeyStatusCode200 { content = content }

        member this.RetrieveProjectServiceAccount ctx args =
            let content = "Project service account retrieved successfully." :> obj :?> ProjectServiceAccount // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveProjectServiceAccountStatusCode200 { content = content }

        member this.RetrieveProjectUser ctx args =
            let content = "Project user retrieved successfully." :> obj :?> ProjectUser // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveProjectUserStatusCode200 { content = content }

        member this.UpdateProjectRateLimits ctx args =
          if true then
            let content = "Project rate limit updated successfully." :> obj :?> ProjectRateLimit // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateProjectRateLimitsStatusCode200 { content = content }
          else
            let content = "Error response for various conditions." :> obj :?> ErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateProjectRateLimitsStatusCode400 { content = content }

      //#endregion

    let ProjectsApiService = ProjectsApiServiceImpl() :> IProjectsApiService