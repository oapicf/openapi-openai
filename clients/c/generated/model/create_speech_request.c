#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_speech_request.h"


char* create_speech_request_voice_ToString(openai_api_create_speech_request_VOICE_e voice) {
    char* voiceArray[] =  { "NULL", "alloy", "echo", "fable", "onyx", "nova", "shimmer" };
    return voiceArray[voice];
}

openai_api_create_speech_request_VOICE_e create_speech_request_voice_FromString(char* voice){
    int stringToReturn = 0;
    char *voiceArray[] =  { "NULL", "alloy", "echo", "fable", "onyx", "nova", "shimmer" };
    size_t sizeofArray = sizeof(voiceArray) / sizeof(voiceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(voice, voiceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_speech_request_response_format_ToString(openai_api_create_speech_request_RESPONSEFORMAT_e response_format) {
    char* response_formatArray[] =  { "NULL", "mp3", "opus", "aac", "flac", "wav", "pcm" };
    return response_formatArray[response_format];
}

openai_api_create_speech_request_RESPONSEFORMAT_e create_speech_request_response_format_FromString(char* response_format){
    int stringToReturn = 0;
    char *response_formatArray[] =  { "NULL", "mp3", "opus", "aac", "flac", "wav", "pcm" };
    size_t sizeofArray = sizeof(response_formatArray) / sizeof(response_formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(response_format, response_formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_speech_request_t *create_speech_request_create_internal(
    create_speech_request_model_t *model,
    char *input,
    openai_api_create_speech_request_VOICE_e voice,
    openai_api_create_speech_request_RESPONSEFORMAT_e response_format,
    double speed
    ) {
    create_speech_request_t *create_speech_request_local_var = malloc(sizeof(create_speech_request_t));
    if (!create_speech_request_local_var) {
        return NULL;
    }
    create_speech_request_local_var->model = model;
    create_speech_request_local_var->input = input;
    create_speech_request_local_var->voice = voice;
    create_speech_request_local_var->response_format = response_format;
    create_speech_request_local_var->speed = speed;

    create_speech_request_local_var->_library_owned = 1;
    return create_speech_request_local_var;
}

__attribute__((deprecated)) create_speech_request_t *create_speech_request_create(
    create_speech_request_model_t *model,
    char *input,
    openai_api_create_speech_request_VOICE_e voice,
    openai_api_create_speech_request_RESPONSEFORMAT_e response_format,
    double speed
    ) {
    return create_speech_request_create_internal (
        model,
        input,
        voice,
        response_format,
        speed
        );
}

void create_speech_request_free(create_speech_request_t *create_speech_request) {
    if(NULL == create_speech_request){
        return ;
    }
    if(create_speech_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_speech_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_speech_request->model) {
        create_speech_request_model_free(create_speech_request->model);
        create_speech_request->model = NULL;
    }
    if (create_speech_request->input) {
        free(create_speech_request->input);
        create_speech_request->input = NULL;
    }
    free(create_speech_request);
}

cJSON *create_speech_request_convertToJSON(create_speech_request_t *create_speech_request) {
    cJSON *item = cJSON_CreateObject();

    // create_speech_request->model
    if (!create_speech_request->model) {
        goto fail;
    }
    cJSON *model_local_JSON = create_speech_request_model_convertToJSON(create_speech_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_speech_request->input
    if (!create_speech_request->input) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "input", create_speech_request->input) == NULL) {
    goto fail; //String
    }


    // create_speech_request->voice
    if (openai_api_create_speech_request_VOICE_NULL == create_speech_request->voice) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "voice", create_speech_request_voice_ToString(create_speech_request->voice)) == NULL)
    {
    goto fail; //Enum
    }


    // create_speech_request->response_format
    if(create_speech_request->response_format != openai_api_create_speech_request_RESPONSEFORMAT_NULL) {
    if(cJSON_AddStringToObject(item, "response_format", create_speech_request_response_format_ToString(create_speech_request->response_format)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // create_speech_request->speed
    if(create_speech_request->speed) {
    if(cJSON_AddNumberToObject(item, "speed", create_speech_request->speed) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_speech_request_t *create_speech_request_parseFromJSON(cJSON *create_speech_requestJSON){

    create_speech_request_t *create_speech_request_local_var = NULL;

    // define the local variable for create_speech_request->model
    create_speech_request_model_t *model_local_nonprim = NULL;

    // create_speech_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_speech_requestJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (!model) {
        goto end;
    }

    
    model_local_nonprim = create_speech_request_model_parseFromJSON(model); //nonprimitive

    // create_speech_request->input
    cJSON *input = cJSON_GetObjectItemCaseSensitive(create_speech_requestJSON, "input");
    if (cJSON_IsNull(input)) {
        input = NULL;
    }
    if (!input) {
        goto end;
    }

    
    if(!cJSON_IsString(input))
    {
    goto end; //String
    }

    // create_speech_request->voice
    cJSON *voice = cJSON_GetObjectItemCaseSensitive(create_speech_requestJSON, "voice");
    if (cJSON_IsNull(voice)) {
        voice = NULL;
    }
    if (!voice) {
        goto end;
    }

    openai_api_create_speech_request_VOICE_e voiceVariable;
    
    if(!cJSON_IsString(voice))
    {
    goto end; //Enum
    }
    voiceVariable = create_speech_request_voice_FromString(voice->valuestring);

    // create_speech_request->response_format
    cJSON *response_format = cJSON_GetObjectItemCaseSensitive(create_speech_requestJSON, "response_format");
    if (cJSON_IsNull(response_format)) {
        response_format = NULL;
    }
    openai_api_create_speech_request_RESPONSEFORMAT_e response_formatVariable;
    if (response_format) { 
    if(!cJSON_IsString(response_format))
    {
    goto end; //Enum
    }
    response_formatVariable = create_speech_request_response_format_FromString(response_format->valuestring);
    }

    // create_speech_request->speed
    cJSON *speed = cJSON_GetObjectItemCaseSensitive(create_speech_requestJSON, "speed");
    if (cJSON_IsNull(speed)) {
        speed = NULL;
    }
    if (speed) { 
    if(!cJSON_IsNumber(speed))
    {
    goto end; //Numeric
    }
    }


    create_speech_request_local_var = create_speech_request_create_internal (
        model_local_nonprim,
        strdup(input->valuestring),
        voiceVariable,
        response_format ? response_formatVariable : openai_api_create_speech_request_RESPONSEFORMAT_NULL,
        speed ? speed->valuedouble : 0
        );

    return create_speech_request_local_var;
end:
    if (model_local_nonprim) {
        create_speech_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    return NULL;

}
