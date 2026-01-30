#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/admin_api_key.h"
#include "../model/admin_api_keys_create_request.h"
#include "../model/admin_api_keys_delete_200_response.h"
#include "../model/api_key_list.h"

// Enum ORDER for DefaultAPI_adminApiKeysList
typedef enum  { openai_api_adminApiKeysList_ORDER_NULL = 0, openai_api_adminApiKeysList_ORDER_asc, openai_api_adminApiKeysList_ORDER_desc } openai_api_adminApiKeysList_order_e;


// Create an organization admin API key
//
// Create a new admin-level API key for the organization.
//
admin_api_key_t*
DefaultAPI_adminApiKeysCreate(apiClient_t *apiClient, admin_api_keys_create_request_t *admin_api_keys_create_request);


// Delete an organization admin API key
//
// Delete the specified admin API key.
//
admin_api_keys_delete_200_response_t*
DefaultAPI_adminApiKeysDelete(apiClient_t *apiClient, char *key_id);


// Retrieve a single organization API key
//
// Get details for a specific organization API key by its ID.
//
admin_api_key_t*
DefaultAPI_adminApiKeysGet(apiClient_t *apiClient, char *key_id);


// List organization API keys
//
// Retrieve a paginated list of organization admin API keys.
//
api_key_list_t*
DefaultAPI_adminApiKeysList(apiClient_t *apiClient, char *after, openai_api_adminApiKeysList_order_e order, int *limit);


