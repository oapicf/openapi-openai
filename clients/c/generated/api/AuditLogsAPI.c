#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "AuditLogsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum EVENTTYPES for AuditLogsAPI_listAuditLogs

static char* listAuditLogs_EVENTTYPES_ToString(openai_api_listAuditLogs_event_types[]_e EVENTTYPES){
    char *EVENTTYPESArray[] =  { "NULL", "api_key.created", "api_key.updated", "api_key.deleted", "invite.sent", "invite.accepted", "invite.deleted", "login.succeeded", "login.failed", "logout.succeeded", "logout.failed", "organization.updated", "project.created", "project.updated", "project.archived", "service_account.created", "service_account.updated", "service_account.deleted", "rate_limit.updated", "rate_limit.deleted", "user.added", "user.updated", "user.deleted" };
    return EVENTTYPESArray[EVENTTYPES];
}

static openai_api_listAuditLogs_event_types[]_e listAuditLogs_EVENTTYPES_FromString(char* EVENTTYPES){
    int stringToReturn = 0;
    char *EVENTTYPESArray[] =  { "NULL", "api_key.created", "api_key.updated", "api_key.deleted", "invite.sent", "invite.accepted", "invite.deleted", "login.succeeded", "login.failed", "logout.succeeded", "logout.failed", "organization.updated", "project.created", "project.updated", "project.archived", "service_account.created", "service_account.updated", "service_account.deleted", "rate_limit.updated", "rate_limit.deleted", "user.added", "user.updated", "user.deleted" };
    size_t sizeofArray = sizeof(EVENTTYPESArray) / sizeof(EVENTTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(EVENTTYPES, EVENTTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function listAuditLogs_EVENTTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listAuditLogs_EVENTTYPES_convertToJSON(openai_api_listAuditLogs_event_types[]_e EVENTTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listAuditLogs_EVENTTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listAuditLogs_event_types[]_e listAuditLogs_EVENTTYPES_parseFromJSON(cJSON* EVENTTYPESJSON) {
    openai_api_listAuditLogs_event_types[]_e EVENTTYPESVariable = 0;
    return EVENTTYPESVariable;
end:
    return 0;
}
*/


// List user actions and configuration changes within this organization.
//
list_audit_logs_response_t*
AuditLogsAPI_listAuditLogs(apiClient_t *apiClient, list_audit_logs_effective_at_parameter_t *effective_at, list_t *project_ids[], list_t *event_types[], list_t *actor_ids[], list_t *actor_emails[], list_t *resource_ids[], int *limit, char *after, char *before)
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
    char *localVarPath = strdup("/organization/audit_logs");





    // query parameters
    char *keyQuery_effective_at = NULL;
    list_audit_logs_effective_at_parameter_t * valueQuery_effective_at ;
    keyValuePair_t *keyPairQuery_effective_at = 0;
    if (effective_at)
    {
        keyQuery_effective_at = strdup("effective_at");
        valueQuery_effective_at = (effective_at);
        keyPairQuery_effective_at = keyValuePair_create(keyQuery_effective_at, &valueQuery_effective_at);
        list_addElement(localVarQueryParameters,keyPairQuery_effective_at);
    }

    // query parameters
    if (project_ids[])
    {
        list_addElement(localVarQueryParameters,project_ids[]);
    }

    // query parameters
    if (event_types[])
    {
        list_addElement(localVarQueryParameters,event_types[]);
    }

    // query parameters
    if (actor_ids[])
    {
        list_addElement(localVarQueryParameters,actor_ids[]);
    }

    // query parameters
    if (actor_emails[])
    {
        list_addElement(localVarQueryParameters,actor_emails[]);
    }

    // query parameters
    if (resource_ids[])
    {
        list_addElement(localVarQueryParameters,resource_ids[]);
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
    char *keyQuery_before = NULL;
    char * valueQuery_before = NULL;
    keyValuePair_t *keyPairQuery_before = 0;
    if (before)
    {
        keyQuery_before = strdup("before");
        valueQuery_before = strdup((before));
        keyPairQuery_before = keyValuePair_create(keyQuery_before, valueQuery_before);
        list_addElement(localVarQueryParameters,keyPairQuery_before);
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
    //    printf("%s\n","Audit logs listed successfully.");
    //}
    //nonprimitive not container
    list_audit_logs_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AuditLogsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_audit_logs_response_parseFromJSON(AuditLogsAPIlocalVarJSON);
        cJSON_Delete(AuditLogsAPIlocalVarJSON);
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
    if(keyQuery_effective_at){
        free(keyQuery_effective_at);
        keyQuery_effective_at = NULL;
    }
    if(keyPairQuery_effective_at){
        keyValuePair_free(keyPairQuery_effective_at);
        keyPairQuery_effective_at = NULL;
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
    if(keyQuery_before){
        free(keyQuery_before);
        keyQuery_before = NULL;
    }
    if(valueQuery_before){
        free(valueQuery_before);
        valueQuery_before = NULL;
    }
    if(keyPairQuery_before){
        keyValuePair_free(keyPairQuery_before);
        keyPairQuery_before = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

