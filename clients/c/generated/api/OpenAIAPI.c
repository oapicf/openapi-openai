#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "OpenAIAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum SIZE for OpenAIAPI_createImageEdit

static char* createImageEdit_SIZE_ToString(openai_api_createImageEdit_size_e SIZE){
    char *SIZEArray[] =  { "NULL", "256x256", "512x512", "1024x1024" };
    return SIZEArray[SIZE];
}

static openai_api_createImageEdit_size_e createImageEdit_SIZE_FromString(char* SIZE){
    int stringToReturn = 0;
    char *SIZEArray[] =  { "NULL", "256x256", "512x512", "1024x1024" };
    size_t sizeofArray = sizeof(SIZEArray) / sizeof(SIZEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SIZE, SIZEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function createImageEdit_SIZE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *createImageEdit_SIZE_convertToJSON(openai_api_createImageEdit_size_e SIZE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "size", createImageEdit_SIZE_ToString(SIZE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function createImageEdit_SIZE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_createImageEdit_size_e createImageEdit_SIZE_parseFromJSON(cJSON* SIZEJSON) {
    openai_api_createImageEdit_size_e SIZEVariable = 0;
    cJSON *SIZEVar = cJSON_GetObjectItemCaseSensitive(SIZEJSON, "size");
    if(!cJSON_IsString(SIZEVar) || (SIZEVar->valuestring == NULL))
    {
        goto end;
    }
    SIZEVariable = createImageEdit_SIZE_FromString(SIZEVar->valuestring);
    return SIZEVariable;
end:
    return 0;
}
*/

// Functions for enum RESPONSEFORMAT for OpenAIAPI_createImageEdit

static char* createImageEdit_RESPONSEFORMAT_ToString(openai_api_createImageEdit_response_format_e RESPONSEFORMAT){
    char *RESPONSEFORMATArray[] =  { "NULL", "url", "b64_json" };
    return RESPONSEFORMATArray[RESPONSEFORMAT];
}

static openai_api_createImageEdit_response_format_e createImageEdit_RESPONSEFORMAT_FromString(char* RESPONSEFORMAT){
    int stringToReturn = 0;
    char *RESPONSEFORMATArray[] =  { "NULL", "url", "b64_json" };
    size_t sizeofArray = sizeof(RESPONSEFORMATArray) / sizeof(RESPONSEFORMATArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(RESPONSEFORMAT, RESPONSEFORMATArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function createImageEdit_RESPONSEFORMAT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *createImageEdit_RESPONSEFORMAT_convertToJSON(openai_api_createImageEdit_response_format_e RESPONSEFORMAT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "response_format", createImageEdit_RESPONSEFORMAT_ToString(RESPONSEFORMAT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function createImageEdit_RESPONSEFORMAT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_createImageEdit_response_format_e createImageEdit_RESPONSEFORMAT_parseFromJSON(cJSON* RESPONSEFORMATJSON) {
    openai_api_createImageEdit_response_format_e RESPONSEFORMATVariable = 0;
    cJSON *RESPONSEFORMATVar = cJSON_GetObjectItemCaseSensitive(RESPONSEFORMATJSON, "response_format");
    if(!cJSON_IsString(RESPONSEFORMATVar) || (RESPONSEFORMATVar->valuestring == NULL))
    {
        goto end;
    }
    RESPONSEFORMATVariable = createImageEdit_RESPONSEFORMAT_FromString(RESPONSEFORMATVar->valuestring);
    return RESPONSEFORMATVariable;
end:
    return 0;
}
*/

// Functions for enum SIZE for OpenAIAPI_createImageVariation

static char* createImageVariation_SIZE_ToString(openai_api_createImageVariation_size_e SIZE){
    char *SIZEArray[] =  { "NULL", "256x256", "512x512", "1024x1024" };
    return SIZEArray[SIZE];
}

static openai_api_createImageVariation_size_e createImageVariation_SIZE_FromString(char* SIZE){
    int stringToReturn = 0;
    char *SIZEArray[] =  { "NULL", "256x256", "512x512", "1024x1024" };
    size_t sizeofArray = sizeof(SIZEArray) / sizeof(SIZEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SIZE, SIZEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function createImageVariation_SIZE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *createImageVariation_SIZE_convertToJSON(openai_api_createImageVariation_size_e SIZE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "size", createImageVariation_SIZE_ToString(SIZE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function createImageVariation_SIZE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_createImageVariation_size_e createImageVariation_SIZE_parseFromJSON(cJSON* SIZEJSON) {
    openai_api_createImageVariation_size_e SIZEVariable = 0;
    cJSON *SIZEVar = cJSON_GetObjectItemCaseSensitive(SIZEJSON, "size");
    if(!cJSON_IsString(SIZEVar) || (SIZEVar->valuestring == NULL))
    {
        goto end;
    }
    SIZEVariable = createImageVariation_SIZE_FromString(SIZEVar->valuestring);
    return SIZEVariable;
end:
    return 0;
}
*/

// Functions for enum RESPONSEFORMAT for OpenAIAPI_createImageVariation

static char* createImageVariation_RESPONSEFORMAT_ToString(openai_api_createImageVariation_response_format_e RESPONSEFORMAT){
    char *RESPONSEFORMATArray[] =  { "NULL", "url", "b64_json" };
    return RESPONSEFORMATArray[RESPONSEFORMAT];
}

static openai_api_createImageVariation_response_format_e createImageVariation_RESPONSEFORMAT_FromString(char* RESPONSEFORMAT){
    int stringToReturn = 0;
    char *RESPONSEFORMATArray[] =  { "NULL", "url", "b64_json" };
    size_t sizeofArray = sizeof(RESPONSEFORMATArray) / sizeof(RESPONSEFORMATArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(RESPONSEFORMAT, RESPONSEFORMATArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function createImageVariation_RESPONSEFORMAT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *createImageVariation_RESPONSEFORMAT_convertToJSON(openai_api_createImageVariation_response_format_e RESPONSEFORMAT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "response_format", createImageVariation_RESPONSEFORMAT_ToString(RESPONSEFORMAT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function createImageVariation_RESPONSEFORMAT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_createImageVariation_response_format_e createImageVariation_RESPONSEFORMAT_parseFromJSON(cJSON* RESPONSEFORMATJSON) {
    openai_api_createImageVariation_response_format_e RESPONSEFORMATVariable = 0;
    cJSON *RESPONSEFORMATVar = cJSON_GetObjectItemCaseSensitive(RESPONSEFORMATJSON, "response_format");
    if(!cJSON_IsString(RESPONSEFORMATVar) || (RESPONSEFORMATVar->valuestring == NULL))
    {
        goto end;
    }
    RESPONSEFORMATVariable = createImageVariation_RESPONSEFORMAT_FromString(RESPONSEFORMATVar->valuestring);
    return RESPONSEFORMATVariable;
end:
    return 0;
}
*/


// Immediately cancel a fine-tune job. 
//
fine_tune_t*
OpenAIAPI_cancelFineTune(apiClient_t *apiClient, char *fine_tune_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine-tunes/{fine_tune_id}/cancel")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine-tunes/{fine_tune_id}/cancel");


    // Path Params
    long sizeOfPathParams_fine_tune_id = strlen(fine_tune_id)+3 + strlen("{ fine_tune_id }");
    if(fine_tune_id == NULL) {
        goto end;
    }
    char* localVarToReplace_fine_tune_id = malloc(sizeOfPathParams_fine_tune_id);
    sprintf(localVarToReplace_fine_tune_id, "{%s}", "fine_tune_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_fine_tune_id, fine_tune_id);


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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    fine_tune_t *elementToReturn = fine_tune_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    free(localVarToReplace_fine_tune_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates a model response for the given chat conversation.
//
create_chat_completion_response_t*
OpenAIAPI_createChatCompletion(apiClient_t *apiClient, create_chat_completion_request_t *create_chat_completion_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/chat/completions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/chat/completions");




    // Body Param
    cJSON *localVarSingleItemJSON_create_chat_completion_request = NULL;
    if (create_chat_completion_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_chat_completion_request = create_chat_completion_request_convertToJSON(create_chat_completion_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_chat_completion_request);
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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_chat_completion_response_t *elementToReturn = create_chat_completion_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_chat_completion_request) {
        cJSON_Delete(localVarSingleItemJSON_create_chat_completion_request);
        localVarSingleItemJSON_create_chat_completion_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates a completion for the provided prompt and parameters.
//
create_completion_response_t*
OpenAIAPI_createCompletion(apiClient_t *apiClient, create_completion_request_t *create_completion_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/completions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/completions");




    // Body Param
    cJSON *localVarSingleItemJSON_create_completion_request = NULL;
    if (create_completion_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_completion_request = create_completion_request_convertToJSON(create_completion_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_completion_request);
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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_completion_response_t *elementToReturn = create_completion_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_completion_request) {
        cJSON_Delete(localVarSingleItemJSON_create_completion_request);
        localVarSingleItemJSON_create_completion_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates a new edit for the provided input, instruction, and parameters.
//
create_edit_response_t*
OpenAIAPI_createEdit(apiClient_t *apiClient, create_edit_request_t *create_edit_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/edits")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/edits");




    // Body Param
    cJSON *localVarSingleItemJSON_create_edit_request = NULL;
    if (create_edit_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_edit_request = create_edit_request_convertToJSON(create_edit_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_edit_request);
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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_edit_response_t *elementToReturn = create_edit_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_edit_request) {
        cJSON_Delete(localVarSingleItemJSON_create_edit_request);
        localVarSingleItemJSON_create_edit_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates an embedding vector representing the input text.
//
create_embedding_response_t*
OpenAIAPI_createEmbedding(apiClient_t *apiClient, create_embedding_request_t *create_embedding_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/embeddings")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/embeddings");




    // Body Param
    cJSON *localVarSingleItemJSON_create_embedding_request = NULL;
    if (create_embedding_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_embedding_request = create_embedding_request_convertToJSON(create_embedding_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_embedding_request);
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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_embedding_response_t *elementToReturn = create_embedding_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_embedding_request) {
        cJSON_Delete(localVarSingleItemJSON_create_embedding_request);
        localVarSingleItemJSON_create_embedding_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
//
open_ai_file_t*
OpenAIAPI_createFile(apiClient_t *apiClient, binary_t* file, char *purpose)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/files")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/files");




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
    char * valueForm_purpose = 0;
    keyValuePair_t *keyPairForm_purpose = 0;
    if (purpose != NULL)
    {
        keyForm_purpose = strdup("purpose");
        valueForm_purpose = strdup((purpose));
        keyPairForm_purpose = keyValuePair_create(keyForm_purpose,valueForm_purpose);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    open_ai_file_t *elementToReturn = open_ai_file_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
        free(valueForm_purpose);
        valueForm_purpose = NULL;
    }
    free(keyPairForm_purpose);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
//
fine_tune_t*
OpenAIAPI_createFineTune(apiClient_t *apiClient, create_fine_tune_request_t *create_fine_tune_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine-tunes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine-tunes");




    // Body Param
    cJSON *localVarSingleItemJSON_create_fine_tune_request = NULL;
    if (create_fine_tune_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_fine_tune_request = create_fine_tune_request_convertToJSON(create_fine_tune_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_fine_tune_request);
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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    fine_tune_t *elementToReturn = fine_tune_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_fine_tune_request) {
        cJSON_Delete(localVarSingleItemJSON_create_fine_tune_request);
        localVarSingleItemJSON_create_fine_tune_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates an image given a prompt.
//
images_response_t*
OpenAIAPI_createImage(apiClient_t *apiClient, create_image_request_t *create_image_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/images/generations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/images/generations");




    // Body Param
    cJSON *localVarSingleItemJSON_create_image_request = NULL;
    if (create_image_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_image_request = create_image_request_convertToJSON(create_image_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_image_request);
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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    images_response_t *elementToReturn = images_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_image_request) {
        cJSON_Delete(localVarSingleItemJSON_create_image_request);
        localVarSingleItemJSON_create_image_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates an edited or extended image given an original image and a prompt.
//
images_response_t*
OpenAIAPI_createImageEdit(apiClient_t *apiClient, binary_t* image, char *prompt, binary_t* mask, int *n, openai_api_createImageEdit_size_e size, openai_api_createImageEdit_response_format_e response_format, char *user)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/images/edits")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/images/edits");




    // form parameters
    char *keyForm_image = NULL;
    binary_t* valueForm_image = 0;
    keyValuePair_t *keyPairForm_image = 0;
    if (image != NULL)
    {
        keyForm_image = strdup("image");
        valueForm_image = image;
        keyPairForm_image = keyValuePair_create(keyForm_image, &valueForm_image);
        list_addElement(localVarFormParameters,keyPairForm_image); //file adding
    }

    // form parameters
    char *keyForm_mask = NULL;
    binary_t* valueForm_mask = 0;
    keyValuePair_t *keyPairForm_mask = 0;
    if (mask != NULL)
    {
        keyForm_mask = strdup("mask");
        valueForm_mask = mask;
        keyPairForm_mask = keyValuePair_create(keyForm_mask, &valueForm_mask);
        list_addElement(localVarFormParameters,keyPairForm_mask); //file adding
    }

    // form parameters
    char *keyForm_prompt = NULL;
    char * valueForm_prompt = 0;
    keyValuePair_t *keyPairForm_prompt = 0;
    if (prompt != NULL)
    {
        keyForm_prompt = strdup("prompt");
        valueForm_prompt = strdup((prompt));
        keyPairForm_prompt = keyValuePair_create(keyForm_prompt,valueForm_prompt);
        list_addElement(localVarFormParameters,keyPairForm_prompt);
    }

    // form parameters
    char *keyForm_n = NULL;
    int valueForm_n = 0;
    keyValuePair_t *keyPairForm_n = 0;
    if (n != NULL)
    {
        keyForm_n = strdup("n");
        valueForm_n = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueForm_n, MAX_NUMBER_LENGTH, "%d", *n);
        keyPairForm_n = keyValuePair_create(keyForm_n,&valueForm_n);
        list_addElement(localVarFormParameters,keyPairForm_n);
    }

    // form parameters
    char *keyForm_size = NULL;
    openai_api_createImageEdit_size_e valueForm_size = 0;
    keyValuePair_t *keyPairForm_size = 0;
    if (size != NULL)
    {
        keyForm_size = strdup("size");
        valueForm_size = (size);
        keyPairForm_size = keyValuePair_create(keyForm_size,(void *)valueForm_size);
        list_addElement(localVarFormParameters,keyPairForm_size);
    }

    // form parameters
    char *keyForm_response_format = NULL;
    openai_api_createImageEdit_response_format_e valueForm_response_format = 0;
    keyValuePair_t *keyPairForm_response_format = 0;
    if (response_format != NULL)
    {
        keyForm_response_format = strdup("response_format");
        valueForm_response_format = (response_format);
        keyPairForm_response_format = keyValuePair_create(keyForm_response_format,(void *)valueForm_response_format);
        list_addElement(localVarFormParameters,keyPairForm_response_format);
    }

    // form parameters
    char *keyForm_user = NULL;
    char * valueForm_user = 0;
    keyValuePair_t *keyPairForm_user = 0;
    if (user != NULL)
    {
        keyForm_user = strdup("user");
        valueForm_user = strdup((user));
        keyPairForm_user = keyValuePair_create(keyForm_user,valueForm_user);
        list_addElement(localVarFormParameters,keyPairForm_user);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    images_response_t *elementToReturn = images_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    if (keyForm_image) {
        free(keyForm_image);
        keyForm_image = NULL;
    }
//    free(fileVar_image->data);
//    free(fileVar_image);
    free(keyPairForm_image);
    if (keyForm_mask) {
        free(keyForm_mask);
        keyForm_mask = NULL;
    }
//    free(fileVar_mask->data);
//    free(fileVar_mask);
    free(keyPairForm_mask);
    if (keyForm_prompt) {
        free(keyForm_prompt);
        keyForm_prompt = NULL;
    }
    if (valueForm_prompt) {
        free(valueForm_prompt);
        valueForm_prompt = NULL;
    }
    free(keyPairForm_prompt);
    if (keyForm_n) {
        free(keyForm_n);
        keyForm_n = NULL;
    }
    free(keyPairForm_n);
    if (keyForm_size) {
        free(keyForm_size);
        keyForm_size = NULL;
    }
    if (valueForm_size) {
        free(valueForm_size);
        valueForm_size = NULL;
    }
    free(keyPairForm_size);
    if (keyForm_response_format) {
        free(keyForm_response_format);
        keyForm_response_format = NULL;
    }
    if (valueForm_response_format) {
        free(valueForm_response_format);
        valueForm_response_format = NULL;
    }
    free(keyPairForm_response_format);
    if (keyForm_user) {
        free(keyForm_user);
        keyForm_user = NULL;
    }
    if (valueForm_user) {
        free(valueForm_user);
        valueForm_user = NULL;
    }
    free(keyPairForm_user);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates a variation of a given image.
//
images_response_t*
OpenAIAPI_createImageVariation(apiClient_t *apiClient, binary_t* image, int *n, openai_api_createImageVariation_size_e size, openai_api_createImageVariation_response_format_e response_format, char *user)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/images/variations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/images/variations");




    // form parameters
    char *keyForm_image = NULL;
    binary_t* valueForm_image = 0;
    keyValuePair_t *keyPairForm_image = 0;
    if (image != NULL)
    {
        keyForm_image = strdup("image");
        valueForm_image = image;
        keyPairForm_image = keyValuePair_create(keyForm_image, &valueForm_image);
        list_addElement(localVarFormParameters,keyPairForm_image); //file adding
    }

    // form parameters
    char *keyForm_n = NULL;
    int valueForm_n = 0;
    keyValuePair_t *keyPairForm_n = 0;
    if (n != NULL)
    {
        keyForm_n = strdup("n");
        valueForm_n = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueForm_n, MAX_NUMBER_LENGTH, "%d", *n);
        keyPairForm_n = keyValuePair_create(keyForm_n,&valueForm_n);
        list_addElement(localVarFormParameters,keyPairForm_n);
    }

    // form parameters
    char *keyForm_size = NULL;
    openai_api_createImageVariation_size_e valueForm_size = 0;
    keyValuePair_t *keyPairForm_size = 0;
    if (size != NULL)
    {
        keyForm_size = strdup("size");
        valueForm_size = (size);
        keyPairForm_size = keyValuePair_create(keyForm_size,(void *)valueForm_size);
        list_addElement(localVarFormParameters,keyPairForm_size);
    }

    // form parameters
    char *keyForm_response_format = NULL;
    openai_api_createImageVariation_response_format_e valueForm_response_format = 0;
    keyValuePair_t *keyPairForm_response_format = 0;
    if (response_format != NULL)
    {
        keyForm_response_format = strdup("response_format");
        valueForm_response_format = (response_format);
        keyPairForm_response_format = keyValuePair_create(keyForm_response_format,(void *)valueForm_response_format);
        list_addElement(localVarFormParameters,keyPairForm_response_format);
    }

    // form parameters
    char *keyForm_user = NULL;
    char * valueForm_user = 0;
    keyValuePair_t *keyPairForm_user = 0;
    if (user != NULL)
    {
        keyForm_user = strdup("user");
        valueForm_user = strdup((user));
        keyPairForm_user = keyValuePair_create(keyForm_user,valueForm_user);
        list_addElement(localVarFormParameters,keyPairForm_user);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    images_response_t *elementToReturn = images_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    if (keyForm_image) {
        free(keyForm_image);
        keyForm_image = NULL;
    }
//    free(fileVar_image->data);
//    free(fileVar_image);
    free(keyPairForm_image);
    if (keyForm_n) {
        free(keyForm_n);
        keyForm_n = NULL;
    }
    free(keyPairForm_n);
    if (keyForm_size) {
        free(keyForm_size);
        keyForm_size = NULL;
    }
    if (valueForm_size) {
        free(valueForm_size);
        valueForm_size = NULL;
    }
    free(keyPairForm_size);
    if (keyForm_response_format) {
        free(keyForm_response_format);
        keyForm_response_format = NULL;
    }
    if (valueForm_response_format) {
        free(valueForm_response_format);
        valueForm_response_format = NULL;
    }
    free(keyPairForm_response_format);
    if (keyForm_user) {
        free(keyForm_user);
        keyForm_user = NULL;
    }
    if (valueForm_user) {
        free(valueForm_user);
        valueForm_user = NULL;
    }
    free(keyPairForm_user);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Classifies if text violates OpenAI's Content Policy
//
create_moderation_response_t*
OpenAIAPI_createModeration(apiClient_t *apiClient, create_moderation_request_t *create_moderation_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/moderations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/moderations");




    // Body Param
    cJSON *localVarSingleItemJSON_create_moderation_request = NULL;
    if (create_moderation_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_moderation_request = create_moderation_request_convertToJSON(create_moderation_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_moderation_request);
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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_moderation_response_t *elementToReturn = create_moderation_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_moderation_request) {
        cJSON_Delete(localVarSingleItemJSON_create_moderation_request);
        localVarSingleItemJSON_create_moderation_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Transcribes audio into the input language.
//
create_transcription_response_t*
OpenAIAPI_createTranscription(apiClient_t *apiClient, binary_t* file, create_transcription_request_model_t *model, char *prompt, char *response_format, double temperature, char *language)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/audio/transcriptions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/audio/transcriptions");




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
    char *keyForm_model = NULL;
    create_transcription_request_model_t * valueForm_model = 0;
    keyValuePair_t *keyPairForm_model = 0;
    if (model != NULL)
    {
        keyForm_model = strdup("model");
        valueForm_model = (model);
        keyPairForm_model = keyValuePair_create(keyForm_model,&valueForm_model);
        list_addElement(localVarFormParameters,keyPairForm_model);
    }

    // form parameters
    char *keyForm_prompt = NULL;
    char * valueForm_prompt = 0;
    keyValuePair_t *keyPairForm_prompt = 0;
    if (prompt != NULL)
    {
        keyForm_prompt = strdup("prompt");
        valueForm_prompt = strdup((prompt));
        keyPairForm_prompt = keyValuePair_create(keyForm_prompt,valueForm_prompt);
        list_addElement(localVarFormParameters,keyPairForm_prompt);
    }

    // form parameters
    char *keyForm_response_format = NULL;
    char * valueForm_response_format = 0;
    keyValuePair_t *keyPairForm_response_format = 0;
    if (response_format != NULL)
    {
        keyForm_response_format = strdup("response_format");
        valueForm_response_format = strdup((response_format));
        keyPairForm_response_format = keyValuePair_create(keyForm_response_format,valueForm_response_format);
        list_addElement(localVarFormParameters,keyPairForm_response_format);
    }

    // form parameters
    char *keyForm_temperature = NULL;
    double valueForm_temperature = 0;
    keyValuePair_t *keyPairForm_temperature = 0;
    if (temperature != NULL)
    {
        keyForm_temperature = strdup("temperature");
        valueForm_temperature = (temperature);
        keyPairForm_temperature = keyValuePair_create(keyForm_temperature,&valueForm_temperature);
        list_addElement(localVarFormParameters,keyPairForm_temperature);
    }

    // form parameters
    char *keyForm_language = NULL;
    char * valueForm_language = 0;
    keyValuePair_t *keyPairForm_language = 0;
    if (language != NULL)
    {
        keyForm_language = strdup("language");
        valueForm_language = strdup((language));
        keyPairForm_language = keyValuePair_create(keyForm_language,valueForm_language);
        list_addElement(localVarFormParameters,keyPairForm_language);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_transcription_response_t *elementToReturn = create_transcription_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    if (keyForm_model) {
        free(keyForm_model);
        keyForm_model = NULL;
    }
    free(keyPairForm_model);
    if (keyForm_prompt) {
        free(keyForm_prompt);
        keyForm_prompt = NULL;
    }
    if (valueForm_prompt) {
        free(valueForm_prompt);
        valueForm_prompt = NULL;
    }
    free(keyPairForm_prompt);
    if (keyForm_response_format) {
        free(keyForm_response_format);
        keyForm_response_format = NULL;
    }
    if (valueForm_response_format) {
        free(valueForm_response_format);
        valueForm_response_format = NULL;
    }
    free(keyPairForm_response_format);
    if (keyForm_temperature) {
        free(keyForm_temperature);
        keyForm_temperature = NULL;
    }
    free(keyPairForm_temperature);
    if (keyForm_language) {
        free(keyForm_language);
        keyForm_language = NULL;
    }
    if (valueForm_language) {
        free(valueForm_language);
        valueForm_language = NULL;
    }
    free(keyPairForm_language);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Translates audio into English.
//
create_translation_response_t*
OpenAIAPI_createTranslation(apiClient_t *apiClient, binary_t* file, create_transcription_request_model_t *model, char *prompt, char *response_format, double temperature)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/audio/translations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/audio/translations");




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
    char *keyForm_model = NULL;
    create_transcription_request_model_t * valueForm_model = 0;
    keyValuePair_t *keyPairForm_model = 0;
    if (model != NULL)
    {
        keyForm_model = strdup("model");
        valueForm_model = (model);
        keyPairForm_model = keyValuePair_create(keyForm_model,&valueForm_model);
        list_addElement(localVarFormParameters,keyPairForm_model);
    }

    // form parameters
    char *keyForm_prompt = NULL;
    char * valueForm_prompt = 0;
    keyValuePair_t *keyPairForm_prompt = 0;
    if (prompt != NULL)
    {
        keyForm_prompt = strdup("prompt");
        valueForm_prompt = strdup((prompt));
        keyPairForm_prompt = keyValuePair_create(keyForm_prompt,valueForm_prompt);
        list_addElement(localVarFormParameters,keyPairForm_prompt);
    }

    // form parameters
    char *keyForm_response_format = NULL;
    char * valueForm_response_format = 0;
    keyValuePair_t *keyPairForm_response_format = 0;
    if (response_format != NULL)
    {
        keyForm_response_format = strdup("response_format");
        valueForm_response_format = strdup((response_format));
        keyPairForm_response_format = keyValuePair_create(keyForm_response_format,valueForm_response_format);
        list_addElement(localVarFormParameters,keyPairForm_response_format);
    }

    // form parameters
    char *keyForm_temperature = NULL;
    double valueForm_temperature = 0;
    keyValuePair_t *keyPairForm_temperature = 0;
    if (temperature != NULL)
    {
        keyForm_temperature = strdup("temperature");
        valueForm_temperature = (temperature);
        keyPairForm_temperature = keyValuePair_create(keyForm_temperature,&valueForm_temperature);
        list_addElement(localVarFormParameters,keyPairForm_temperature);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_translation_response_t *elementToReturn = create_translation_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    if (keyForm_model) {
        free(keyForm_model);
        keyForm_model = NULL;
    }
    free(keyPairForm_model);
    if (keyForm_prompt) {
        free(keyForm_prompt);
        keyForm_prompt = NULL;
    }
    if (valueForm_prompt) {
        free(valueForm_prompt);
        valueForm_prompt = NULL;
    }
    free(keyPairForm_prompt);
    if (keyForm_response_format) {
        free(keyForm_response_format);
        keyForm_response_format = NULL;
    }
    if (valueForm_response_format) {
        free(valueForm_response_format);
        valueForm_response_format = NULL;
    }
    free(keyPairForm_response_format);
    if (keyForm_temperature) {
        free(keyForm_temperature);
        keyForm_temperature = NULL;
    }
    free(keyPairForm_temperature);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete a file.
//
delete_file_response_t*
OpenAIAPI_deleteFile(apiClient_t *apiClient, char *file_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/files/{file_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/files/{file_id}");


    // Path Params
    long sizeOfPathParams_file_id = strlen(file_id)+3 + strlen("{ file_id }");
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
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_file_response_t *elementToReturn = delete_file_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    free(localVarToReplace_file_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete a fine-tuned model. You must have the Owner role in your organization.
//
delete_model_response_t*
OpenAIAPI_deleteModel(apiClient_t *apiClient, char *model)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/models/{model}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/models/{model}");


    // Path Params
    long sizeOfPathParams_model = strlen(model)+3 + strlen("{ model }");
    if(model == NULL) {
        goto end;
    }
    char* localVarToReplace_model = malloc(sizeOfPathParams_model);
    sprintf(localVarToReplace_model, "{%s}", "model");

    localVarPath = strReplace(localVarPath, localVarToReplace_model, model);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_model_response_t *elementToReturn = delete_model_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    free(localVarToReplace_model);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns the contents of the specified file
//
char*
OpenAIAPI_downloadFile(apiClient_t *apiClient, char *file_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/files/{file_id}/content")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/files/{file_id}/content");


    // Path Params
    long sizeOfPathParams_file_id = strlen(file_id)+3 + strlen("{ file_id }");
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //primitive return type simple
    char* elementToReturn =  strdup((char*)apiClient->dataReceived);

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

// Returns a list of files that belong to the user's organization.
//
list_files_response_t*
OpenAIAPI_listFiles(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/files")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/files");



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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    list_files_response_t *elementToReturn = list_files_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get fine-grained status updates for a fine-tune job. 
//
list_fine_tune_events_response_t*
OpenAIAPI_listFineTuneEvents(apiClient_t *apiClient, char *fine_tune_id, int *stream)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine-tunes/{fine_tune_id}/events")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine-tunes/{fine_tune_id}/events");


    // Path Params
    long sizeOfPathParams_fine_tune_id = strlen(fine_tune_id)+3 + strlen("{ fine_tune_id }");
    if(fine_tune_id == NULL) {
        goto end;
    }
    char* localVarToReplace_fine_tune_id = malloc(sizeOfPathParams_fine_tune_id);
    sprintf(localVarToReplace_fine_tune_id, "{%s}", "fine_tune_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_fine_tune_id, fine_tune_id);



    // query parameters
    char *keyQuery_stream = NULL;
    char * valueQuery_stream = NULL;
    keyValuePair_t *keyPairQuery_stream = 0;
    if (stream)
    {
        keyQuery_stream = strdup("stream");
        valueQuery_stream = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_stream, MAX_NUMBER_LENGTH, "%d", *stream);
        keyPairQuery_stream = keyValuePair_create(keyQuery_stream, valueQuery_stream);
        list_addElement(localVarQueryParameters,keyPairQuery_stream);
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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    list_fine_tune_events_response_t *elementToReturn = list_fine_tune_events_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    free(localVarToReplace_fine_tune_id);
    if(keyQuery_stream){
        free(keyQuery_stream);
        keyQuery_stream = NULL;
    }
    if(valueQuery_stream){
        free(valueQuery_stream);
        valueQuery_stream = NULL;
    }
    if(keyPairQuery_stream){
        keyValuePair_free(keyPairQuery_stream);
        keyPairQuery_stream = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List your organization's fine-tuning jobs 
//
list_fine_tunes_response_t*
OpenAIAPI_listFineTunes(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine-tunes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine-tunes");



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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    list_fine_tunes_response_t *elementToReturn = list_fine_tunes_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Lists the currently available models, and provides basic information about each one such as the owner and availability.
//
list_models_response_t*
OpenAIAPI_listModels(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/models")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/models");



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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    list_models_response_t *elementToReturn = list_models_response_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns information about a specific file.
//
open_ai_file_t*
OpenAIAPI_retrieveFile(apiClient_t *apiClient, char *file_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/files/{file_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/files/{file_id}");


    // Path Params
    long sizeOfPathParams_file_id = strlen(file_id)+3 + strlen("{ file_id }");
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    open_ai_file_t *elementToReturn = open_ai_file_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    free(localVarToReplace_file_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
//
fine_tune_t*
OpenAIAPI_retrieveFineTune(apiClient_t *apiClient, char *fine_tune_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fine-tunes/{fine_tune_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fine-tunes/{fine_tune_id}");


    // Path Params
    long sizeOfPathParams_fine_tune_id = strlen(fine_tune_id)+3 + strlen("{ fine_tune_id }");
    if(fine_tune_id == NULL) {
        goto end;
    }
    char* localVarToReplace_fine_tune_id = malloc(sizeOfPathParams_fine_tune_id);
    sprintf(localVarToReplace_fine_tune_id, "{%s}", "fine_tune_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_fine_tune_id, fine_tune_id);


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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    fine_tune_t *elementToReturn = fine_tune_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    free(localVarToReplace_fine_tune_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
//
model_t*
OpenAIAPI_retrieveModel(apiClient_t *apiClient, char *model)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/models/{model}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/models/{model}");


    // Path Params
    long sizeOfPathParams_model = strlen(model)+3 + strlen("{ model }");
    if(model == NULL) {
        goto end;
    }
    char* localVarToReplace_model = malloc(sizeOfPathParams_model);
    sprintf(localVarToReplace_model, "{%s}", "model");

    localVarPath = strReplace(localVarPath, localVarToReplace_model, model);


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
    cJSON *OpenAIAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    model_t *elementToReturn = model_parseFromJSON(OpenAIAPIlocalVarJSON);
    cJSON_Delete(OpenAIAPIlocalVarJSON);
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
    free(localVarToReplace_model);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

