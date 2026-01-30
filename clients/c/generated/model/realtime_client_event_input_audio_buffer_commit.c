#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_client_event_input_audio_buffer_commit.h"


char* realtime_client_event_input_audio_buffer_commit_type_ToString(openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_e type) {
    char* typeArray[] =  { "NULL", "input_audio_buffer.commit" };
    return typeArray[type];
}

openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_e realtime_client_event_input_audio_buffer_commit_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "input_audio_buffer.commit" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit_create_internal(
    char *event_id,
    openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_e type
    ) {
    realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit_local_var = malloc(sizeof(realtime_client_event_input_audio_buffer_commit_t));
    if (!realtime_client_event_input_audio_buffer_commit_local_var) {
        return NULL;
    }
    realtime_client_event_input_audio_buffer_commit_local_var->event_id = event_id;
    realtime_client_event_input_audio_buffer_commit_local_var->type = type;

    realtime_client_event_input_audio_buffer_commit_local_var->_library_owned = 1;
    return realtime_client_event_input_audio_buffer_commit_local_var;
}

__attribute__((deprecated)) realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit_create(
    char *event_id,
    openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_e type
    ) {
    return realtime_client_event_input_audio_buffer_commit_create_internal (
        event_id,
        type
        );
}

void realtime_client_event_input_audio_buffer_commit_free(realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit) {
    if(NULL == realtime_client_event_input_audio_buffer_commit){
        return ;
    }
    if(realtime_client_event_input_audio_buffer_commit->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_client_event_input_audio_buffer_commit_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_client_event_input_audio_buffer_commit->event_id) {
        free(realtime_client_event_input_audio_buffer_commit->event_id);
        realtime_client_event_input_audio_buffer_commit->event_id = NULL;
    }
    free(realtime_client_event_input_audio_buffer_commit);
}

cJSON *realtime_client_event_input_audio_buffer_commit_convertToJSON(realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit) {
    cJSON *item = cJSON_CreateObject();

    // realtime_client_event_input_audio_buffer_commit->event_id
    if(realtime_client_event_input_audio_buffer_commit->event_id) {
    if(cJSON_AddStringToObject(item, "event_id", realtime_client_event_input_audio_buffer_commit->event_id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_client_event_input_audio_buffer_commit->type
    if (openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_NULL == realtime_client_event_input_audio_buffer_commit->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_client_event_input_audio_buffer_commit_type_ToString(realtime_client_event_input_audio_buffer_commit->type)) == NULL)
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

realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit_parseFromJSON(cJSON *realtime_client_event_input_audio_buffer_commitJSON){

    realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit_local_var = NULL;

    // realtime_client_event_input_audio_buffer_commit->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_input_audio_buffer_commitJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (event_id) { 
    if(!cJSON_IsString(event_id) && !cJSON_IsNull(event_id))
    {
    goto end; //String
    }
    }

    // realtime_client_event_input_audio_buffer_commit->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_client_event_input_audio_buffer_commitJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_client_event_input_audio_buffer_commit_type_FromString(type->valuestring);


    realtime_client_event_input_audio_buffer_commit_local_var = realtime_client_event_input_audio_buffer_commit_create_internal (
        event_id && !cJSON_IsNull(event_id) ? strdup(event_id->valuestring) : NULL,
        typeVariable
        );

    return realtime_client_event_input_audio_buffer_commit_local_var;
end:
    return NULL;

}
