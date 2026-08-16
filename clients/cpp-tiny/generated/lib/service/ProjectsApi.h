#ifndef TINY_CPP_CLIENT_ProjectsApi_H_
#define TINY_CPP_CLIENT_ProjectsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ErrorResponse.h"
#include "Project.h"
#include "ProjectApiKey.h"
#include "ProjectApiKeyDeleteResponse.h"
#include "ProjectApiKeyListResponse.h"
#include "ProjectCreateRequest.h"
#include "ProjectListResponse.h"
#include "ProjectRateLimit.h"
#include "ProjectRateLimitListResponse.h"
#include "ProjectRateLimitUpdateRequest.h"
#include "ProjectServiceAccount.h"
#include "ProjectServiceAccountCreateRequest.h"
#include "ProjectServiceAccountCreateResponse.h"
#include "ProjectServiceAccountDeleteResponse.h"
#include "ProjectServiceAccountListResponse.h"
#include "ProjectUpdateRequest.h"
#include "ProjectUser.h"
#include "ProjectUserCreateRequest.h"
#include "ProjectUserDeleteResponse.h"
#include "ProjectUserListResponse.h"
#include "ProjectUserUpdateRequest.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ProjectsApi : public Service {
public:
    ProjectsApi() = default;

    virtual ~ProjectsApi() = default;

    /**
    * Archives a project in the organization. Archived projects cannot be used or updated..
    *
    * 
    * \param projectId The ID of the project. *Required*
    */
    Response<
                Project
        >
    archiveProject(
            
            std::string projectId
            
    );
    /**
    * Create a new project in the organization. Projects can be created and archived, but cannot be deleted..
    *
    * 
    * \param projectCreateRequest The project create request payload. *Required*
    */
    Response<
                Project
        >
    createProject(
            
            ProjectCreateRequest projectCreateRequest
            
    );
    /**
    * Creates a new service account in the project. This also returns an unredacted API key for the service account..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param projectServiceAccountCreateRequest The project service account create request payload. *Required*
    */
    Response<
                ProjectServiceAccountCreateResponse
        >
    createProjectServiceAccount(
            
            std::string projectId
            , 
            
            ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest
            
    );
    /**
    * Adds a user to the project. Users must already be members of the organization to be added to a project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param projectUserCreateRequest The project user create request payload. *Required*
    */
    Response<
                ProjectUser
        >
    createProjectUser(
            
            std::string projectId
            , 
            
            ProjectUserCreateRequest projectUserCreateRequest
            
    );
    /**
    * Deletes an API key from the project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param keyId The ID of the API key. *Required*
    */
    Response<
                ProjectApiKeyDeleteResponse
        >
    deleteProjectApiKey(
            
            std::string projectId
            , 
            
            std::string keyId
            
    );
    /**
    * Deletes a service account from the project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param serviceAccountId The ID of the service account. *Required*
    */
    Response<
                ProjectServiceAccountDeleteResponse
        >
    deleteProjectServiceAccount(
            
            std::string projectId
            , 
            
            std::string serviceAccountId
            
    );
    /**
    * Deletes a user from the project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param userId The ID of the user. *Required*
    */
    Response<
                ProjectUserDeleteResponse
        >
    deleteProjectUser(
            
            std::string projectId
            , 
            
            std::string userId
            
    );
    /**
    * Returns a list of API keys in the project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    */
    Response<
                ProjectApiKeyListResponse
        >
    listProjectApiKeys(
            
            std::string projectId
            , 
            
            int limit
            , 
            
            std::string after
            
    );
    /**
    * Returns the rate limits per model for a project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param limit A limit on the number of objects to be returned. The default is 100. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    */
    Response<
                ProjectRateLimitListResponse
        >
    listProjectRateLimits(
            
            std::string projectId
            , 
            
            int limit
            , 
            
            std::string after
            , 
            
            std::string before
            
    );
    /**
    * Returns a list of service accounts in the project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    */
    Response<
                ProjectServiceAccountListResponse
        >
    listProjectServiceAccounts(
            
            std::string projectId
            , 
            
            int limit
            , 
            
            std::string after
            
    );
    /**
    * Returns a list of users in the project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    */
    Response<
                ProjectUserListResponse
        >
    listProjectUsers(
            
            std::string projectId
            , 
            
            int limit
            , 
            
            std::string after
            
    );
    /**
    * Returns a list of projects..
    *
    * 
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    * \param includeArchived If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
    */
    Response<
                ProjectListResponse
        >
    listProjects(
            
            int limit
            , 
            
            std::string after
            , 
            
            bool includeArchived
            
    );
    /**
    * Modifies a project in the organization..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param projectUpdateRequest The project update request payload. *Required*
    */
    Response<
                Project
        >
    modifyProject(
            
            std::string projectId
            , 
            
            ProjectUpdateRequest projectUpdateRequest
            
    );
    /**
    * Modifies a user's role in the project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param userId The ID of the user. *Required*
    * \param projectUserUpdateRequest The project user update request payload. *Required*
    */
    Response<
                ProjectUser
        >
    modifyProjectUser(
            
            std::string projectId
            , 
            
            std::string userId
            , 
            
            ProjectUserUpdateRequest projectUserUpdateRequest
            
    );
    /**
    * Retrieves a project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    */
    Response<
                Project
        >
    retrieveProject(
            
            std::string projectId
            
    );
    /**
    * Retrieves an API key in the project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param keyId The ID of the API key. *Required*
    */
    Response<
                ProjectApiKey
        >
    retrieveProjectApiKey(
            
            std::string projectId
            , 
            
            std::string keyId
            
    );
    /**
    * Retrieves a service account in the project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param serviceAccountId The ID of the service account. *Required*
    */
    Response<
                ProjectServiceAccount
        >
    retrieveProjectServiceAccount(
            
            std::string projectId
            , 
            
            std::string serviceAccountId
            
    );
    /**
    * Retrieves a user in the project..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param userId The ID of the user. *Required*
    */
    Response<
                ProjectUser
        >
    retrieveProjectUser(
            
            std::string projectId
            , 
            
            std::string userId
            
    );
    /**
    * Updates a project rate limit..
    *
    * 
    * \param projectId The ID of the project. *Required*
    * \param rateLimitId The ID of the rate limit. *Required*
    * \param projectRateLimitUpdateRequest The project rate limit update request payload. *Required*
    */
    Response<
                ProjectRateLimit
        >
    updateProjectRateLimits(
            
            std::string projectId
            , 
            
            std::string rateLimitId
            , 
            
            ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ProjectsApi_H_ */