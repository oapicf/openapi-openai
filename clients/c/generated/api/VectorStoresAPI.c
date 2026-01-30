#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "VectorStoresAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum ORDER for VectorStoresAPI_listFilesInVectorStoreBatch

static char* listFilesInVectorStoreBatch_ORDER_ToString(openai_api_listFilesInVectorStoreBatch_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_listFilesInVectorStoreBatch_order_e listFilesInVectorStoreBatch_ORDER_FromString(char* ORDER){
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
// Function listFilesInVectorStoreBatch_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listFilesInVectorStoreBatch_ORDER_convertToJSON(openai_api_listFilesInVectorStoreBatch_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", listFilesInVectorStoreBatch_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listFilesInVectorStoreBatch_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listFilesInVectorStoreBatch_order_e listFilesInVectorStoreBatch_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_listFilesInVectorStoreBatch_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = listFilesInVectorStoreBatch_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/

// Functions for enum FILTER for VectorStoresAPI_listFilesInVectorStoreBatch

static char* listFilesInVectorStoreBatch_FILTER_ToString(openai_api_listFilesInVectorStoreBatch_filter_e FILTER){
    char *FILTERArray[] =  { "NULL", "in_progress", "completed", "failed", "cancelled" };
    return FILTERArray[FILTER];
}

static openai_api_listFilesInVectorStoreBatch_filter_e listFilesInVectorStoreBatch_FILTER_FromString(char* FILTER){
    int stringToReturn = 0;
    char *FILTERArray[] =  { "NULL", "in_progress", "completed", "failed", "cancelled" };
    size_t sizeofArray = sizeof(FILTERArray) / sizeof(FILTERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(FILTER, FILTERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function listFilesInVectorStoreBatch_FILTER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listFilesInVectorStoreBatch_FILTER_convertToJSON(openai_api_listFilesInVectorStoreBatch_filter_e FILTER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "filter", listFilesInVectorStoreBatch_FILTER_ToString(FILTER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listFilesInVectorStoreBatch_FILTER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listFilesInVectorStoreBatch_filter_e listFilesInVectorStoreBatch_FILTER_parseFromJSON(cJSON* FILTERJSON) {
    openai_api_listFilesInVectorStoreBatch_filter_e FILTERVariable = 0;
    cJSON *FILTERVar = cJSON_GetObjectItemCaseSensitive(FILTERJSON, "filter");
    if(!cJSON_IsString(FILTERVar) || (FILTERVar->valuestring == NULL))
    {
        goto end;
    }
    FILTERVariable = listFilesInVectorStoreBatch_FILTER_FromString(FILTERVar->valuestring);
    return FILTERVariable;
end:
    return 0;
}
*/

// Functions for enum ORDER for VectorStoresAPI_listVectorStoreFiles

static char* listVectorStoreFiles_ORDER_ToString(openai_api_listVectorStoreFiles_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_listVectorStoreFiles_order_e listVectorStoreFiles_ORDER_FromString(char* ORDER){
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
// Function listVectorStoreFiles_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listVectorStoreFiles_ORDER_convertToJSON(openai_api_listVectorStoreFiles_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", listVectorStoreFiles_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listVectorStoreFiles_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listVectorStoreFiles_order_e listVectorStoreFiles_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_listVectorStoreFiles_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = listVectorStoreFiles_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/

// Functions for enum FILTER for VectorStoresAPI_listVectorStoreFiles

static char* listVectorStoreFiles_FILTER_ToString(openai_api_listVectorStoreFiles_filter_e FILTER){
    char *FILTERArray[] =  { "NULL", "in_progress", "completed", "failed", "cancelled" };
    return FILTERArray[FILTER];
}

static openai_api_listVectorStoreFiles_filter_e listVectorStoreFiles_FILTER_FromString(char* FILTER){
    int stringToReturn = 0;
    char *FILTERArray[] =  { "NULL", "in_progress", "completed", "failed", "cancelled" };
    size_t sizeofArray = sizeof(FILTERArray) / sizeof(FILTERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(FILTER, FILTERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function listVectorStoreFiles_FILTER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listVectorStoreFiles_FILTER_convertToJSON(openai_api_listVectorStoreFiles_filter_e FILTER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "filter", listVectorStoreFiles_FILTER_ToString(FILTER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listVectorStoreFiles_FILTER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listVectorStoreFiles_filter_e listVectorStoreFiles_FILTER_parseFromJSON(cJSON* FILTERJSON) {
    openai_api_listVectorStoreFiles_filter_e FILTERVariable = 0;
    cJSON *FILTERVar = cJSON_GetObjectItemCaseSensitive(FILTERJSON, "filter");
    if(!cJSON_IsString(FILTERVar) || (FILTERVar->valuestring == NULL))
    {
        goto end;
    }
    FILTERVariable = listVectorStoreFiles_FILTER_FromString(FILTERVar->valuestring);
    return FILTERVariable;
end:
    return 0;
}
*/

// Functions for enum ORDER for VectorStoresAPI_listVectorStores

static char* listVectorStores_ORDER_ToString(openai_api_listVectorStores_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_listVectorStores_order_e listVectorStores_ORDER_FromString(char* ORDER){
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
// Function listVectorStores_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listVectorStores_ORDER_convertToJSON(openai_api_listVectorStores_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", listVectorStores_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listVectorStores_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listVectorStores_order_e listVectorStores_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_listVectorStores_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = listVectorStores_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/


// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
//
vector_store_file_batch_object_t*
VectorStoresAPI_cancelVectorStoreFileBatch(apiClient_t *apiClient, char *vector_store_id, char *batch_id)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel");

    if(!vector_store_id)
        goto end;
    if(!batch_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + strlen(batch_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);

    // Path Params
    long sizeOfPathParams_batch_id = strlen(vector_store_id)+3 + strlen(batch_id)+3 + sizeof("{ batch_id }") - 1;
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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    vector_store_file_batch_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = vector_store_file_batch_object_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
    free(localVarToReplace_batch_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a vector store.
//
vector_store_object_t*
VectorStoresAPI_createVectorStore(apiClient_t *apiClient, create_vector_store_request_t *create_vector_store_request)
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
    char *localVarPath = strdup("/vector_stores");





    // Body Param
    cJSON *localVarSingleItemJSON_create_vector_store_request = NULL;
    if (create_vector_store_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_vector_store_request = create_vector_store_request_convertToJSON(create_vector_store_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_vector_store_request);
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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    vector_store_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = vector_store_object_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_vector_store_request) {
        cJSON_Delete(localVarSingleItemJSON_create_vector_store_request);
        localVarSingleItemJSON_create_vector_store_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
//
vector_store_file_object_t*
VectorStoresAPI_createVectorStoreFile(apiClient_t *apiClient, char *vector_store_id, create_vector_store_file_request_t *create_vector_store_file_request)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}/files");

    if(!vector_store_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);



    // Body Param
    cJSON *localVarSingleItemJSON_create_vector_store_file_request = NULL;
    if (create_vector_store_file_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_vector_store_file_request = create_vector_store_file_request_convertToJSON(create_vector_store_file_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_vector_store_file_request);
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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    vector_store_file_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = vector_store_file_object_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
    if (localVarSingleItemJSON_create_vector_store_file_request) {
        cJSON_Delete(localVarSingleItemJSON_create_vector_store_file_request);
        localVarSingleItemJSON_create_vector_store_file_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a vector store file batch.
//
vector_store_file_batch_object_t*
VectorStoresAPI_createVectorStoreFileBatch(apiClient_t *apiClient, char *vector_store_id, create_vector_store_file_batch_request_t *create_vector_store_file_batch_request)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}/file_batches");

    if(!vector_store_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);



    // Body Param
    cJSON *localVarSingleItemJSON_create_vector_store_file_batch_request = NULL;
    if (create_vector_store_file_batch_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_vector_store_file_batch_request = create_vector_store_file_batch_request_convertToJSON(create_vector_store_file_batch_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_vector_store_file_batch_request);
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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    vector_store_file_batch_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = vector_store_file_batch_object_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
    if (localVarSingleItemJSON_create_vector_store_file_batch_request) {
        cJSON_Delete(localVarSingleItemJSON_create_vector_store_file_batch_request);
        localVarSingleItemJSON_create_vector_store_file_batch_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete a vector store.
//
delete_vector_store_response_t*
VectorStoresAPI_deleteVectorStore(apiClient_t *apiClient, char *vector_store_id)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}");

    if(!vector_store_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);


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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    delete_vector_store_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = delete_vector_store_response_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
//
delete_vector_store_file_response_t*
VectorStoresAPI_deleteVectorStoreFile(apiClient_t *apiClient, char *vector_store_id, char *file_id)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}/files/{file_id}");

    if(!vector_store_id)
        goto end;
    if(!file_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + strlen(file_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);

    // Path Params
    long sizeOfPathParams_file_id = strlen(vector_store_id)+3 + strlen(file_id)+3 + sizeof("{ file_id }") - 1;
    if(file_id == NULL) {
        goto end;
    }
    char* localVarToReplace_file_id = malloc(sizeOfPathParams_file_id);
    sprintf(localVarToReplace_file_id, "{%s}", "file_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_file_id, file_id);


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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    delete_vector_store_file_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = delete_vector_store_file_response_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
    free(localVarToReplace_file_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a vector store.
//
vector_store_object_t*
VectorStoresAPI_getVectorStore(apiClient_t *apiClient, char *vector_store_id)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}");

    if(!vector_store_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);


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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    vector_store_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = vector_store_object_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a vector store file.
//
vector_store_file_object_t*
VectorStoresAPI_getVectorStoreFile(apiClient_t *apiClient, char *vector_store_id, char *file_id)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}/files/{file_id}");

    if(!vector_store_id)
        goto end;
    if(!file_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + strlen(file_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);

    // Path Params
    long sizeOfPathParams_file_id = strlen(vector_store_id)+3 + strlen(file_id)+3 + sizeof("{ file_id }") - 1;
    if(file_id == NULL) {
        goto end;
    }
    char* localVarToReplace_file_id = malloc(sizeOfPathParams_file_id);
    sprintf(localVarToReplace_file_id, "{%s}", "file_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_file_id, file_id);


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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    vector_store_file_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = vector_store_file_object_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
    free(localVarToReplace_file_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a vector store file batch.
//
vector_store_file_batch_object_t*
VectorStoresAPI_getVectorStoreFileBatch(apiClient_t *apiClient, char *vector_store_id, char *batch_id)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}/file_batches/{batch_id}");

    if(!vector_store_id)
        goto end;
    if(!batch_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + strlen(batch_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);

    // Path Params
    long sizeOfPathParams_batch_id = strlen(vector_store_id)+3 + strlen(batch_id)+3 + sizeof("{ batch_id }") - 1;
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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    vector_store_file_batch_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = vector_store_file_batch_object_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
    free(localVarToReplace_batch_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of vector store files in a batch.
//
list_vector_store_files_response_t*
VectorStoresAPI_listFilesInVectorStoreBatch(apiClient_t *apiClient, char *vector_store_id, char *batch_id, int *limit, openai_api_listFilesInVectorStoreBatch_order_e order, char *after, char *before, openai_api_listFilesInVectorStoreBatch_filter_e filter)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}/file_batches/{batch_id}/files");

    if(!vector_store_id)
        goto end;
    if(!batch_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + strlen(batch_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);

    // Path Params
    long sizeOfPathParams_batch_id = strlen(vector_store_id)+3 + strlen(batch_id)+3 + sizeof("{ batch_id }") - 1;
    if(batch_id == NULL) {
        goto end;
    }
    char* localVarToReplace_batch_id = malloc(sizeOfPathParams_batch_id);
    sprintf(localVarToReplace_batch_id, "{%s}", "batch_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_batch_id, batch_id);



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
    char *keyQuery_order = NULL;
    openai_api_listFilesInVectorStoreBatch_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(listFilesInVectorStoreBatch_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
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

    // query parameters
    char *keyQuery_filter = NULL;
    openai_api_listFilesInVectorStoreBatch_filter_e valueQuery_filter ;
    keyValuePair_t *keyPairQuery_filter = 0;
    if (filter)
    {
        keyQuery_filter = strdup("filter");
        valueQuery_filter = (filter);
        keyPairQuery_filter = keyValuePair_create(keyQuery_filter, strdup(listFilesInVectorStoreBatch_FILTER_ToString(
        valueQuery_filter)));
        list_addElement(localVarQueryParameters,keyPairQuery_filter);
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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    list_vector_store_files_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_vector_store_files_response_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
    free(localVarToReplace_batch_id);
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
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
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
    if(keyQuery_filter){
        free(keyQuery_filter);
        keyQuery_filter = NULL;
    }
    if(keyPairQuery_filter){
        keyValuePair_free(keyPairQuery_filter);
        keyPairQuery_filter = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of vector store files.
//
list_vector_store_files_response_t*
VectorStoresAPI_listVectorStoreFiles(apiClient_t *apiClient, char *vector_store_id, int *limit, openai_api_listVectorStoreFiles_order_e order, char *after, char *before, openai_api_listVectorStoreFiles_filter_e filter)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}/files");

    if(!vector_store_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);



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
    char *keyQuery_order = NULL;
    openai_api_listVectorStoreFiles_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(listVectorStoreFiles_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
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

    // query parameters
    char *keyQuery_filter = NULL;
    openai_api_listVectorStoreFiles_filter_e valueQuery_filter ;
    keyValuePair_t *keyPairQuery_filter = 0;
    if (filter)
    {
        keyQuery_filter = strdup("filter");
        valueQuery_filter = (filter);
        keyPairQuery_filter = keyValuePair_create(keyQuery_filter, strdup(listVectorStoreFiles_FILTER_ToString(
        valueQuery_filter)));
        list_addElement(localVarQueryParameters,keyPairQuery_filter);
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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    list_vector_store_files_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_vector_store_files_response_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
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
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
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
    if(keyQuery_filter){
        free(keyQuery_filter);
        keyQuery_filter = NULL;
    }
    if(keyPairQuery_filter){
        keyValuePair_free(keyPairQuery_filter);
        keyPairQuery_filter = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of vector stores.
//
list_vector_stores_response_t*
VectorStoresAPI_listVectorStores(apiClient_t *apiClient, int *limit, openai_api_listVectorStores_order_e order, char *after, char *before)
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
    char *localVarPath = strdup("/vector_stores");





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
    char *keyQuery_order = NULL;
    openai_api_listVectorStores_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(listVectorStores_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    list_vector_stores_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_vector_stores_response_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
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

// Modifies a vector store.
//
vector_store_object_t*
VectorStoresAPI_modifyVectorStore(apiClient_t *apiClient, char *vector_store_id, update_vector_store_request_t *update_vector_store_request)
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
    char *localVarPath = strdup("/vector_stores/{vector_store_id}");

    if(!vector_store_id)
        goto end;


    // Path Params
    long sizeOfPathParams_vector_store_id = strlen(vector_store_id)+3 + sizeof("{ vector_store_id }") - 1;
    if(vector_store_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vector_store_id = malloc(sizeOfPathParams_vector_store_id);
    sprintf(localVarToReplace_vector_store_id, "{%s}", "vector_store_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_vector_store_id, vector_store_id);



    // Body Param
    cJSON *localVarSingleItemJSON_update_vector_store_request = NULL;
    if (update_vector_store_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_update_vector_store_request = update_vector_store_request_convertToJSON(update_vector_store_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_vector_store_request);
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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    vector_store_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *VectorStoresAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = vector_store_object_parseFromJSON(VectorStoresAPIlocalVarJSON);
        cJSON_Delete(VectorStoresAPIlocalVarJSON);
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
    free(localVarToReplace_vector_store_id);
    if (localVarSingleItemJSON_update_vector_store_request) {
        cJSON_Delete(localVarSingleItemJSON_update_vector_store_request);
        localVarSingleItemJSON_update_vector_store_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

