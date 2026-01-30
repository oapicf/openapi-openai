#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/user.h"
#include "../model/user_delete_response.h"
#include "../model/user_list_response.h"
#include "../model/user_role_update_request.h"


// Deletes a user from the organization.
//
user_delete_response_t*
UsersAPI_deleteUser(apiClient_t *apiClient, char *user_id);


// Lists all of the users in the organization.
//
user_list_response_t*
UsersAPI_listUsers(apiClient_t *apiClient, int *limit, char *after);


// Modifies a user's role in the organization.
//
user_t*
UsersAPI_modifyUser(apiClient_t *apiClient, char *user_id, user_role_update_request_t *user_role_update_request);


// Retrieves a user by their identifier.
//
user_t*
UsersAPI_retrieveUser(apiClient_t *apiClient, char *user_id);


