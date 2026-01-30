#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_input_audio_buffer_speech_stopped.h"


char* realtime_server_event_input_audio_buffer_speech_stopped_type_ToString(openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e type) {
    char* typeArray[] =  { "NULL", "input_audio_buffer.speech_stopped" };
    return typeArray[type];
}

openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e realtime_server_event_input_audio_buffer_speech_stopped_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "input_audio_buffer.speech_stopped" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped_create_internal(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e type,
    int audio_end_ms,
    char *item_id
    ) {
    realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped_local_var = malloc(sizeof(realtime_server_event_input_audio_buffer_speech_stopped_t));
    if (!realtime_server_event_input_audio_buffer_speech_stopped_local_var) {
        return NULL;
    }
    realtime_server_event_input_audio_buffer_speech_stopped_local_var->event_id = event_id;
    realtime_server_event_input_audio_buffer_speech_stopped_local_var->type = type;
    realtime_server_event_input_audio_buffer_speech_stopped_local_var->audio_end_ms = audio_end_ms;
    realtime_server_event_input_audio_buffer_speech_stopped_local_var->item_id = item_id;

    realtime_server_event_input_audio_buffer_speech_stopped_local_var->_library_owned = 1;
    return realtime_server_event_input_audio_buffer_speech_stopped_local_var;
}

__attribute__((deprecated)) realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped_create(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e type,
    int audio_end_ms,
    char *item_id
    ) {
    return realtime_server_event_input_audio_buffer_speech_stopped_create_internal (
        event_id,
        type,
        audio_end_ms,
        item_id
        );
}

void realtime_server_event_input_audio_buffer_speech_stopped_free(realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped) {
    if(NULL == realtime_server_event_input_audio_buffer_speech_stopped){
        return ;
    }
    if(realtime_server_event_input_audio_buffer_speech_stopped->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_input_audio_buffer_speech_stopped_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_input_audio_buffer_speech_stopped->event_id) {
        free(realtime_server_event_input_audio_buffer_speech_stopped->event_id);
        realtime_server_event_input_audio_buffer_speech_stopped->event_id = NULL;
    }
    if (realtime_server_event_input_audio_buffer_speech_stopped->item_id) {
        free(realtime_server_event_input_audio_buffer_speech_stopped->item_id);
        realtime_server_event_input_audio_buffer_speech_stopped->item_id = NULL;
    }
    free(realtime_server_event_input_audio_buffer_speech_stopped);
}

cJSON *realtime_server_event_input_audio_buffer_speech_stopped_convertToJSON(realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_input_audio_buffer_speech_stopped->event_id
    if (!realtime_server_event_input_audio_buffer_speech_stopped->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_input_audio_buffer_speech_stopped->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_input_audio_buffer_speech_stopped->type
    if (openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_NULL == realtime_server_event_input_audio_buffer_speech_stopped->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_input_audio_buffer_speech_stopped_type_ToString(realtime_server_event_input_audio_buffer_speech_stopped->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_input_audio_buffer_speech_stopped->audio_end_ms
    if (!realtime_server_event_input_audio_buffer_speech_stopped->audio_end_ms) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "audio_end_ms", realtime_server_event_input_audio_buffer_speech_stopped->audio_end_ms) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_input_audio_buffer_speech_stopped->item_id
    if (!realtime_server_event_input_audio_buffer_speech_stopped->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_server_event_input_audio_buffer_speech_stopped->item_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped_parseFromJSON(cJSON *realtime_server_event_input_audio_buffer_speech_stoppedJSON){

    realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped_local_var = NULL;

    // realtime_server_event_input_audio_buffer_speech_stopped->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_speech_stoppedJSON, "event_id");
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

    // realtime_server_event_input_audio_buffer_speech_stopped->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_speech_stoppedJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_input_audio_buffer_speech_stopped_type_FromString(type->valuestring);

    // realtime_server_event_input_audio_buffer_speech_stopped->audio_end_ms
    cJSON *audio_end_ms = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_speech_stoppedJSON, "audio_end_ms");
    if (cJSON_IsNull(audio_end_ms)) {
        audio_end_ms = NULL;
    }
    if (!audio_end_ms) {
        goto end;
    }

    
    if(!cJSON_IsNumber(audio_end_ms))
    {
    goto end; //Numeric
    }

    // realtime_server_event_input_audio_buffer_speech_stopped->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_speech_stoppedJSON, "item_id");
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


    realtime_server_event_input_audio_buffer_speech_stopped_local_var = realtime_server_event_input_audio_buffer_speech_stopped_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        audio_end_ms->valuedouble,
        strdup(item_id->valuestring)
        );

    return realtime_server_event_input_audio_buffer_speech_stopped_local_var;
end:
    return NULL;

}
