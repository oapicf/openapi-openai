#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_client_event_input_audio_buffer_append.h"


char* realtime_client_event_input_audio_buffer_append_type_ToString(openai_api_realtime_client_event_input_audio_buffer_append_TYPE_e type) {
    char* typeArray[] =  { "NULL", "input_audio_buffer.append" };
    return typeArray[type];
}

openai_api_realtime_client_event_input_audio_buffer_append_TYPE_e realtime_client_event_input_audio_buffer_append_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "input_audio_buffer.append" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append_create_internal(
    char *event_id,
    openai_api_realtime_client_event_input_audio_buffer_append_TYPE_e type,
    char *audio
    ) {
    realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append_local_var = malloc(sizeof(realtime_client_event_input_audio_buffer_append_t));
    if (!realtime_client_event_input_audio_buffer_append_local_var) {
        return NULL;
    }
    realtime_client_event_input_audio_buffer_append_local_var->event_id = event_id;
    realtime_client_event_input_audio_buffer_append_local_var->type = type;
    realtime_client_event_input_audio_buffer_append_local_var->audio = audio;

    realtime_client_event_input_audio_buffer_append_local_var->_library_owned = 1;
    return realtime_client_event_input_audio_buffer_append_local_var;
}

__attribute__((deprecated)) realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append_create(
    char *event_id,
    openai_api_realtime_client_event_input_audio_buffer_append_TYPE_e type,
    char *audio
    ) {
    return realtime_client_event_input_audio_buffer_append_create_internal (
        event_id,
        type,
        audio
        );
}

void realtime_client_event_input_audio_buffer_append_free(realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append) {
    if(NULL == realtime_client_event_input_audio_buffer_append){
        return ;
    }
    if(realtime_client_event_input_audio_buffer_append->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_client_event_input_audio_buffer_append_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_client_event_input_audio_buffer_append->event_id) {
        free(realtime_client_event_input_audio_buffer_append->event_id);
        realtime_client_event_input_audio_buffer_append->event_id = NULL;
    }
    if (realtime_client_event_input_audio_buffer_append->audio) {
        free(realtime_client_event_input_audio_buffer_append->audio);
        realtime_client_event_input_audio_buffer_append->audio = NULL;
    }
    free(realtime_client_event_input_audio_buffer_append);
}

cJSON *realtime_client_event_input_audio_buffer_append_convertToJSON(realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append) {
    cJSON *item = cJSON_CreateObject();

    // realtime_client_event_input_audio_buffer_append->event_id
    if(realtime_client_event_input_audio_buffer_append->event_id) {
    if(cJSON_AddStringToObject(item, "event_id", realtime_client_event_input_audio_buffer_append->event_id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_client_event_input_audio_buffer_append->type
    if (openai_api_realtime_client_event_input_audio_buffer_append_TYPE_NULL == realtime_client_event_input_audio_buffer_append->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_client_event_input_audio_buffer_append_type_ToString(realtime_client_event_input_audio_buffer_append->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_client_event_input_audio_buffer_append->audio
    if (!realtime_client_event_input_audio_buffer_append->audio) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "audio", realtime_client_event_input_audio_buffer_append->audio) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append_parseFromJSON(cJSON *realtime_client_event_input_audio_buffer_appendJSON){

    realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append_local_var = NULL;

    // realtime_client_event_input_audio_buffer_append->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_input_audio_buffer_appendJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (event_id) { 
    if(!cJSON_IsString(event_id) && !cJSON_IsNull(event_id))
    {
    goto end; //String
    }
    }

    // realtime_client_event_input_audio_buffer_append->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_client_event_input_audio_buffer_appendJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_client_event_input_audio_buffer_append_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_client_event_input_audio_buffer_append_type_FromString(type->valuestring);

    // realtime_client_event_input_audio_buffer_append->audio
    cJSON *audio = cJSON_GetObjectItemCaseSensitive(realtime_client_event_input_audio_buffer_appendJSON, "audio");
    if (cJSON_IsNull(audio)) {
        audio = NULL;
    }
    if (!audio) {
        goto end;
    }

    
    if(!cJSON_IsString(audio))
    {
    goto end; //String
    }


    realtime_client_event_input_audio_buffer_append_local_var = realtime_client_event_input_audio_buffer_append_create_internal (
        event_id && !cJSON_IsNull(event_id) ? strdup(event_id->valuestring) : NULL,
        typeVariable,
        strdup(audio->valuestring)
        );

    return realtime_client_event_input_audio_buffer_append_local_var;
end:
    return NULL;

}
