#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_conversation_item_input_audio_transcription_completed.h"


char* realtime_server_event_conversation_item_input_audio_transcription_completed_type_ToString(openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_e type) {
    char* typeArray[] =  { "NULL", "conversation.item.input_audio_transcription.completed" };
    return typeArray[type];
}

openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_e realtime_server_event_conversation_item_input_audio_transcription_completed_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "conversation.item.input_audio_transcription.completed" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed_create_internal(
    char *event_id,
    openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_e type,
    char *item_id,
    int content_index,
    char *transcript
    ) {
    realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed_local_var = malloc(sizeof(realtime_server_event_conversation_item_input_audio_transcription_completed_t));
    if (!realtime_server_event_conversation_item_input_audio_transcription_completed_local_var) {
        return NULL;
    }
    realtime_server_event_conversation_item_input_audio_transcription_completed_local_var->event_id = event_id;
    realtime_server_event_conversation_item_input_audio_transcription_completed_local_var->type = type;
    realtime_server_event_conversation_item_input_audio_transcription_completed_local_var->item_id = item_id;
    realtime_server_event_conversation_item_input_audio_transcription_completed_local_var->content_index = content_index;
    realtime_server_event_conversation_item_input_audio_transcription_completed_local_var->transcript = transcript;

    realtime_server_event_conversation_item_input_audio_transcription_completed_local_var->_library_owned = 1;
    return realtime_server_event_conversation_item_input_audio_transcription_completed_local_var;
}

__attribute__((deprecated)) realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed_create(
    char *event_id,
    openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_e type,
    char *item_id,
    int content_index,
    char *transcript
    ) {
    return realtime_server_event_conversation_item_input_audio_transcription_completed_create_internal (
        event_id,
        type,
        item_id,
        content_index,
        transcript
        );
}

void realtime_server_event_conversation_item_input_audio_transcription_completed_free(realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed) {
    if(NULL == realtime_server_event_conversation_item_input_audio_transcription_completed){
        return ;
    }
    if(realtime_server_event_conversation_item_input_audio_transcription_completed->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_conversation_item_input_audio_transcription_completed_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_conversation_item_input_audio_transcription_completed->event_id) {
        free(realtime_server_event_conversation_item_input_audio_transcription_completed->event_id);
        realtime_server_event_conversation_item_input_audio_transcription_completed->event_id = NULL;
    }
    if (realtime_server_event_conversation_item_input_audio_transcription_completed->item_id) {
        free(realtime_server_event_conversation_item_input_audio_transcription_completed->item_id);
        realtime_server_event_conversation_item_input_audio_transcription_completed->item_id = NULL;
    }
    if (realtime_server_event_conversation_item_input_audio_transcription_completed->transcript) {
        free(realtime_server_event_conversation_item_input_audio_transcription_completed->transcript);
        realtime_server_event_conversation_item_input_audio_transcription_completed->transcript = NULL;
    }
    free(realtime_server_event_conversation_item_input_audio_transcription_completed);
}

cJSON *realtime_server_event_conversation_item_input_audio_transcription_completed_convertToJSON(realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_conversation_item_input_audio_transcription_completed->event_id
    if (!realtime_server_event_conversation_item_input_audio_transcription_completed->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_conversation_item_input_audio_transcription_completed->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_conversation_item_input_audio_transcription_completed->type
    if (openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_NULL == realtime_server_event_conversation_item_input_audio_transcription_completed->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_conversation_item_input_audio_transcription_completed_type_ToString(realtime_server_event_conversation_item_input_audio_transcription_completed->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_conversation_item_input_audio_transcription_completed->item_id
    if (!realtime_server_event_conversation_item_input_audio_transcription_completed->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_server_event_conversation_item_input_audio_transcription_completed->item_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_conversation_item_input_audio_transcription_completed->content_index
    if (!realtime_server_event_conversation_item_input_audio_transcription_completed->content_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "content_index", realtime_server_event_conversation_item_input_audio_transcription_completed->content_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_conversation_item_input_audio_transcription_completed->transcript
    if (!realtime_server_event_conversation_item_input_audio_transcription_completed->transcript) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "transcript", realtime_server_event_conversation_item_input_audio_transcription_completed->transcript) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed_parseFromJSON(cJSON *realtime_server_event_conversation_item_input_audio_transcription_completedJSON){

    realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed_local_var = NULL;

    // realtime_server_event_conversation_item_input_audio_transcription_completed->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_completedJSON, "event_id");
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

    // realtime_server_event_conversation_item_input_audio_transcription_completed->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_completedJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_conversation_item_input_audio_transcription_completed_type_FromString(type->valuestring);

    // realtime_server_event_conversation_item_input_audio_transcription_completed->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_completedJSON, "item_id");
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

    // realtime_server_event_conversation_item_input_audio_transcription_completed->content_index
    cJSON *content_index = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_completedJSON, "content_index");
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

    // realtime_server_event_conversation_item_input_audio_transcription_completed->transcript
    cJSON *transcript = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_completedJSON, "transcript");
    if (cJSON_IsNull(transcript)) {
        transcript = NULL;
    }
    if (!transcript) {
        goto end;
    }

    
    if(!cJSON_IsString(transcript))
    {
    goto end; //String
    }


    realtime_server_event_conversation_item_input_audio_transcription_completed_local_var = realtime_server_event_conversation_item_input_audio_transcription_completed_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        strdup(item_id->valuestring),
        content_index->valuedouble,
        strdup(transcript->valuestring)
        );

    return realtime_server_event_conversation_item_input_audio_transcription_completed_local_var;
end:
    return NULL;

}
