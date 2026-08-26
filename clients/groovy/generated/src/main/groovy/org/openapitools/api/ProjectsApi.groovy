package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ErrorResponse
import org.openapitools.model.Project
import org.openapitools.model.ProjectApiKey
import org.openapitools.model.ProjectApiKeyDeleteResponse
import org.openapitools.model.ProjectApiKeyListResponse
import org.openapitools.model.ProjectCreateRequest
import org.openapitools.model.ProjectListResponse
import org.openapitools.model.ProjectRateLimit
import org.openapitools.model.ProjectRateLimitListResponse
import org.openapitools.model.ProjectRateLimitUpdateRequest
import org.openapitools.model.ProjectServiceAccount
import org.openapitools.model.ProjectServiceAccountCreateRequest
import org.openapitools.model.ProjectServiceAccountCreateResponse
import org.openapitools.model.ProjectServiceAccountDeleteResponse
import org.openapitools.model.ProjectServiceAccountListResponse
import org.openapitools.model.ProjectUpdateRequest
import org.openapitools.model.ProjectUser
import org.openapitools.model.ProjectUserCreateRequest
import org.openapitools.model.ProjectUserDeleteResponse
import org.openapitools.model.ProjectUserListResponse
import org.openapitools.model.ProjectUserUpdateRequest

class ProjectsApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def archiveProject ( String projectId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/archive"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Project.class )

    }

    def createProject ( ProjectCreateRequest projectCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectCreateRequest == null) {
            throw new RuntimeException("missing required params projectCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = projectCreateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Project.class )

    }

    def createProjectServiceAccount ( String projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/service_accounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (projectServiceAccountCreateRequest == null) {
            throw new RuntimeException("missing required params projectServiceAccountCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = projectServiceAccountCreateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProjectServiceAccountCreateResponse.class )

    }

    def createProjectUser ( String projectId, ProjectUserCreateRequest projectUserCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (projectUserCreateRequest == null) {
            throw new RuntimeException("missing required params projectUserCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = projectUserCreateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProjectUser.class )

    }

    def deleteProjectApiKey ( String projectId, String keyId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/api_keys/${key_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (keyId == null) {
            throw new RuntimeException("missing required params keyId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    ProjectApiKeyDeleteResponse.class )

    }

    def deleteProjectServiceAccount ( String projectId, String serviceAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/service_accounts/${service_account_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (serviceAccountId == null) {
            throw new RuntimeException("missing required params serviceAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    ProjectServiceAccountDeleteResponse.class )

    }

    def deleteProjectUser ( String projectId, String userId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    ProjectUserDeleteResponse.class )

    }

    def listProjectApiKeys ( String projectId, Integer limit, String after, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/api_keys"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (after != null) {
            queryParams.put("after", after)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProjectApiKeyListResponse.class )

    }

    def listProjectRateLimits ( String projectId, Integer limit, String after, String before, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/rate_limits"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProjectRateLimitListResponse.class )

    }

    def listProjectServiceAccounts ( String projectId, Integer limit, String after, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/service_accounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (after != null) {
            queryParams.put("after", after)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProjectServiceAccountListResponse.class )

    }

    def listProjectUsers ( String projectId, Integer limit, String after, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (after != null) {
            queryParams.put("after", after)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProjectUserListResponse.class )

    }

    def listProjects ( Integer limit, String after, Boolean includeArchived, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (includeArchived != null) {
            queryParams.put("include_archived", includeArchived)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProjectListResponse.class )

    }

    def modifyProject ( String projectId, ProjectUpdateRequest projectUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (projectUpdateRequest == null) {
            throw new RuntimeException("missing required params projectUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = projectUpdateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Project.class )

    }

    def modifyProjectUser ( String projectId, String userId, ProjectUserUpdateRequest projectUserUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (projectUserUpdateRequest == null) {
            throw new RuntimeException("missing required params projectUserUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = projectUserUpdateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProjectUser.class )

    }

    def retrieveProject ( String projectId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Project.class )

    }

    def retrieveProjectApiKey ( String projectId, String keyId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/api_keys/${key_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (keyId == null) {
            throw new RuntimeException("missing required params keyId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProjectApiKey.class )

    }

    def retrieveProjectServiceAccount ( String projectId, String serviceAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/service_accounts/${service_account_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (serviceAccountId == null) {
            throw new RuntimeException("missing required params serviceAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProjectServiceAccount.class )

    }

    def retrieveProjectUser ( String projectId, String userId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProjectUser.class )

    }

    def updateProjectRateLimits ( String projectId, String rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/projects/${project_id}/rate_limits/${rate_limit_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (projectId == null) {
            throw new RuntimeException("missing required params projectId")
        }
        // verify required params are set
        if (rateLimitId == null) {
            throw new RuntimeException("missing required params rateLimitId")
        }
        // verify required params are set
        if (projectRateLimitUpdateRequest == null) {
            throw new RuntimeException("missing required params projectRateLimitUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = projectRateLimitUpdateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProjectRateLimit.class )

    }

}
