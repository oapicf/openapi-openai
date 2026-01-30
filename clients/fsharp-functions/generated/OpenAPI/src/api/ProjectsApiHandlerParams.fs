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
open System.Collections.Generic
open System

module ProjectsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type ArchiveProjectPathParams = {
      projectId : string ;
    }
    //#endregion


    type ArchiveProjectStatusCode200Response = {
      content:Project;
      
    }
    type ArchiveProjectResult = ArchiveProjectStatusCode200 of ArchiveProjectStatusCode200Response

    type ArchiveProjectArgs = {
      pathParams:ArchiveProjectPathParams;
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateProjectBodyParams = ProjectCreateRequest
    //#endregion


    type CreateProjectStatusCode200Response = {
      content:Project;
      
    }
    type CreateProjectResult = CreateProjectStatusCode200 of CreateProjectStatusCode200Response

    type CreateProjectArgs = {
      bodyParams:CreateProjectBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CreateProjectServiceAccountPathParams = {
      projectId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateProjectServiceAccountBodyParams = ProjectServiceAccountCreateRequest
    //#endregion


    type CreateProjectServiceAccountStatusCode200Response = {
      content:ProjectServiceAccountCreateResponse;
      
    }

    type CreateProjectServiceAccountStatusCode400Response = {
      content:ErrorResponse;
      
    }
    type CreateProjectServiceAccountResult = CreateProjectServiceAccountStatusCode200 of CreateProjectServiceAccountStatusCode200Response|CreateProjectServiceAccountStatusCode400 of CreateProjectServiceAccountStatusCode400Response

    type CreateProjectServiceAccountArgs = {
      pathParams:CreateProjectServiceAccountPathParams;
      bodyParams:CreateProjectServiceAccountBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CreateProjectUserPathParams = {
      projectId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateProjectUserBodyParams = ProjectUserCreateRequest
    //#endregion


    type CreateProjectUserStatusCode200Response = {
      content:ProjectUser;
      
    }

    type CreateProjectUserStatusCode400Response = {
      content:ErrorResponse;
      
    }
    type CreateProjectUserResult = CreateProjectUserStatusCode200 of CreateProjectUserStatusCode200Response|CreateProjectUserStatusCode400 of CreateProjectUserStatusCode400Response

    type CreateProjectUserArgs = {
      pathParams:CreateProjectUserPathParams;
      bodyParams:CreateProjectUserBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteProjectApiKeyPathParams = {
      projectId : string ;
    //#endregion
      keyId : string ;
    }
    //#endregion


    type DeleteProjectApiKeyStatusCode200Response = {
      content:ProjectApiKeyDeleteResponse;
      
    }

    type DeleteProjectApiKeyStatusCode400Response = {
      content:ErrorResponse;
      
    }
    type DeleteProjectApiKeyResult = DeleteProjectApiKeyStatusCode200 of DeleteProjectApiKeyStatusCode200Response|DeleteProjectApiKeyStatusCode400 of DeleteProjectApiKeyStatusCode400Response

    type DeleteProjectApiKeyArgs = {
      pathParams:DeleteProjectApiKeyPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteProjectServiceAccountPathParams = {
      projectId : string ;
    //#endregion
      serviceAccountId : string ;
    }
    //#endregion


    type DeleteProjectServiceAccountStatusCode200Response = {
      content:ProjectServiceAccountDeleteResponse;
      
    }
    type DeleteProjectServiceAccountResult = DeleteProjectServiceAccountStatusCode200 of DeleteProjectServiceAccountStatusCode200Response

    type DeleteProjectServiceAccountArgs = {
      pathParams:DeleteProjectServiceAccountPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteProjectUserPathParams = {
      projectId : string ;
    //#endregion
      userId : string ;
    }
    //#endregion


    type DeleteProjectUserStatusCode200Response = {
      content:ProjectUserDeleteResponse;
      
    }

    type DeleteProjectUserStatusCode400Response = {
      content:ErrorResponse;
      
    }
    type DeleteProjectUserResult = DeleteProjectUserStatusCode200 of DeleteProjectUserStatusCode200Response|DeleteProjectUserStatusCode400 of DeleteProjectUserStatusCode400Response

    type DeleteProjectUserArgs = {
      pathParams:DeleteProjectUserPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListProjectApiKeysPathParams = {
      projectId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListProjectApiKeysQueryParams = {
      limit : int option;


      after : string option;

    }
    //#endregion


    type ListProjectApiKeysStatusCode200Response = {
      content:ProjectApiKeyListResponse;
      
    }
    type ListProjectApiKeysResult = ListProjectApiKeysStatusCode200 of ListProjectApiKeysStatusCode200Response

    type ListProjectApiKeysArgs = {
      pathParams:ListProjectApiKeysPathParams;
      queryParams:Result<ListProjectApiKeysQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListProjectRateLimitsPathParams = {
      projectId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListProjectRateLimitsQueryParams = {
      limit : int option;


      after : string option;


      before : string option;

    }
    //#endregion


    type ListProjectRateLimitsStatusCode200Response = {
      content:ProjectRateLimitListResponse;
      
    }
    type ListProjectRateLimitsResult = ListProjectRateLimitsStatusCode200 of ListProjectRateLimitsStatusCode200Response

    type ListProjectRateLimitsArgs = {
      pathParams:ListProjectRateLimitsPathParams;
      queryParams:Result<ListProjectRateLimitsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListProjectServiceAccountsPathParams = {
      projectId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListProjectServiceAccountsQueryParams = {
      limit : int option;


      after : string option;

    }
    //#endregion


    type ListProjectServiceAccountsStatusCode200Response = {
      content:ProjectServiceAccountListResponse;
      
    }

    type ListProjectServiceAccountsStatusCode400Response = {
      content:ErrorResponse;
      
    }
    type ListProjectServiceAccountsResult = ListProjectServiceAccountsStatusCode200 of ListProjectServiceAccountsStatusCode200Response|ListProjectServiceAccountsStatusCode400 of ListProjectServiceAccountsStatusCode400Response

    type ListProjectServiceAccountsArgs = {
      pathParams:ListProjectServiceAccountsPathParams;
      queryParams:Result<ListProjectServiceAccountsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListProjectUsersPathParams = {
      projectId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListProjectUsersQueryParams = {
      limit : int option;


      after : string option;

    }
    //#endregion


    type ListProjectUsersStatusCode200Response = {
      content:ProjectUserListResponse;
      
    }

    type ListProjectUsersStatusCode400Response = {
      content:ErrorResponse;
      
    }
    type ListProjectUsersResult = ListProjectUsersStatusCode200 of ListProjectUsersStatusCode200Response|ListProjectUsersStatusCode400 of ListProjectUsersStatusCode400Response

    type ListProjectUsersArgs = {
      pathParams:ListProjectUsersPathParams;
      queryParams:Result<ListProjectUsersQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ListProjectsQueryParams = {
      limit : int option;


      after : string option;


      includeArchived : bool option;

    }
    //#endregion


    type ListProjectsStatusCode200Response = {
      content:ProjectListResponse;
      
    }
    type ListProjectsResult = ListProjectsStatusCode200 of ListProjectsStatusCode200Response

    type ListProjectsArgs = {
      queryParams:Result<ListProjectsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ModifyProjectPathParams = {
      projectId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ModifyProjectBodyParams = ProjectUpdateRequest
    //#endregion


    type ModifyProjectStatusCode200Response = {
      content:Project;
      
    }

    type ModifyProjectStatusCode400Response = {
      content:ErrorResponse;
      
    }
    type ModifyProjectResult = ModifyProjectStatusCode200 of ModifyProjectStatusCode200Response|ModifyProjectStatusCode400 of ModifyProjectStatusCode400Response

    type ModifyProjectArgs = {
      pathParams:ModifyProjectPathParams;
      bodyParams:ModifyProjectBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ModifyProjectUserPathParams = {
      projectId : string ;
    //#endregion
      userId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ModifyProjectUserBodyParams = ProjectUserUpdateRequest
    //#endregion


    type ModifyProjectUserStatusCode200Response = {
      content:ProjectUser;
      
    }

    type ModifyProjectUserStatusCode400Response = {
      content:ErrorResponse;
      
    }
    type ModifyProjectUserResult = ModifyProjectUserStatusCode200 of ModifyProjectUserStatusCode200Response|ModifyProjectUserStatusCode400 of ModifyProjectUserStatusCode400Response

    type ModifyProjectUserArgs = {
      pathParams:ModifyProjectUserPathParams;
      bodyParams:ModifyProjectUserBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveProjectPathParams = {
      projectId : string ;
    }
    //#endregion


    type RetrieveProjectStatusCode200Response = {
      content:Project;
      
    }
    type RetrieveProjectResult = RetrieveProjectStatusCode200 of RetrieveProjectStatusCode200Response

    type RetrieveProjectArgs = {
      pathParams:RetrieveProjectPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveProjectApiKeyPathParams = {
      projectId : string ;
    //#endregion
      keyId : string ;
    }
    //#endregion


    type RetrieveProjectApiKeyStatusCode200Response = {
      content:ProjectApiKey;
      
    }
    type RetrieveProjectApiKeyResult = RetrieveProjectApiKeyStatusCode200 of RetrieveProjectApiKeyStatusCode200Response

    type RetrieveProjectApiKeyArgs = {
      pathParams:RetrieveProjectApiKeyPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveProjectServiceAccountPathParams = {
      projectId : string ;
    //#endregion
      serviceAccountId : string ;
    }
    //#endregion


    type RetrieveProjectServiceAccountStatusCode200Response = {
      content:ProjectServiceAccount;
      
    }
    type RetrieveProjectServiceAccountResult = RetrieveProjectServiceAccountStatusCode200 of RetrieveProjectServiceAccountStatusCode200Response

    type RetrieveProjectServiceAccountArgs = {
      pathParams:RetrieveProjectServiceAccountPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveProjectUserPathParams = {
      projectId : string ;
    //#endregion
      userId : string ;
    }
    //#endregion


    type RetrieveProjectUserStatusCode200Response = {
      content:ProjectUser;
      
    }
    type RetrieveProjectUserResult = RetrieveProjectUserStatusCode200 of RetrieveProjectUserStatusCode200Response

    type RetrieveProjectUserArgs = {
      pathParams:RetrieveProjectUserPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateProjectRateLimitsPathParams = {
      projectId : string ;
    //#endregion
      rateLimitId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateProjectRateLimitsBodyParams = ProjectRateLimitUpdateRequest
    //#endregion


    type UpdateProjectRateLimitsStatusCode200Response = {
      content:ProjectRateLimit;
      
    }

    type UpdateProjectRateLimitsStatusCode400Response = {
      content:ErrorResponse;
      
    }
    type UpdateProjectRateLimitsResult = UpdateProjectRateLimitsStatusCode200 of UpdateProjectRateLimitsStatusCode200Response|UpdateProjectRateLimitsStatusCode400 of UpdateProjectRateLimitsStatusCode400Response

    type UpdateProjectRateLimitsArgs = {
      pathParams:UpdateProjectRateLimitsPathParams;
      bodyParams:UpdateProjectRateLimitsBodyParams
    }
