#ifndef _ProjectsManager_H_
#define _ProjectsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Projects Projects
 * \ingroup Operations
 *  @{
 */
class ProjectsManager {
public:
	ProjectsManager();
	virtual ~ProjectsManager();

/*! \brief Archives a project in the organization. Archived projects cannot be used or updated.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool archiveProjectSync(char * accessToken,
	std::string projectId, 
	void(* handler)(Project, Error, void* )
	, void* userData);

/*! \brief Archives a project in the organization. Archived projects cannot be used or updated.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool archiveProjectAsync(char * accessToken,
	std::string projectId, 
	void(* handler)(Project, Error, void* )
	, void* userData);


/*! \brief Create a new project in the organization. Projects can be created and archived, but cannot be deleted.. *Synchronous*
 *
 * 
 * \param projectCreateRequest The project create request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createProjectSync(char * accessToken,
	std::shared_ptr<ProjectCreateRequest> projectCreateRequest, 
	void(* handler)(Project, Error, void* )
	, void* userData);

/*! \brief Create a new project in the organization. Projects can be created and archived, but cannot be deleted.. *Asynchronous*
 *
 * 
 * \param projectCreateRequest The project create request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createProjectAsync(char * accessToken,
	std::shared_ptr<ProjectCreateRequest> projectCreateRequest, 
	void(* handler)(Project, Error, void* )
	, void* userData);


/*! \brief Creates a new service account in the project. This also returns an unredacted API key for the service account.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param projectServiceAccountCreateRequest The project service account create request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createProjectServiceAccountSync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectServiceAccountCreateRequest> projectServiceAccountCreateRequest, 
	void(* handler)(ProjectServiceAccountCreateResponse, Error, void* )
	, void* userData);

/*! \brief Creates a new service account in the project. This also returns an unredacted API key for the service account.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param projectServiceAccountCreateRequest The project service account create request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createProjectServiceAccountAsync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectServiceAccountCreateRequest> projectServiceAccountCreateRequest, 
	void(* handler)(ProjectServiceAccountCreateResponse, Error, void* )
	, void* userData);


/*! \brief Adds a user to the project. Users must already be members of the organization to be added to a project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param projectUserCreateRequest The project user create request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createProjectUserSync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectUserCreateRequest> projectUserCreateRequest, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData);

/*! \brief Adds a user to the project. Users must already be members of the organization to be added to a project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param projectUserCreateRequest The project user create request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createProjectUserAsync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectUserCreateRequest> projectUserCreateRequest, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData);


/*! \brief Deletes an API key from the project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param keyId The ID of the API key. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteProjectApiKeySync(char * accessToken,
	std::string projectId, std::string keyId, 
	void(* handler)(ProjectApiKeyDeleteResponse, Error, void* )
	, void* userData);

/*! \brief Deletes an API key from the project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param keyId The ID of the API key. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteProjectApiKeyAsync(char * accessToken,
	std::string projectId, std::string keyId, 
	void(* handler)(ProjectApiKeyDeleteResponse, Error, void* )
	, void* userData);


/*! \brief Deletes a service account from the project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param serviceAccountId The ID of the service account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteProjectServiceAccountSync(char * accessToken,
	std::string projectId, std::string serviceAccountId, 
	void(* handler)(ProjectServiceAccountDeleteResponse, Error, void* )
	, void* userData);

/*! \brief Deletes a service account from the project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param serviceAccountId The ID of the service account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteProjectServiceAccountAsync(char * accessToken,
	std::string projectId, std::string serviceAccountId, 
	void(* handler)(ProjectServiceAccountDeleteResponse, Error, void* )
	, void* userData);


/*! \brief Deletes a user from the project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param userId The ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteProjectUserSync(char * accessToken,
	std::string projectId, std::string userId, 
	void(* handler)(ProjectUserDeleteResponse, Error, void* )
	, void* userData);

/*! \brief Deletes a user from the project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param userId The ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteProjectUserAsync(char * accessToken,
	std::string projectId, std::string userId, 
	void(* handler)(ProjectUserDeleteResponse, Error, void* )
	, void* userData);


/*! \brief Returns a list of API keys in the project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listProjectApiKeysSync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectApiKeyListResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of API keys in the project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listProjectApiKeysAsync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectApiKeyListResponse, Error, void* )
	, void* userData);


/*! \brief Returns the rate limits per model for a project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param limit A limit on the number of objects to be returned. The default is 100. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listProjectRateLimitsSync(char * accessToken,
	std::string projectId, int limit, std::string after, std::string before, 
	void(* handler)(ProjectRateLimitListResponse, Error, void* )
	, void* userData);

/*! \brief Returns the rate limits per model for a project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param limit A limit on the number of objects to be returned. The default is 100. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listProjectRateLimitsAsync(char * accessToken,
	std::string projectId, int limit, std::string after, std::string before, 
	void(* handler)(ProjectRateLimitListResponse, Error, void* )
	, void* userData);


/*! \brief Returns a list of service accounts in the project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listProjectServiceAccountsSync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectServiceAccountListResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of service accounts in the project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listProjectServiceAccountsAsync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectServiceAccountListResponse, Error, void* )
	, void* userData);


/*! \brief Returns a list of users in the project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listProjectUsersSync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectUserListResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of users in the project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listProjectUsersAsync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectUserListResponse, Error, void* )
	, void* userData);


/*! \brief Returns a list of projects.. *Synchronous*
 *
 * 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param includeArchived If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listProjectsSync(char * accessToken,
	int limit, std::string after, bool includeArchived, 
	void(* handler)(ProjectListResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of projects.. *Asynchronous*
 *
 * 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param includeArchived If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listProjectsAsync(char * accessToken,
	int limit, std::string after, bool includeArchived, 
	void(* handler)(ProjectListResponse, Error, void* )
	, void* userData);


/*! \brief Modifies a project in the organization.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param projectUpdateRequest The project update request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyProjectSync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectUpdateRequest> projectUpdateRequest, 
	void(* handler)(Project, Error, void* )
	, void* userData);

/*! \brief Modifies a project in the organization.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param projectUpdateRequest The project update request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyProjectAsync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectUpdateRequest> projectUpdateRequest, 
	void(* handler)(Project, Error, void* )
	, void* userData);


/*! \brief Modifies a user's role in the project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param userId The ID of the user. *Required*
 * \param projectUserUpdateRequest The project user update request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyProjectUserSync(char * accessToken,
	std::string projectId, std::string userId, std::shared_ptr<ProjectUserUpdateRequest> projectUserUpdateRequest, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData);

/*! \brief Modifies a user's role in the project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param userId The ID of the user. *Required*
 * \param projectUserUpdateRequest The project user update request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyProjectUserAsync(char * accessToken,
	std::string projectId, std::string userId, std::shared_ptr<ProjectUserUpdateRequest> projectUserUpdateRequest, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData);


/*! \brief Retrieves a project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveProjectSync(char * accessToken,
	std::string projectId, 
	void(* handler)(Project, Error, void* )
	, void* userData);

/*! \brief Retrieves a project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveProjectAsync(char * accessToken,
	std::string projectId, 
	void(* handler)(Project, Error, void* )
	, void* userData);


/*! \brief Retrieves an API key in the project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param keyId The ID of the API key. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveProjectApiKeySync(char * accessToken,
	std::string projectId, std::string keyId, 
	void(* handler)(ProjectApiKey, Error, void* )
	, void* userData);

/*! \brief Retrieves an API key in the project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param keyId The ID of the API key. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveProjectApiKeyAsync(char * accessToken,
	std::string projectId, std::string keyId, 
	void(* handler)(ProjectApiKey, Error, void* )
	, void* userData);


/*! \brief Retrieves a service account in the project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param serviceAccountId The ID of the service account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveProjectServiceAccountSync(char * accessToken,
	std::string projectId, std::string serviceAccountId, 
	void(* handler)(ProjectServiceAccount, Error, void* )
	, void* userData);

/*! \brief Retrieves a service account in the project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param serviceAccountId The ID of the service account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveProjectServiceAccountAsync(char * accessToken,
	std::string projectId, std::string serviceAccountId, 
	void(* handler)(ProjectServiceAccount, Error, void* )
	, void* userData);


/*! \brief Retrieves a user in the project.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param userId The ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveProjectUserSync(char * accessToken,
	std::string projectId, std::string userId, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData);

/*! \brief Retrieves a user in the project.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param userId The ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveProjectUserAsync(char * accessToken,
	std::string projectId, std::string userId, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData);


/*! \brief Updates a project rate limit.. *Synchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param rateLimitId The ID of the rate limit. *Required*
 * \param projectRateLimitUpdateRequest The project rate limit update request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateProjectRateLimitsSync(char * accessToken,
	std::string projectId, std::string rateLimitId, std::shared_ptr<ProjectRateLimitUpdateRequest> projectRateLimitUpdateRequest, 
	void(* handler)(ProjectRateLimit, Error, void* )
	, void* userData);

/*! \brief Updates a project rate limit.. *Asynchronous*
 *
 * 
 * \param projectId The ID of the project. *Required*
 * \param rateLimitId The ID of the rate limit. *Required*
 * \param projectRateLimitUpdateRequest The project rate limit update request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateProjectRateLimitsAsync(char * accessToken,
	std::string projectId, std::string rateLimitId, std::shared_ptr<ProjectRateLimitUpdateRequest> projectRateLimitUpdateRequest, 
	void(* handler)(ProjectRateLimit, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* ProjectsManager_H_ */
