#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_conversation_item_input_audio_transcription_failed_error.h"



static realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error_create_internal(
    char *type,
    char *code,
    char *message,
    char *param
    ) {
    realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var = malloc(sizeof(realtime_server_event_conversation_item_input_audio_transcription_failed_error_t));
    if (!realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var) {
        return NULL;
    }
    realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var->type = type;
    realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var->code = code;
    realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var->message = message;
    realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var->param = param;

    realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var->_library_owned = 1;
    return realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var;
}

__attribute__((deprecated)) realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error_create(
    char *type,
    char *code,
    char *message,
    char *param
    ) {
    return realtime_server_event_conversation_item_input_audio_transcription_failed_error_create_internal (
        type,
        code,
        message,
        param
        );
}

void realtime_server_event_conversation_item_input_audio_transcription_failed_error_free(realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error) {
    if(NULL == realtime_server_event_conversation_item_input_audio_transcription_failed_error){
        return ;
    }
    if(realtime_server_event_conversation_item_input_audio_transcription_failed_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_conversation_item_input_audio_transcription_failed_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_conversation_item_input_audio_transcription_failed_error->type) {
        free(realtime_server_event_conversation_item_input_audio_transcription_failed_error->type);
        realtime_server_event_conversation_item_input_audio_transcription_failed_error->type = NULL;
    }
    if (realtime_server_event_conversation_item_input_audio_transcription_failed_error->code) {
        free(realtime_server_event_conversation_item_input_audio_transcription_failed_error->code);
        realtime_server_event_conversation_item_input_audio_transcription_failed_error->code = NULL;
    }
    if (realtime_server_event_conversation_item_input_audio_transcription_failed_error->message) {
        free(realtime_server_event_conversation_item_input_audio_transcription_failed_error->message);
        realtime_server_event_conversation_item_input_audio_transcription_failed_error->message = NULL;
    }
    if (realtime_server_event_conversation_item_input_audio_transcription_failed_error->param) {
        free(realtime_server_event_conversation_item_input_audio_transcription_failed_error->param);
        realtime_server_event_conversation_item_input_audio_transcription_failed_error->param = NULL;
    }
    free(realtime_server_event_conversation_item_input_audio_transcription_failed_error);
}

cJSON *realtime_server_event_conversation_item_input_audio_transcription_failed_error_convertToJSON(realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_conversation_item_input_audio_transcription_failed_error->type
    if(realtime_server_event_conversation_item_input_audio_transcription_failed_error->type) {
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_conversation_item_input_audio_transcription_failed_error->type) == NULL) {
    goto fail; //String
    }
    }


    // realtime_server_event_conversation_item_input_audio_transcription_failed_error->code
    if(realtime_server_event_conversation_item_input_audio_transcription_failed_error->code) {
    if(cJSON_AddStringToObject(item, "code", realtime_server_event_conversation_item_input_audio_transcription_failed_error->code) == NULL) {
    goto fail; //String
    }
    }


    // realtime_server_event_conversation_item_input_audio_transcription_failed_error->message
    if(realtime_server_event_conversation_item_input_audio_transcription_failed_error->message) {
    if(cJSON_AddStringToObject(item, "message", realtime_server_event_conversation_item_input_audio_transcription_failed_error->message) == NULL) {
    goto fail; //String
    }
    }


    // realtime_server_event_conversation_item_input_audio_transcription_failed_error->param
    if(realtime_server_event_conversation_item_input_audio_transcription_failed_error->param) {
    if(cJSON_AddStringToObject(item, "param", realtime_server_event_conversation_item_input_audio_transcription_failed_error->param) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error_parseFromJSON(cJSON *realtime_server_event_conversation_item_input_audio_transcription_failed_errorJSON){

    realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var = NULL;

    // realtime_server_event_conversation_item_input_audio_transcription_failed_error->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_failed_errorJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // realtime_server_event_conversation_item_input_audio_transcription_failed_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_failed_errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsString(code) && !cJSON_IsNull(code))
    {
    goto end; //String
    }
    }

    // realtime_server_event_conversation_item_input_audio_transcription_failed_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_failed_errorJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // realtime_server_event_conversation_item_input_audio_transcription_failed_error->param
    cJSON *param = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_failed_errorJSON, "param");
    if (cJSON_IsNull(param)) {
        param = NULL;
    }
    if (param) { 
    if(!cJSON_IsString(param) && !cJSON_IsNull(param))
    {
    goto end; //String
    }
    }


    realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var = realtime_server_event_conversation_item_input_audio_transcription_failed_error_create_internal (
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        code && !cJSON_IsNull(code) ? strdup(code->valuestring) : NULL,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        param && !cJSON_IsNull(param) ? strdup(param->valuestring) : NULL
        );

    return realtime_server_event_conversation_item_input_audio_transcription_failed_error_local_var;
end:
    return NULL;

}
