#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "UploadsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
//
upload_part_t*
UploadsAPI_addUploadPart(apiClient_t *apiClient, char *upload_id, binary_t* data)
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
    char *localVarPath = strdup("/uploads/{upload_id}/parts");

    if(!upload_id)
        goto end;


    // Path Params
    long sizeOfPathParams_upload_id = strlen(upload_id)+3 + sizeof("{ upload_id }") - 1;
    if(upload_id == NULL) {
        goto end;
    }
    char* localVarToReplace_upload_id = malloc(sizeOfPathParams_upload_id);
    sprintf(localVarToReplace_upload_id, "{%s}", "upload_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_upload_id, upload_id);



    // form parameters
    char *keyForm_data = NULL;
    binary_t* valueForm_data = 0;
    keyValuePair_t *keyPairForm_data = 0;
    if (data != NULL)
    {
        keyForm_data = strdup("data");
        valueForm_data = data;
        keyPairForm_data = keyValuePair_create(keyForm_data, &valueForm_data);
        list_addElement(localVarFormParameters,keyPairForm_data); //file adding
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
    upload_part_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UploadsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = upload_part_parseFromJSON(UploadsAPIlocalVarJSON);
        cJSON_Delete(UploadsAPIlocalVarJSON);
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
    free(localVarToReplace_upload_id);
    if (keyForm_data) {
        free(keyForm_data);
        keyForm_data = NULL;
    }
//    free(fileVar_data->data);
//    free(fileVar_data);
    free(keyPairForm_data);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Cancels the Upload. No Parts may be added after an Upload is cancelled. 
//
upload_t*
UploadsAPI_cancelUpload(apiClient_t *apiClient, char *upload_id)
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
    char *localVarPath = strdup("/uploads/{upload_id}/cancel");

    if(!upload_id)
        goto end;


    // Path Params
    long sizeOfPathParams_upload_id = strlen(upload_id)+3 + sizeof("{ upload_id }") - 1;
    if(upload_id == NULL) {
        goto end;
    }
    char* localVarToReplace_upload_id = malloc(sizeOfPathParams_upload_id);
    sprintf(localVarToReplace_upload_id, "{%s}", "upload_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_upload_id, upload_id);


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
    upload_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UploadsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = upload_parseFromJSON(UploadsAPIlocalVarJSON);
        cJSON_Delete(UploadsAPIlocalVarJSON);
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
    free(localVarToReplace_upload_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
//
upload_t*
UploadsAPI_completeUpload(apiClient_t *apiClient, char *upload_id, complete_upload_request_t *complete_upload_request)
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
    char *localVarPath = strdup("/uploads/{upload_id}/complete");

    if(!upload_id)
        goto end;


    // Path Params
    long sizeOfPathParams_upload_id = strlen(upload_id)+3 + sizeof("{ upload_id }") - 1;
    if(upload_id == NULL) {
        goto end;
    }
    char* localVarToReplace_upload_id = malloc(sizeOfPathParams_upload_id);
    sprintf(localVarToReplace_upload_id, "{%s}", "upload_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_upload_id, upload_id);



    // Body Param
    cJSON *localVarSingleItemJSON_complete_upload_request = NULL;
    if (complete_upload_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_complete_upload_request = complete_upload_request_convertToJSON(complete_upload_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_complete_upload_request);
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
    upload_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UploadsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = upload_parseFromJSON(UploadsAPIlocalVarJSON);
        cJSON_Delete(UploadsAPIlocalVarJSON);
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
    free(localVarToReplace_upload_id);
    if (localVarSingleItemJSON_complete_upload_request) {
        cJSON_Delete(localVarSingleItemJSON_complete_upload_request);
        localVarSingleItemJSON_complete_upload_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
//
upload_t*
UploadsAPI_createUpload(apiClient_t *apiClient, create_upload_request_t *create_upload_request)
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
    char *localVarPath = strdup("/uploads");





    // Body Param
    cJSON *localVarSingleItemJSON_create_upload_request = NULL;
    if (create_upload_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_upload_request = create_upload_request_convertToJSON(create_upload_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_upload_request);
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
    upload_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UploadsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = upload_parseFromJSON(UploadsAPIlocalVarJSON);
        cJSON_Delete(UploadsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_upload_request) {
        cJSON_Delete(localVarSingleItemJSON_create_upload_request);
        localVarSingleItemJSON_create_upload_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

