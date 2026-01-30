#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "FilesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum PURPOSE for FilesAPI_createFile

static char* createFile_PURPOSE_ToString(openai_api_createFile_purpose_e PURPOSE){
    char *PURPOSEArray[] =  { "NULL", "assistants", "batch", "fine-tune", "vision" };
    return PURPOSEArray[PURPOSE];
}

static openai_api_createFile_purpose_e createFile_PURPOSE_FromString(char* PURPOSE){
    int stringToReturn = 0;
    char *PURPOSEArray[] =  { "NULL", "assistants", "batch", "fine-tune", "vision" };
    size_t sizeofArray = sizeof(PURPOSEArray) / sizeof(PURPOSEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PURPOSE, PURPOSEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function createFile_PURPOSE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *createFile_PURPOSE_convertToJSON(openai_api_createFile_purpose_e PURPOSE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "purpose", createFile_PURPOSE_ToString(PURPOSE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function createFile_PURPOSE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_createFile_purpose_e createFile_PURPOSE_parseFromJSON(cJSON* PURPOSEJSON) {
    openai_api_createFile_purpose_e PURPOSEVariable = 0;
    cJSON *PURPOSEVar = cJSON_GetObjectItemCaseSensitive(PURPOSEJSON, "purpose");
    if(!cJSON_IsString(PURPOSEVar) || (PURPOSEVar->valuestring == NULL))
    {
        goto end;
    }
    PURPOSEVariable = createFile_PURPOSE_FromString(PURPOSEVar->valuestring);
    return PURPOSEVariable;
end:
    return 0;
}
*/

// Functions for enum ORDER for FilesAPI_listFiles

static char* listFiles_ORDER_ToString(openai_api_listFiles_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_listFiles_order_e listFiles_ORDER_FromString(char* ORDER){
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
// Function listFiles_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listFiles_ORDER_convertToJSON(openai_api_listFiles_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", listFiles_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listFiles_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listFiles_order_e listFiles_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_listFiles_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = listFiles_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/


// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
//
open_ai_file_t*
FilesAPI_createFile(apiClient_t *apiClient, binary_t* file, openai_api_createFile_purpose_e purpose)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/files");





    // form parameters
    char *keyForm_file = NULL;
    binary_t* valueForm_file = 0;
    keyValuePair_t *keyPairForm_file = 0;
    if (file != NULL)
    {
        keyForm_file = strdup("file");
        valueForm_file = file;
        keyPairForm_file = keyValuePair_create(keyForm_file, &valueForm_file);
        list_addElement(localVarFormParameters,keyPairForm_file); //file adding
    }

    // form parameters
    char *keyForm_purpose = NULL;
    openai_api_createFile_purpose_e valueForm_purpose = 0;
    keyValuePair_t *keyPairForm_purpose = 0;
    if (purpose != 0)
    {
        keyForm_purpose = strdup("purpose");
        valueForm_purpose = (purpose);
        keyPairForm_purpose = keyValuePair_create(keyForm_purpose,(void *)valueForm_purpose);
        list_addElement(localVarFormParameters,keyPairForm_purpose);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"multipart/form-data"); //consumes
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
    open_ai_file_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *FilesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = open_ai_file_parseFromJSON(FilesAPIlocalVarJSON);
        cJSON_Delete(FilesAPIlocalVarJSON);
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
    
    
    list_freeList(localVarFormParameters);
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (keyForm_file) {
        free(keyForm_file);
        keyForm_file = NULL;
    }
//    free(fileVar_file->data);
//    free(fileVar_file);
    free(keyPairForm_file);
    if (keyForm_purpose) {
        free(keyForm_purpose);
        keyForm_purpose = NULL;
    }
    if (valueForm_purpose) {
        valueForm_purpose = 0;
    }
    free(keyPairForm_purpose);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete a file.
//
delete_file_response_t*
FilesAPI_deleteFile(apiClient_t *apiClient, char *file_id)
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
    char *localVarPath = strdup("/files/{file_id}");

    if(!file_id)
        goto end;


    // Path Params
    long sizeOfPathParams_file_id = strlen(file_id)+3 + sizeof("{ file_id }") - 1;
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
    delete_file_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *FilesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = delete_file_response_parseFromJSON(FilesAPIlocalVarJSON);
        cJSON_Delete(FilesAPIlocalVarJSON);
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
    free(localVarToReplace_file_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns the contents of the specified file.
//
char*
FilesAPI_downloadFile(apiClient_t *apiClient, char *file_id)
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
    char *localVarPath = strdup("/files/{file_id}/content");

    if(!file_id)
        goto end;


    // Path Params
    long sizeOfPathParams_file_id = strlen(file_id)+3 + sizeof("{ file_id }") - 1;
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
    //primitive return type simple string
    char* elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300)
        elementToReturn = strdup((char*)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_file_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of files.
//
list_files_response_t*
FilesAPI_listFiles(apiClient_t *apiClient, char *purpose, int *limit, openai_api_listFiles_order_e order, char *after)
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
    char *localVarPath = strdup("/files");





    // query parameters
    char *keyQuery_purpose = NULL;
    char * valueQuery_purpose = NULL;
    keyValuePair_t *keyPairQuery_purpose = 0;
    if (purpose)
    {
        keyQuery_purpose = strdup("purpose");
        valueQuery_purpose = strdup((purpose));
        keyPairQuery_purpose = keyValuePair_create(keyQuery_purpose, valueQuery_purpose);
        list_addElement(localVarQueryParameters,keyPairQuery_purpose);
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
    char *keyQuery_order = NULL;
    openai_api_listFiles_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(listFiles_ORDER_ToString(
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
    list_files_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *FilesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_files_response_parseFromJSON(FilesAPIlocalVarJSON);
        cJSON_Delete(FilesAPIlocalVarJSON);
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
    if(keyQuery_purpose){
        free(keyQuery_purpose);
        keyQuery_purpose = NULL;
    }
    if(valueQuery_purpose){
        free(valueQuery_purpose);
        valueQuery_purpose = NULL;
    }
    if(keyPairQuery_purpose){
        keyValuePair_free(keyPairQuery_purpose);
        keyPairQuery_purpose = NULL;
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns information about a specific file.
//
open_ai_file_t*
FilesAPI_retrieveFile(apiClient_t *apiClient, char *file_id)
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
    char *localVarPath = strdup("/files/{file_id}");

    if(!file_id)
        goto end;


    // Path Params
    long sizeOfPathParams_file_id = strlen(file_id)+3 + sizeof("{ file_id }") - 1;
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
    open_ai_file_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *FilesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = open_ai_file_parseFromJSON(FilesAPIlocalVarJSON);
        cJSON_Delete(FilesAPIlocalVarJSON);
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
    free(localVarToReplace_file_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

