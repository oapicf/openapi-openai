#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_client_event_conversation_item_truncate.h"


char* realtime_client_event_conversation_item_truncate_type_ToString(openai_api_realtime_client_event_conversation_item_truncate_TYPE_e type) {
    char* typeArray[] =  { "NULL", "conversation.item.truncate" };
    return typeArray[type];
}

openai_api_realtime_client_event_conversation_item_truncate_TYPE_e realtime_client_event_conversation_item_truncate_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "conversation.item.truncate" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate_create_internal(
    char *event_id,
    openai_api_realtime_client_event_conversation_item_truncate_TYPE_e type,
    char *item_id,
    int content_index,
    int audio_end_ms
    ) {
    realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate_local_var = malloc(sizeof(realtime_client_event_conversation_item_truncate_t));
    if (!realtime_client_event_conversation_item_truncate_local_var) {
        return NULL;
    }
    realtime_client_event_conversation_item_truncate_local_var->event_id = event_id;
    realtime_client_event_conversation_item_truncate_local_var->type = type;
    realtime_client_event_conversation_item_truncate_local_var->item_id = item_id;
    realtime_client_event_conversation_item_truncate_local_var->content_index = content_index;
    realtime_client_event_conversation_item_truncate_local_var->audio_end_ms = audio_end_ms;

    realtime_client_event_conversation_item_truncate_local_var->_library_owned = 1;
    return realtime_client_event_conversation_item_truncate_local_var;
}

__attribute__((deprecated)) realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate_create(
    char *event_id,
    openai_api_realtime_client_event_conversation_item_truncate_TYPE_e type,
    char *item_id,
    int content_index,
    int audio_end_ms
    ) {
    return realtime_client_event_conversation_item_truncate_create_internal (
        event_id,
        type,
        item_id,
        content_index,
        audio_end_ms
        );
}

void realtime_client_event_conversation_item_truncate_free(realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate) {
    if(NULL == realtime_client_event_conversation_item_truncate){
        return ;
    }
    if(realtime_client_event_conversation_item_truncate->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_client_event_conversation_item_truncate_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_client_event_conversation_item_truncate->event_id) {
        free(realtime_client_event_conversation_item_truncate->event_id);
        realtime_client_event_conversation_item_truncate->event_id = NULL;
    }
    if (realtime_client_event_conversation_item_truncate->item_id) {
        free(realtime_client_event_conversation_item_truncate->item_id);
        realtime_client_event_conversation_item_truncate->item_id = NULL;
    }
    free(realtime_client_event_conversation_item_truncate);
}

cJSON *realtime_client_event_conversation_item_truncate_convertToJSON(realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate) {
    cJSON *item = cJSON_CreateObject();

    // realtime_client_event_conversation_item_truncate->event_id
    if(realtime_client_event_conversation_item_truncate->event_id) {
    if(cJSON_AddStringToObject(item, "event_id", realtime_client_event_conversation_item_truncate->event_id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_client_event_conversation_item_truncate->type
    if (openai_api_realtime_client_event_conversation_item_truncate_TYPE_NULL == realtime_client_event_conversation_item_truncate->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_client_event_conversation_item_truncate_type_ToString(realtime_client_event_conversation_item_truncate->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_client_event_conversation_item_truncate->item_id
    if (!realtime_client_event_conversation_item_truncate->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_client_event_conversation_item_truncate->item_id) == NULL) {
    goto fail; //String
    }


    // realtime_client_event_conversation_item_truncate->content_index
    if (!realtime_client_event_conversation_item_truncate->content_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "content_index", realtime_client_event_conversation_item_truncate->content_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_client_event_conversation_item_truncate->audio_end_ms
    if (!realtime_client_event_conversation_item_truncate->audio_end_ms) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "audio_end_ms", realtime_client_event_conversation_item_truncate->audio_end_ms) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate_parseFromJSON(cJSON *realtime_client_event_conversation_item_truncateJSON){

    realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate_local_var = NULL;

    // realtime_client_event_conversation_item_truncate->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_truncateJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (event_id) { 
    if(!cJSON_IsString(event_id) && !cJSON_IsNull(event_id))
    {
    goto end; //String
    }
    }

    // realtime_client_event_conversation_item_truncate->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_truncateJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_client_event_conversation_item_truncate_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_client_event_conversation_item_truncate_type_FromString(type->valuestring);

    // realtime_client_event_conversation_item_truncate->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_truncateJSON, "item_id");
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

    // realtime_client_event_conversation_item_truncate->content_index
    cJSON *content_index = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_truncateJSON, "content_index");
    if (cJSON_IsNull(content_index)) {
        content_index = NULL;
    }
    if (!content_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(content_index))
    {
    goto end; //Numeric
    }

    // realtime_client_event_conversation_item_truncate->audio_end_ms
    cJSON *audio_end_ms = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_truncateJSON, "audio_end_ms");
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


    realtime_client_event_conversation_item_truncate_local_var = realtime_client_event_conversation_item_truncate_create_internal (
        event_id && !cJSON_IsNull(event_id) ? strdup(event_id->valuestring) : NULL,
        typeVariable,
        strdup(item_id->valuestring),
        content_index->valuedouble,
        audio_end_ms->valuedouble
        );

    return realtime_client_event_conversation_item_truncate_local_var;
end:
    return NULL;

}
