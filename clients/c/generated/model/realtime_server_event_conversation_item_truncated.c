#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_conversation_item_truncated.h"


char* realtime_server_event_conversation_item_truncated_type_ToString(openai_api_realtime_server_event_conversation_item_truncated_TYPE_e type) {
    char* typeArray[] =  { "NULL", "conversation.item.truncated" };
    return typeArray[type];
}

openai_api_realtime_server_event_conversation_item_truncated_TYPE_e realtime_server_event_conversation_item_truncated_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "conversation.item.truncated" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated_create_internal(
    char *event_id,
    openai_api_realtime_server_event_conversation_item_truncated_TYPE_e type,
    char *item_id,
    int content_index,
    int audio_end_ms
    ) {
    realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated_local_var = malloc(sizeof(realtime_server_event_conversation_item_truncated_t));
    if (!realtime_server_event_conversation_item_truncated_local_var) {
        return NULL;
    }
    realtime_server_event_conversation_item_truncated_local_var->event_id = event_id;
    realtime_server_event_conversation_item_truncated_local_var->type = type;
    realtime_server_event_conversation_item_truncated_local_var->item_id = item_id;
    realtime_server_event_conversation_item_truncated_local_var->content_index = content_index;
    realtime_server_event_conversation_item_truncated_local_var->audio_end_ms = audio_end_ms;

    realtime_server_event_conversation_item_truncated_local_var->_library_owned = 1;
    return realtime_server_event_conversation_item_truncated_local_var;
}

__attribute__((deprecated)) realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated_create(
    char *event_id,
    openai_api_realtime_server_event_conversation_item_truncated_TYPE_e type,
    char *item_id,
    int content_index,
    int audio_end_ms
    ) {
    return realtime_server_event_conversation_item_truncated_create_internal (
        event_id,
        type,
        item_id,
        content_index,
        audio_end_ms
        );
}

void realtime_server_event_conversation_item_truncated_free(realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated) {
    if(NULL == realtime_server_event_conversation_item_truncated){
        return ;
    }
    if(realtime_server_event_conversation_item_truncated->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_conversation_item_truncated_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_conversation_item_truncated->event_id) {
        free(realtime_server_event_conversation_item_truncated->event_id);
        realtime_server_event_conversation_item_truncated->event_id = NULL;
    }
    if (realtime_server_event_conversation_item_truncated->item_id) {
        free(realtime_server_event_conversation_item_truncated->item_id);
        realtime_server_event_conversation_item_truncated->item_id = NULL;
    }
    free(realtime_server_event_conversation_item_truncated);
}

cJSON *realtime_server_event_conversation_item_truncated_convertToJSON(realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_conversation_item_truncated->event_id
    if (!realtime_server_event_conversation_item_truncated->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_conversation_item_truncated->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_conversation_item_truncated->type
    if (openai_api_realtime_server_event_conversation_item_truncated_TYPE_NULL == realtime_server_event_conversation_item_truncated->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_conversation_item_truncated_type_ToString(realtime_server_event_conversation_item_truncated->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_conversation_item_truncated->item_id
    if (!realtime_server_event_conversation_item_truncated->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_server_event_conversation_item_truncated->item_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_conversation_item_truncated->content_index
    if (!realtime_server_event_conversation_item_truncated->content_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "content_index", realtime_server_event_conversation_item_truncated->content_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_conversation_item_truncated->audio_end_ms
    if (!realtime_server_event_conversation_item_truncated->audio_end_ms) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "audio_end_ms", realtime_server_event_conversation_item_truncated->audio_end_ms) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated_parseFromJSON(cJSON *realtime_server_event_conversation_item_truncatedJSON){

    realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated_local_var = NULL;

    // realtime_server_event_conversation_item_truncated->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_truncatedJSON, "event_id");
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

    // realtime_server_event_conversation_item_truncated->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_truncatedJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_conversation_item_truncated_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_conversation_item_truncated_type_FromString(type->valuestring);

    // realtime_server_event_conversation_item_truncated->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_truncatedJSON, "item_id");
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

    // realtime_server_event_conversation_item_truncated->content_index
    cJSON *content_index = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_truncatedJSON, "content_index");
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

    // realtime_server_event_conversation_item_truncated->audio_end_ms
    cJSON *audio_end_ms = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_truncatedJSON, "audio_end_ms");
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


    realtime_server_event_conversation_item_truncated_local_var = realtime_server_event_conversation_item_truncated_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        strdup(item_id->valuestring),
        content_index->valuedouble,
        audio_end_ms->valuedouble
        );

    return realtime_server_event_conversation_item_truncated_local_var;
end:
    return NULL;

}
