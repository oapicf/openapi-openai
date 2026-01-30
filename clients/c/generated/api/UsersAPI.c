#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "UsersAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Deletes a user from the organization.
//
user_delete_response_t*
UsersAPI_deleteUser(apiClient_t *apiClient, char *user_id)
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
    char *localVarPath = strdup("/organization/users/{user_id}");

    if(!user_id)
        goto end;


    // Path Params
    long sizeOfPathParams_user_id = strlen(user_id)+3 + sizeof("{ user_id }") - 1;
    if(user_id == NULL) {
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    sprintf(localVarToReplace_user_id, "{%s}", "user_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, user_id);


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
    //    printf("%s\n","User deleted successfully.");
    //}
    //nonprimitive not container
    user_delete_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = user_delete_response_parseFromJSON(UsersAPIlocalVarJSON);
        cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_user_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Lists all of the users in the organization.
//
user_list_response_t*
UsersAPI_listUsers(apiClient_t *apiClient, int *limit, char *after)
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
    char *localVarPath = strdup("/organization/users");





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
    //    printf("%s\n","Users listed successfully.");
    //}
    //nonprimitive not container
    user_list_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = user_list_response_parseFromJSON(UsersAPIlocalVarJSON);
        cJSON_Delete(UsersAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Modifies a user's role in the organization.
//
user_t*
UsersAPI_modifyUser(apiClient_t *apiClient, char *user_id, user_role_update_request_t *user_role_update_request)
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
    char *localVarPath = strdup("/organization/users/{user_id}");

    if(!user_id)
        goto end;


    // Path Params
    long sizeOfPathParams_user_id = strlen(user_id)+3 + sizeof("{ user_id }") - 1;
    if(user_id == NULL) {
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    sprintf(localVarToReplace_user_id, "{%s}", "user_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, user_id);



    // Body Param
    cJSON *localVarSingleItemJSON_user_role_update_request = NULL;
    if (user_role_update_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_user_role_update_request = user_role_update_request_convertToJSON(user_role_update_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_user_role_update_request);
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
    //    printf("%s\n","User role updated successfully.");
    //}
    //nonprimitive not container
    user_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = user_parseFromJSON(UsersAPIlocalVarJSON);
        cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_user_id);
    if (localVarSingleItemJSON_user_role_update_request) {
        cJSON_Delete(localVarSingleItemJSON_user_role_update_request);
        localVarSingleItemJSON_user_role_update_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a user by their identifier.
//
user_t*
UsersAPI_retrieveUser(apiClient_t *apiClient, char *user_id)
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
    char *localVarPath = strdup("/organization/users/{user_id}");

    if(!user_id)
        goto end;


    // Path Params
    long sizeOfPathParams_user_id = strlen(user_id)+3 + sizeof("{ user_id }") - 1;
    if(user_id == NULL) {
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    sprintf(localVarToReplace_user_id, "{%s}", "user_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, user_id);


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
    //    printf("%s\n","User retrieved successfully.");
    //}
    //nonprimitive not container
    user_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = user_parseFromJSON(UsersAPIlocalVarJSON);
        cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_user_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

