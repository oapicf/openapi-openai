#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "FineTuningAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Immediately cancel a fine-tune job. 
//
fine_tuning_job_t*
FineTuningAPI_cancelFineTuningJob(apiClient_t *apiClient, char *fine_tuning_job_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine_tuning/jobs/{fine_tuning_job_id}/cancel")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine_tuning/jobs/{fine_tuning_job_id}/cancel");


    // Path Params
    long sizeOfPathParams_fine_tuning_job_id = strlen(fine_tuning_job_id)+3 + strlen("{ fine_tuning_job_id }");
    if(fine_tuning_job_id == NULL) {
        goto end;
    }
    char* localVarToReplace_fine_tuning_job_id = malloc(sizeOfPathParams_fine_tuning_job_id);
    sprintf(localVarToReplace_fine_tuning_job_id, "{%s}", "fine_tuning_job_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_fine_tuning_job_id, fine_tuning_job_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *FineTuningAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    fine_tuning_job_t *elementToReturn = fine_tuning_job_parseFromJSON(FineTuningAPIlocalVarJSON);
    cJSON_Delete(FineTuningAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_fine_tuning_job_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
//
fine_tuning_job_t*
FineTuningAPI_createFineTuningJob(apiClient_t *apiClient, create_fine_tuning_job_request_t *create_fine_tuning_job_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine_tuning/jobs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine_tuning/jobs");




    // Body Param
    cJSON *localVarSingleItemJSON_create_fine_tuning_job_request = NULL;
    if (create_fine_tuning_job_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_fine_tuning_job_request = create_fine_tuning_job_request_convertToJSON(create_fine_tuning_job_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_fine_tuning_job_request);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *FineTuningAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    fine_tuning_job_t *elementToReturn = fine_tuning_job_parseFromJSON(FineTuningAPIlocalVarJSON);
    cJSON_Delete(FineTuningAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    if (localVarSingleItemJSON_create_fine_tuning_job_request) {
        cJSON_Delete(localVarSingleItemJSON_create_fine_tuning_job_request);
        localVarSingleItemJSON_create_fine_tuning_job_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get status updates for a fine-tuning job. 
//
list_fine_tuning_job_events_response_t*
FineTuningAPI_listFineTuningEvents(apiClient_t *apiClient, char *fine_tuning_job_id, char *after, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine_tuning/jobs/{fine_tuning_job_id}/events")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine_tuning/jobs/{fine_tuning_job_id}/events");


    // Path Params
    long sizeOfPathParams_fine_tuning_job_id = strlen(fine_tuning_job_id)+3 + strlen("{ fine_tuning_job_id }");
    if(fine_tuning_job_id == NULL) {
        goto end;
    }
    char* localVarToReplace_fine_tuning_job_id = malloc(sizeOfPathParams_fine_tuning_job_id);
    sprintf(localVarToReplace_fine_tuning_job_id, "{%s}", "fine_tuning_job_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_fine_tuning_job_id, fine_tuning_job_id);



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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *FineTuningAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    list_fine_tuning_job_events_response_t *elementToReturn = list_fine_tuning_job_events_response_parseFromJSON(FineTuningAPIlocalVarJSON);
    cJSON_Delete(FineTuningAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    free(localVarToReplace_fine_tuning_job_id);
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

// List checkpoints for a fine-tuning job. 
//
list_fine_tuning_job_checkpoints_response_t*
FineTuningAPI_listFineTuningJobCheckpoints(apiClient_t *apiClient, char *fine_tuning_job_id, char *after, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints");


    // Path Params
    long sizeOfPathParams_fine_tuning_job_id = strlen(fine_tuning_job_id)+3 + strlen("{ fine_tuning_job_id }");
    if(fine_tuning_job_id == NULL) {
        goto end;
    }
    char* localVarToReplace_fine_tuning_job_id = malloc(sizeOfPathParams_fine_tuning_job_id);
    sprintf(localVarToReplace_fine_tuning_job_id, "{%s}", "fine_tuning_job_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_fine_tuning_job_id, fine_tuning_job_id);



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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *FineTuningAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    list_fine_tuning_job_checkpoints_response_t *elementToReturn = list_fine_tuning_job_checkpoints_response_parseFromJSON(FineTuningAPIlocalVarJSON);
    cJSON_Delete(FineTuningAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    free(localVarToReplace_fine_tuning_job_id);
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

// List your organization's fine-tuning jobs 
//
list_paginated_fine_tuning_jobs_response_t*
FineTuningAPI_listPaginatedFineTuningJobs(apiClient_t *apiClient, char *after, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine_tuning/jobs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine_tuning/jobs");




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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *FineTuningAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    list_paginated_fine_tuning_jobs_response_t *elementToReturn = list_paginated_fine_tuning_jobs_response_parseFromJSON(FineTuningAPIlocalVarJSON);
    cJSON_Delete(FineTuningAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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

// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
//
fine_tuning_job_t*
FineTuningAPI_retrieveFineTuningJob(apiClient_t *apiClient, char *fine_tuning_job_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine_tuning/jobs/{fine_tuning_job_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine_tuning/jobs/{fine_tuning_job_id}");


    // Path Params
    long sizeOfPathParams_fine_tuning_job_id = strlen(fine_tuning_job_id)+3 + strlen("{ fine_tuning_job_id }");
    if(fine_tuning_job_id == NULL) {
        goto end;
    }
    char* localVarToReplace_fine_tuning_job_id = malloc(sizeOfPathParams_fine_tuning_job_id);
    sprintf(localVarToReplace_fine_tuning_job_id, "{%s}", "fine_tuning_job_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_fine_tuning_job_id, fine_tuning_job_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *FineTuningAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    fine_tuning_job_t *elementToReturn = fine_tuning_job_parseFromJSON(FineTuningAPIlocalVarJSON);
    cJSON_Delete(FineTuningAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_fine_tuning_job_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

