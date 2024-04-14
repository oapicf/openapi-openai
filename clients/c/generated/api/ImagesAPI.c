#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ImagesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum SIZE for ImagesAPI_createImageEdit

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

// Functions for enum RESPONSEFORMAT for ImagesAPI_createImageEdit

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

// Functions for enum RESPONSEFORMAT for ImagesAPI_createImageVariation

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

// Functions for enum SIZE for ImagesAPI_createImageVariation

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


// Creates an image given a prompt.
//
images_response_t*
ImagesAPI_createImage(apiClient_t *apiClient, create_image_request_t *create_image_request)
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
    cJSON *ImagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    images_response_t *elementToReturn = images_response_parseFromJSON(ImagesAPIlocalVarJSON);
    cJSON_Delete(ImagesAPIlocalVarJSON);
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
ImagesAPI_createImageEdit(apiClient_t *apiClient, binary_t* image, char *prompt, binary_t* mask, create_image_edit_request_model_t *model, int *n, openai_api_createImageEdit_size_e size, openai_api_createImageEdit_response_format_e response_format, char *user)
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
    char *keyForm_model = NULL;
    create_image_edit_request_model_t * valueForm_model = 0;
    keyValuePair_t *keyPairForm_model = 0;
    if (model != NULL)
    {
        keyForm_model = strdup("model");
        valueForm_model = (model);
        keyPairForm_model = keyValuePair_create(keyForm_model,&valueForm_model);
        list_addElement(localVarFormParameters,keyPairForm_model);
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
    cJSON *ImagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    images_response_t *elementToReturn = images_response_parseFromJSON(ImagesAPIlocalVarJSON);
    cJSON_Delete(ImagesAPIlocalVarJSON);
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
    if (keyForm_prompt) {
        free(keyForm_prompt);
        keyForm_prompt = NULL;
    }
    if (valueForm_prompt) {
        free(valueForm_prompt);
        valueForm_prompt = NULL;
    }
    free(keyPairForm_prompt);
    if (keyForm_mask) {
        free(keyForm_mask);
        keyForm_mask = NULL;
    }
//    free(fileVar_mask->data);
//    free(fileVar_mask);
    free(keyPairForm_mask);
    if (keyForm_model) {
        free(keyForm_model);
        keyForm_model = NULL;
    }
    free(keyPairForm_model);
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
ImagesAPI_createImageVariation(apiClient_t *apiClient, binary_t* image, create_image_edit_request_model_t *model, int *n, openai_api_createImageVariation_response_format_e response_format, openai_api_createImageVariation_size_e size, char *user)
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
    char *keyForm_model = NULL;
    create_image_edit_request_model_t * valueForm_model = 0;
    keyValuePair_t *keyPairForm_model = 0;
    if (model != NULL)
    {
        keyForm_model = strdup("model");
        valueForm_model = (model);
        keyPairForm_model = keyValuePair_create(keyForm_model,&valueForm_model);
        list_addElement(localVarFormParameters,keyPairForm_model);
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
    cJSON *ImagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    images_response_t *elementToReturn = images_response_parseFromJSON(ImagesAPIlocalVarJSON);
    cJSON_Delete(ImagesAPIlocalVarJSON);
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
    if (keyForm_model) {
        free(keyForm_model);
        keyForm_model = NULL;
    }
    free(keyPairForm_model);
    if (keyForm_n) {
        free(keyForm_n);
        keyForm_n = NULL;
    }
    free(keyPairForm_n);
    if (keyForm_response_format) {
        free(keyForm_response_format);
        keyForm_response_format = NULL;
    }
    if (valueForm_response_format) {
        free(valueForm_response_format);
        valueForm_response_format = NULL;
    }
    free(keyPairForm_response_format);
    if (keyForm_size) {
        free(keyForm_size);
        keyForm_size = NULL;
    }
    if (valueForm_size) {
        free(valueForm_size);
        valueForm_size = NULL;
    }
    free(keyPairForm_size);
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

