#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_input_audio_buffer_speech_started.h"


char* realtime_server_event_input_audio_buffer_speech_started_type_ToString(openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_e type) {
    char* typeArray[] =  { "NULL", "input_audio_buffer.speech_started" };
    return typeArray[type];
}

openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_e realtime_server_event_input_audio_buffer_speech_started_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "input_audio_buffer.speech_started" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started_create_internal(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_e type,
    int audio_start_ms,
    char *item_id
    ) {
    realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started_local_var = malloc(sizeof(realtime_server_event_input_audio_buffer_speech_started_t));
    if (!realtime_server_event_input_audio_buffer_speech_started_local_var) {
        return NULL;
    }
    realtime_server_event_input_audio_buffer_speech_started_local_var->event_id = event_id;
    realtime_server_event_input_audio_buffer_speech_started_local_var->type = type;
    realtime_server_event_input_audio_buffer_speech_started_local_var->audio_start_ms = audio_start_ms;
    realtime_server_event_input_audio_buffer_speech_started_local_var->item_id = item_id;

    realtime_server_event_input_audio_buffer_speech_started_local_var->_library_owned = 1;
    return realtime_server_event_input_audio_buffer_speech_started_local_var;
}

__attribute__((deprecated)) realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started_create(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_e type,
    int audio_start_ms,
    char *item_id
    ) {
    return realtime_server_event_input_audio_buffer_speech_started_create_internal (
        event_id,
        type,
        audio_start_ms,
        item_id
        );
}

void realtime_server_event_input_audio_buffer_speech_started_free(realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started) {
    if(NULL == realtime_server_event_input_audio_buffer_speech_started){
        return ;
    }
    if(realtime_server_event_input_audio_buffer_speech_started->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_input_audio_buffer_speech_started_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_input_audio_buffer_speech_started->event_id) {
        free(realtime_server_event_input_audio_buffer_speech_started->event_id);
        realtime_server_event_input_audio_buffer_speech_started->event_id = NULL;
    }
    if (realtime_server_event_input_audio_buffer_speech_started->item_id) {
        free(realtime_server_event_input_audio_buffer_speech_started->item_id);
        realtime_server_event_input_audio_buffer_speech_started->item_id = NULL;
    }
    free(realtime_server_event_input_audio_buffer_speech_started);
}

cJSON *realtime_server_event_input_audio_buffer_speech_started_convertToJSON(realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_input_audio_buffer_speech_started->event_id
    if (!realtime_server_event_input_audio_buffer_speech_started->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_input_audio_buffer_speech_started->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_input_audio_buffer_speech_started->type
    if (openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_NULL == realtime_server_event_input_audio_buffer_speech_started->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_input_audio_buffer_speech_started_type_ToString(realtime_server_event_input_audio_buffer_speech_started->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_input_audio_buffer_speech_started->audio_start_ms
    if (!realtime_server_event_input_audio_buffer_speech_started->audio_start_ms) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "audio_start_ms", realtime_server_event_input_audio_buffer_speech_started->audio_start_ms) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_input_audio_buffer_speech_started->item_id
    if (!realtime_server_event_input_audio_buffer_speech_started->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_server_event_input_audio_buffer_speech_started->item_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started_parseFromJSON(cJSON *realtime_server_event_input_audio_buffer_speech_startedJSON){

    realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started_local_var = NULL;

    // realtime_server_event_input_audio_buffer_speech_started->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_speech_startedJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (!event_id) {
        goto end;
    }

    
    if(!cJSON_IsString(event_id))
    {
    goto end; //String
    }

    // realtime_server_event_input_audio_buffer_speech_started->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_speech_startedJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_input_audio_buffer_speech_started_type_FromString(type->valuestring);

    // realtime_server_event_input_audio_buffer_speech_started->audio_start_ms
    cJSON *audio_start_ms = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_speech_startedJSON, "audio_start_ms");
    if (cJSON_IsNull(audio_start_ms)) {
        audio_start_ms = NULL;
    }
    if (!audio_start_ms) {
        goto end;
    }

    
    if(!cJSON_IsNumber(audio_start_ms))
    {
    goto end; //Numeric
    }

    // realtime_server_event_input_audio_buffer_speech_started->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_speech_startedJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }


    realtime_server_event_input_audio_buffer_speech_started_local_var = realtime_server_event_input_audio_buffer_speech_started_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        audio_start_ms->valuedouble,
        strdup(item_id->valuestring)
        );

    return realtime_server_event_input_audio_buffer_speech_started_local_var;
end:
    return NULL;

}
