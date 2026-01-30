#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "InvitesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Delete an invite. If the invite has already been accepted, it cannot be deleted.
//
invite_delete_response_t*
InvitesAPI_deleteInvite(apiClient_t *apiClient, char *invite_id)
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
    char *localVarPath = strdup("/organization/invites/{invite_id}");

    if(!invite_id)
        goto end;


    // Path Params
    long sizeOfPathParams_invite_id = strlen(invite_id)+3 + sizeof("{ invite_id }") - 1;
    if(invite_id == NULL) {
        goto end;
    }
    char* localVarToReplace_invite_id = malloc(sizeOfPathParams_invite_id);
    sprintf(localVarToReplace_invite_id, "{%s}", "invite_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_invite_id, invite_id);


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
    //    printf("%s\n","Invite deleted successfully.");
    //}
    //nonprimitive not container
    invite_delete_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *InvitesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = invite_delete_response_parseFromJSON(InvitesAPIlocalVarJSON);
        cJSON_Delete(InvitesAPIlocalVarJSON);
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
    free(localVarToReplace_invite_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
//
invite_t*
InvitesAPI_inviteUser(apiClient_t *apiClient, invite_request_t *invite_request)
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
    char *localVarPath = strdup("/organization/invites");





    // Body Param
    cJSON *localVarSingleItemJSON_invite_request = NULL;
    if (invite_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_invite_request = invite_request_convertToJSON(invite_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_invite_request);
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
    //    printf("%s\n","User invited successfully.");
    //}
    //nonprimitive not container
    invite_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *InvitesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = invite_parseFromJSON(InvitesAPIlocalVarJSON);
        cJSON_Delete(InvitesAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_invite_request) {
        cJSON_Delete(localVarSingleItemJSON_invite_request);
        localVarSingleItemJSON_invite_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of invites in the organization.
//
invite_list_response_t*
InvitesAPI_listInvites(apiClient_t *apiClient, int *limit, char *after)
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
    char *localVarPath = strdup("/organization/invites");





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
    //    printf("%s\n","Invites listed successfully.");
    //}
    //nonprimitive not container
    invite_list_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *InvitesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = invite_list_response_parseFromJSON(InvitesAPIlocalVarJSON);
        cJSON_Delete(InvitesAPIlocalVarJSON);
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

// Retrieves an invite.
//
invite_t*
InvitesAPI_retrieveInvite(apiClient_t *apiClient, char *invite_id)
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
    char *localVarPath = strdup("/organization/invites/{invite_id}");

    if(!invite_id)
        goto end;


    // Path Params
    long sizeOfPathParams_invite_id = strlen(invite_id)+3 + sizeof("{ invite_id }") - 1;
    if(invite_id == NULL) {
        goto end;
    }
    char* localVarToReplace_invite_id = malloc(sizeOfPathParams_invite_id);
    sprintf(localVarToReplace_invite_id, "{%s}", "invite_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_invite_id, invite_id);


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
    //    printf("%s\n","Invite retrieved successfully.");
    //}
    //nonprimitive not container
    invite_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *InvitesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = invite_parseFromJSON(InvitesAPIlocalVarJSON);
        cJSON_Delete(InvitesAPIlocalVarJSON);
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
    free(localVarToReplace_invite_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

