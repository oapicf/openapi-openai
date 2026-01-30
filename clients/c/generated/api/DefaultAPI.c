#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "DefaultAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum ORDER for DefaultAPI_adminApiKeysList

static char* adminApiKeysList_ORDER_ToString(openai_api_adminApiKeysList_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_adminApiKeysList_order_e adminApiKeysList_ORDER_FromString(char* ORDER){
    int stringToReturn = 0;
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    size_t sizeofArray = sizeof(ORDERArray) / sizeof(ORDERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ORDER, ORDERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adminApiKeysList_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adminApiKeysList_ORDER_convertToJSON(openai_api_adminApiKeysList_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", adminApiKeysList_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adminApiKeysList_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_adminApiKeysList_order_e adminApiKeysList_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_adminApiKeysList_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = adminApiKeysList_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/


// Create an organization admin API key
//
// Create a new admin-level API key for the organization.
//
admin_api_key_t*
DefaultAPI_adminApiKeysCreate(apiClient_t *apiClient, admin_api_keys_create_request_t *admin_api_keys_create_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/admin_api_keys");





    // Body Param
    cJSON *localVarSingleItemJSON_admin_api_keys_create_request = NULL;
    if (admin_api_keys_create_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_admin_api_keys_create_request = admin_api_keys_create_request_convertToJSON(admin_api_keys_create_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_admin_api_keys_create_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The newly created admin API key.");
    //}
    //nonprimitive not container
    admin_api_key_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *DefaultAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = admin_api_key_parseFromJSON(DefaultAPIlocalVarJSON);
        cJSON_Delete(DefaultAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_admin_api_keys_create_request) {
        cJSON_Delete(localVarSingleItemJSON_admin_api_keys_create_request);
        localVarSingleItemJSON_admin_api_keys_create_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete an organization admin API key
//
// Delete the specified admin API key.
//
admin_api_keys_delete_200_response_t*
DefaultAPI_adminApiKeysDelete(apiClient_t *apiClient, char *key_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/admin_api_keys/{key_id}");

    if(!key_id)
        goto end;


    // Path Params
    long sizeOfPathParams_key_id = strlen(key_id)+3 + sizeof("{ key_id }") - 1;
    if(key_id == NULL) {
        goto end;
    }
    char* localVarToReplace_key_id = malloc(sizeOfPathParams_key_id);
    sprintf(localVarToReplace_key_id, "{%s}", "key_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_key_id, key_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Confirmation that the API key was deleted.");
    //}
    //nonprimitive not container
    admin_api_keys_delete_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *DefaultAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = admin_api_keys_delete_200_response_parseFromJSON(DefaultAPIlocalVarJSON);
        cJSON_Delete(DefaultAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_key_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieve a single organization API key
//
// Get details for a specific organization API key by its ID.
//
admin_api_key_t*
DefaultAPI_adminApiKeysGet(apiClient_t *apiClient, char *key_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/admin_api_keys/{key_id}");

    if(!key_id)
        goto end;


    // Path Params
    long sizeOfPathParams_key_id = strlen(key_id)+3 + sizeof("{ key_id }") - 1;
    if(key_id == NULL) {
        goto end;
    }
    char* localVarToReplace_key_id = malloc(sizeOfPathParams_key_id);
    sprintf(localVarToReplace_key_id, "{%s}", "key_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_key_id, key_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Details of the requested API key.");
    //}
    //nonprimitive not container
    admin_api_key_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *DefaultAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = admin_api_key_parseFromJSON(DefaultAPIlocalVarJSON);
        cJSON_Delete(DefaultAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_key_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List organization API keys
//
// Retrieve a paginated list of organization admin API keys.
//
api_key_list_t*
DefaultAPI_adminApiKeysList(apiClient_t *apiClient, char *after, openai_api_adminApiKeysList_order_e order, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/admin_api_keys");





    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }

    // query parameters
    char *keyQuery_order = NULL;
    openai_api_adminApiKeysList_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(adminApiKeysList_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","A list of organization API keys.");
    //}
    //nonprimitive not container
    api_key_list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *DefaultAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = api_key_list_parseFromJSON(DefaultAPIlocalVarJSON);
        cJSON_Delete(DefaultAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

