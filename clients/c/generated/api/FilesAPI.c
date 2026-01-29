#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "FilesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum PURPOSE for FilesAPI_createFile

static char* createFile_PURPOSE_ToString(openai_api_createFile_purpose_e PURPOSE){
    char *PURPOSEArray[] =  { "NULL", "fine-tune", "assistants" };
    return PURPOSEArray[PURPOSE];
}

static openai_api_createFile_purpose_e createFile_PURPOSE_FromString(char* PURPOSE){
    int stringToReturn = 0;
    char *PURPOSEArray[] =  { "NULL", "fine-tune", "assistants" };
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


// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
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

// Returns a list of files that belong to the user's organization.
//
list_files_response_t*
FilesAPI_listFiles(apiClient_t *apiClient, char *purpose)
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

