#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_input_audio_buffer_cleared.h"


char* realtime_server_event_input_audio_buffer_cleared_type_ToString(openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_e type) {
    char* typeArray[] =  { "NULL", "input_audio_buffer.cleared" };
    return typeArray[type];
}

openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_e realtime_server_event_input_audio_buffer_cleared_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "input_audio_buffer.cleared" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared_create_internal(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_e type
    ) {
    realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared_local_var = malloc(sizeof(realtime_server_event_input_audio_buffer_cleared_t));
    if (!realtime_server_event_input_audio_buffer_cleared_local_var) {
        return NULL;
    }
    realtime_server_event_input_audio_buffer_cleared_local_var->event_id = event_id;
    realtime_server_event_input_audio_buffer_cleared_local_var->type = type;

    realtime_server_event_input_audio_buffer_cleared_local_var->_library_owned = 1;
    return realtime_server_event_input_audio_buffer_cleared_local_var;
}

__attribute__((deprecated)) realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared_create(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_e type
    ) {
    return realtime_server_event_input_audio_buffer_cleared_create_internal (
        event_id,
        type
        );
}

void realtime_server_event_input_audio_buffer_cleared_free(realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared) {
    if(NULL == realtime_server_event_input_audio_buffer_cleared){
        return ;
    }
    if(realtime_server_event_input_audio_buffer_cleared->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_input_audio_buffer_cleared_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_input_audio_buffer_cleared->event_id) {
        free(realtime_server_event_input_audio_buffer_cleared->event_id);
        realtime_server_event_input_audio_buffer_cleared->event_id = NULL;
    }
    free(realtime_server_event_input_audio_buffer_cleared);
}

cJSON *realtime_server_event_input_audio_buffer_cleared_convertToJSON(realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_input_audio_buffer_cleared->event_id
    if (!realtime_server_event_input_audio_buffer_cleared->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_input_audio_buffer_cleared->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_input_audio_buffer_cleared->type
    if (openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_NULL == realtime_server_event_input_audio_buffer_cleared->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_input_audio_buffer_cleared_type_ToString(realtime_server_event_input_audio_buffer_cleared->type)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared_parseFromJSON(cJSON *realtime_server_event_input_audio_buffer_clearedJSON){

    realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared_local_var = NULL;

    // realtime_server_event_input_audio_buffer_cleared->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_clearedJSON, "event_id");
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

    // realtime_server_event_input_audio_buffer_cleared->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_clearedJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_input_audio_buffer_cleared_type_FromString(type->valuestring);


    realtime_server_event_input_audio_buffer_cleared_local_var = realtime_server_event_input_audio_buffer_cleared_create_internal (
        strdup(event_id->valuestring),
        typeVariable
        );

    return realtime_server_event_input_audio_buffer_cleared_local_var;
end:
    return NULL;

}
