#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "BatchAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
//
batch_t*
BatchAPI_cancelBatch(apiClient_t *apiClient, char *batch_id)
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
    char *localVarPath = strdup("/batches/{batch_id}/cancel");

    if(!batch_id)
        goto end;


    // Path Params
    long sizeOfPathParams_batch_id = strlen(batch_id)+3 + sizeof("{ batch_id }") - 1;
    if(batch_id == NULL) {
        goto end;
    }
    char* localVarToReplace_batch_id = malloc(sizeOfPathParams_batch_id);
    sprintf(localVarToReplace_batch_id, "{%s}", "batch_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_batch_id, batch_id);


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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Batch is cancelling. Returns the cancelling batch&#39;s details.");
    //}
    //nonprimitive not container
    batch_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BatchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = batch_parseFromJSON(BatchAPIlocalVarJSON);
        cJSON_Delete(BatchAPIlocalVarJSON);
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
    free(localVarToReplace_batch_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates and executes a batch from an uploaded file of requests
//
batch_t*
BatchAPI_createBatch(apiClient_t *apiClient, create_batch_request_t *create_batch_request)
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
    char *localVarPath = strdup("/batches");





    // Body Param
    cJSON *localVarSingleItemJSON_create_batch_request = NULL;
    if (create_batch_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_batch_request = create_batch_request_convertToJSON(create_batch_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_batch_request);
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
    //    printf("%s\n","Batch created successfully.");
    //}
    //nonprimitive not container
    batch_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BatchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = batch_parseFromJSON(BatchAPIlocalVarJSON);
        cJSON_Delete(BatchAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_batch_request) {
        cJSON_Delete(localVarSingleItemJSON_create_batch_request);
        localVarSingleItemJSON_create_batch_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List your organization's batches.
//
list_batches_response_t*
BatchAPI_listBatches(apiClient_t *apiClient, char *after, int *limit)
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
    char *localVarPath = strdup("/batches");





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
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Batch listed successfully.");
    //}
    //nonprimitive not container
    list_batches_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BatchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_batches_response_parseFromJSON(BatchAPIlocalVarJSON);
        cJSON_Delete(BatchAPIlocalVarJSON);
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

// Retrieves a batch.
//
batch_t*
BatchAPI_retrieveBatch(apiClient_t *apiClient, char *batch_id)
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
    char *localVarPath = strdup("/batches/{batch_id}");

    if(!batch_id)
        goto end;


    // Path Params
    long sizeOfPathParams_batch_id = strlen(batch_id)+3 + sizeof("{ batch_id }") - 1;
    if(batch_id == NULL) {
        goto end;
    }
    char* localVarToReplace_batch_id = malloc(sizeOfPathParams_batch_id);
    sprintf(localVarToReplace_batch_id, "{%s}", "batch_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_batch_id, batch_id);


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
    //    printf("%s\n","Batch retrieved successfully.");
    //}
    //nonprimitive not container
    batch_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BatchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = batch_parseFromJSON(BatchAPIlocalVarJSON);
        cJSON_Delete(BatchAPIlocalVarJSON);
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
    free(localVarToReplace_batch_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

