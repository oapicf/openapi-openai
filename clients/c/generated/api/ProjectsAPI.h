#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error_response.h"
#include "../model/project.h"
#include "../model/project_api_key.h"
#include "../model/project_api_key_delete_response.h"
#include "../model/project_api_key_list_response.h"
#include "../model/project_create_request.h"
#include "../model/project_list_response.h"
#include "../model/project_rate_limit.h"
#include "../model/project_rate_limit_list_response.h"
#include "../model/project_rate_limit_update_request.h"
#include "../model/project_service_account.h"
#include "../model/project_service_account_create_request.h"
#include "../model/project_service_account_create_response.h"
#include "../model/project_service_account_delete_response.h"
#include "../model/project_service_account_list_response.h"
#include "../model/project_update_request.h"
#include "../model/project_user.h"
#include "../model/project_user_create_request.h"
#include "../model/project_user_delete_response.h"
#include "../model/project_user_list_response.h"
#include "../model/project_user_update_request.h"


// Archives a project in the organization. Archived projects cannot be used or updated.
//
project_t*
ProjectsAPI_archiveProject(apiClient_t *apiClient, char *project_id);


// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
//
project_t*
ProjectsAPI_createProject(apiClient_t *apiClient, project_create_request_t *project_create_request);


// Creates a new service account in the project. This also returns an unredacted API key for the service account.
//
project_service_account_create_response_t*
ProjectsAPI_createProjectServiceAccount(apiClient_t *apiClient, char *project_id, project_service_account_create_request_t *project_service_account_create_request);


// Adds a user to the project. Users must already be members of the organization to be added to a project.
//
project_user_t*
ProjectsAPI_createProjectUser(apiClient_t *apiClient, char *project_id, project_user_create_request_t *project_user_create_request);


// Deletes an API key from the project.
//
project_api_key_delete_response_t*
ProjectsAPI_deleteProjectApiKey(apiClient_t *apiClient, char *project_id, char *key_id);


// Deletes a service account from the project.
//
project_service_account_delete_response_t*
ProjectsAPI_deleteProjectServiceAccount(apiClient_t *apiClient, char *project_id, char *service_account_id);


// Deletes a user from the project.
//
project_user_delete_response_t*
ProjectsAPI_deleteProjectUser(apiClient_t *apiClient, char *project_id, char *user_id);


// Returns a list of API keys in the project.
//
project_api_key_list_response_t*
ProjectsAPI_listProjectApiKeys(apiClient_t *apiClient, char *project_id, int *limit, char *after);


// Returns the rate limits per model for a project.
//
project_rate_limit_list_response_t*
ProjectsAPI_listProjectRateLimits(apiClient_t *apiClient, char *project_id, int *limit, char *after, char *before);


// Returns a list of service accounts in the project.
//
project_service_account_list_response_t*
ProjectsAPI_listProjectServiceAccounts(apiClient_t *apiClient, char *project_id, int *limit, char *after);


// Returns a list of users in the project.
//
project_user_list_response_t*
ProjectsAPI_listProjectUsers(apiClient_t *apiClient, char *project_id, int *limit, char *after);


// Returns a list of projects.
//
project_list_response_t*
ProjectsAPI_listProjects(apiClient_t *apiClient, int *limit, char *after, int *include_archived);


// Modifies a project in the organization.
//
project_t*
ProjectsAPI_modifyProject(apiClient_t *apiClient, char *project_id, project_update_request_t *project_update_request);


// Modifies a user's role in the project.
//
project_user_t*
ProjectsAPI_modifyProjectUser(apiClient_t *apiClient, char *project_id, char *user_id, project_user_update_request_t *project_user_update_request);


// Retrieves a project.
//
project_t*
ProjectsAPI_retrieveProject(apiClient_t *apiClient, char *project_id);


// Retrieves an API key in the project.
//
project_api_key_t*
ProjectsAPI_retrieveProjectApiKey(apiClient_t *apiClient, char *project_id, char *key_id);


// Retrieves a service account in the project.
//
project_service_account_t*
ProjectsAPI_retrieveProjectServiceAccount(apiClient_t *apiClient, char *project_id, char *service_account_id);


// Retrieves a user in the project.
//
project_user_t*
ProjectsAPI_retrieveProjectUser(apiClient_t *apiClient, char *project_id, char *user_id);


// Updates a project rate limit.
//
project_rate_limit_t*
ProjectsAPI_updateProjectRateLimits(apiClient_t *apiClient, char *project_id, char *rate_limit_id, project_rate_limit_update_request_t *project_rate_limit_update_request);


