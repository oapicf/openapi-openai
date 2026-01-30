#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_conversation_created_conversation.h"



static realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation_create_internal(
    char *id,
    char *object
    ) {
    realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation_local_var = malloc(sizeof(realtime_server_event_conversation_created_conversation_t));
    if (!realtime_server_event_conversation_created_conversation_local_var) {
        return NULL;
    }
    realtime_server_event_conversation_created_conversation_local_var->id = id;
    realtime_server_event_conversation_created_conversation_local_var->object = object;

    realtime_server_event_conversation_created_conversation_local_var->_library_owned = 1;
    return realtime_server_event_conversation_created_conversation_local_var;
}

__attribute__((deprecated)) realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation_create(
    char *id,
    char *object
    ) {
    return realtime_server_event_conversation_created_conversation_create_internal (
        id,
        object
        );
}

void realtime_server_event_conversation_created_conversation_free(realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation) {
    if(NULL == realtime_server_event_conversation_created_conversation){
        return ;
    }
    if(realtime_server_event_conversation_created_conversation->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_conversation_created_conversation_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_conversation_created_conversation->id) {
        free(realtime_server_event_conversation_created_conversation->id);
        realtime_server_event_conversation_created_conversation->id = NULL;
    }
    if (realtime_server_event_conversation_created_conversation->object) {
        free(realtime_server_event_conversation_created_conversation->object);
        realtime_server_event_conversation_created_conversation->object = NULL;
    }
    free(realtime_server_event_conversation_created_conversation);
}

cJSON *realtime_server_event_conversation_created_conversation_convertToJSON(realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_conversation_created_conversation->id
    if(realtime_server_event_conversation_created_conversation->id) {
    if(cJSON_AddStringToObject(item, "id", realtime_server_event_conversation_created_conversation->id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_server_event_conversation_created_conversation->object
    if(realtime_server_event_conversation_created_conversation->object) {
    if(cJSON_AddStringToObject(item, "object", realtime_server_event_conversation_created_conversation->object) == NULL) {
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

realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation_parseFromJSON(cJSON *realtime_server_event_conversation_created_conversationJSON){

    realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation_local_var = NULL;

    // realtime_server_event_conversation_created_conversation->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_created_conversationJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // realtime_server_event_conversation_created_conversation->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_created_conversationJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (object) { 
    if(!cJSON_IsString(object) && !cJSON_IsNull(object))
    {
    goto end; //String
    }
    }


    realtime_server_event_conversation_created_conversation_local_var = realtime_server_event_conversation_created_conversation_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        object && !cJSON_IsNull(object) ? strdup(object->valuestring) : NULL
        );

    return realtime_server_event_conversation_created_conversation_local_var;
end:
    return NULL;

}
