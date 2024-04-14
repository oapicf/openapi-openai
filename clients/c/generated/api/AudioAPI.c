#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "AudioAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum RESPONSEFORMAT for AudioAPI_createTranscription

static char* createTranscription_RESPONSEFORMAT_ToString(openai_api_createTranscription_response_format_e RESPONSEFORMAT){
    char *RESPONSEFORMATArray[] =  { "NULL", "json", "text", "srt", "verbose_json", "vtt" };
    return RESPONSEFORMATArray[RESPONSEFORMAT];
}

static openai_api_createTranscription_response_format_e createTranscription_RESPONSEFORMAT_FromString(char* RESPONSEFORMAT){
    int stringToReturn = 0;
    char *RESPONSEFORMATArray[] =  { "NULL", "json", "text", "srt", "verbose_json", "vtt" };
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
// Function createTranscription_RESPONSEFORMAT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *createTranscription_RESPONSEFORMAT_convertToJSON(openai_api_createTranscription_response_format_e RESPONSEFORMAT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "response_format", createTranscription_RESPONSEFORMAT_ToString(RESPONSEFORMAT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function createTranscription_RESPONSEFORMAT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_createTranscription_response_format_e createTranscription_RESPONSEFORMAT_parseFromJSON(cJSON* RESPONSEFORMATJSON) {
    openai_api_createTranscription_response_format_e RESPONSEFORMATVariable = 0;
    cJSON *RESPONSEFORMATVar = cJSON_GetObjectItemCaseSensitive(RESPONSEFORMATJSON, "response_format");
    if(!cJSON_IsString(RESPONSEFORMATVar) || (RESPONSEFORMATVar->valuestring == NULL))
    {
        goto end;
    }
    RESPONSEFORMATVariable = createTranscription_RESPONSEFORMAT_FromString(RESPONSEFORMATVar->valuestring);
    return RESPONSEFORMATVariable;
end:
    return 0;
}
*/

// Functions for enum TIMESTAMPGRANULARITIES for AudioAPI_createTranscription

static char* createTranscription_TIMESTAMPGRANULARITIES_ToString(openai_api_createTranscription_timestamp_granularities[]_e TIMESTAMPGRANULARITIES){
    char *TIMESTAMPGRANULARITIESArray[] =  { "NULL", "word", "segment" };
    return TIMESTAMPGRANULARITIESArray[TIMESTAMPGRANULARITIES];
}

static openai_api_createTranscription_timestamp_granularities[]_e createTranscription_TIMESTAMPGRANULARITIES_FromString(char* TIMESTAMPGRANULARITIES){
    int stringToReturn = 0;
    char *TIMESTAMPGRANULARITIESArray[] =  { "NULL", "word", "segment" };
    size_t sizeofArray = sizeof(TIMESTAMPGRANULARITIESArray) / sizeof(TIMESTAMPGRANULARITIESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(TIMESTAMPGRANULARITIES, TIMESTAMPGRANULARITIESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function createTranscription_TIMESTAMPGRANULARITIES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *createTranscription_TIMESTAMPGRANULARITIES_convertToJSON(openai_api_createTranscription_timestamp_granularities[]_e TIMESTAMPGRANULARITIES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function createTranscription_TIMESTAMPGRANULARITIES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_createTranscription_timestamp_granularities[]_e createTranscription_TIMESTAMPGRANULARITIES_parseFromJSON(cJSON* TIMESTAMPGRANULARITIESJSON) {
    openai_api_createTranscription_timestamp_granularities[]_e TIMESTAMPGRANULARITIESVariable = 0;
    return TIMESTAMPGRANULARITIESVariable;
end:
    return 0;
}
*/


// Generates audio from the input text.
//
binary_t**
AudioAPI_createSpeech(apiClient_t *apiClient, create_speech_request_t *create_speech_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/audio/speech")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/audio/speech");




    // Body Param
    cJSON *localVarSingleItemJSON_create_speech_request = NULL;
    if (create_speech_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_speech_request = create_speech_request_convertToJSON(create_speech_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_speech_request);
    }
    list_addElement(localVarHeaderType,"application/octet-stream"); //produces
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
    //primitive return type simple
    binary_t** elementToReturn =  strdup((binary_t**)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_create_speech_request) {
        cJSON_Delete(localVarSingleItemJSON_create_speech_request);
        localVarSingleItemJSON_create_speech_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Transcribes audio into the input language.
//
create_transcription_200_response_t*
AudioAPI_createTranscription(apiClient_t *apiClient, binary_t* file, create_transcription_request_model_t *model, char *language, char *prompt, openai_api_createTranscription_response_format_e response_format, double temperature, list_t *timestamp_granularities[])
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
    openai_api_createTranscription_response_format_e valueForm_response_format = 0;
    keyValuePair_t *keyPairForm_response_format = 0;
    if (response_format != NULL)
    {
        keyForm_response_format = strdup("response_format");
        valueForm_response_format = (response_format);
        keyPairForm_response_format = keyValuePair_create(keyForm_response_format,(void *)valueForm_response_format);
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
    char *keyForm_timestamp_granularities[] = NULL;
    list_e valueForm_timestamp_granularities[] = 0;
    keyValuePair_t *keyPairForm_timestamp_granularities[] = 0;
    if (timestamp_granularities[] != NULL)
    {
        keyForm_timestamp_granularities[] = strdup("timestamp_granularities[]");
        valueForm_timestamp_granularities[] = (timestamp_granularities[]);
        keyPairForm_timestamp_granularities[] = keyValuePair_create(keyForm_timestamp_granularities[],&valueForm_timestamp_granularities[]);
        list_addElement(localVarFormParameters,keyPairForm_timestamp_granularities[]);
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
    cJSON *AudioAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_transcription_200_response_t *elementToReturn = create_transcription_200_response_parseFromJSON(AudioAPIlocalVarJSON);
    cJSON_Delete(AudioAPIlocalVarJSON);
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
    if (keyForm_language) {
        free(keyForm_language);
        keyForm_language = NULL;
    }
    if (valueForm_language) {
        free(valueForm_language);
        valueForm_language = NULL;
    }
    free(keyPairForm_language);
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
    if (keyForm_timestamp_granularities[]) {
        free(keyForm_timestamp_granularities[]);
        keyForm_timestamp_granularities[] = NULL;
    }
    free(keyPairForm_timestamp_granularities[]);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Translates audio into English.
//
create_translation_200_response_t*
AudioAPI_createTranslation(apiClient_t *apiClient, binary_t* file, create_transcription_request_model_t *model, char *prompt, char *response_format, double temperature)
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
    cJSON *AudioAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_translation_200_response_t *elementToReturn = create_translation_200_response_parseFromJSON(AudioAPIlocalVarJSON);
    cJSON_Delete(AudioAPIlocalVarJSON);
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

