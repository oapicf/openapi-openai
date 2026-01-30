#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_input_audio_buffer_committed.h"


char* realtime_server_event_input_audio_buffer_committed_type_ToString(openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_e type) {
    char* typeArray[] =  { "NULL", "input_audio_buffer.committed" };
    return typeArray[type];
}

openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_e realtime_server_event_input_audio_buffer_committed_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "input_audio_buffer.committed" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed_create_internal(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_e type,
    char *previous_item_id,
    char *item_id
    ) {
    realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed_local_var = malloc(sizeof(realtime_server_event_input_audio_buffer_committed_t));
    if (!realtime_server_event_input_audio_buffer_committed_local_var) {
        return NULL;
    }
    realtime_server_event_input_audio_buffer_committed_local_var->event_id = event_id;
    realtime_server_event_input_audio_buffer_committed_local_var->type = type;
    realtime_server_event_input_audio_buffer_committed_local_var->previous_item_id = previous_item_id;
    realtime_server_event_input_audio_buffer_committed_local_var->item_id = item_id;

    realtime_server_event_input_audio_buffer_committed_local_var->_library_owned = 1;
    return realtime_server_event_input_audio_buffer_committed_local_var;
}

__attribute__((deprecated)) realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed_create(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_e type,
    char *previous_item_id,
    char *item_id
    ) {
    return realtime_server_event_input_audio_buffer_committed_create_internal (
        event_id,
        type,
        previous_item_id,
        item_id
        );
}

void realtime_server_event_input_audio_buffer_committed_free(realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed) {
    if(NULL == realtime_server_event_input_audio_buffer_committed){
        return ;
    }
    if(realtime_server_event_input_audio_buffer_committed->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_input_audio_buffer_committed_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_input_audio_buffer_committed->event_id) {
        free(realtime_server_event_input_audio_buffer_committed->event_id);
        realtime_server_event_input_audio_buffer_committed->event_id = NULL;
    }
    if (realtime_server_event_input_audio_buffer_committed->previous_item_id) {
        free(realtime_server_event_input_audio_buffer_committed->previous_item_id);
        realtime_server_event_input_audio_buffer_committed->previous_item_id = NULL;
    }
    if (realtime_server_event_input_audio_buffer_committed->item_id) {
        free(realtime_server_event_input_audio_buffer_committed->item_id);
        realtime_server_event_input_audio_buffer_committed->item_id = NULL;
    }
    free(realtime_server_event_input_audio_buffer_committed);
}

cJSON *realtime_server_event_input_audio_buffer_committed_convertToJSON(realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_input_audio_buffer_committed->event_id
    if (!realtime_server_event_input_audio_buffer_committed->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_input_audio_buffer_committed->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_input_audio_buffer_committed->type
    if (openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_NULL == realtime_server_event_input_audio_buffer_committed->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_input_audio_buffer_committed_type_ToString(realtime_server_event_input_audio_buffer_committed->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_input_audio_buffer_committed->previous_item_id
    if (!realtime_server_event_input_audio_buffer_committed->previous_item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "previous_item_id", realtime_server_event_input_audio_buffer_committed->previous_item_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_input_audio_buffer_committed->item_id
    if (!realtime_server_event_input_audio_buffer_committed->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_server_event_input_audio_buffer_committed->item_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed_parseFromJSON(cJSON *realtime_server_event_input_audio_buffer_committedJSON){

    realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed_local_var = NULL;

    // realtime_server_event_input_audio_buffer_committed->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_committedJSON, "event_id");
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

    // realtime_server_event_input_audio_buffer_committed->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_committedJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_input_audio_buffer_committed_type_FromString(type->valuestring);

    // realtime_server_event_input_audio_buffer_committed->previous_item_id
    cJSON *previous_item_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_committedJSON, "previous_item_id");
    if (cJSON_IsNull(previous_item_id)) {
        previous_item_id = NULL;
    }
    if (!previous_item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(previous_item_id))
    {
    goto end; //String
    }

    // realtime_server_event_input_audio_buffer_committed->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_input_audio_buffer_committedJSON, "item_id");
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


    realtime_server_event_input_audio_buffer_committed_local_var = realtime_server_event_input_audio_buffer_committed_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        strdup(previous_item_id->valuestring),
        strdup(item_id->valuestring)
        );

    return realtime_server_event_input_audio_buffer_committed_local_var;
end:
    return NULL;

}
