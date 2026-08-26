#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_conversation_item_input_audio_transcription_failed.h"


char* realtime_server_event_conversation_item_input_audio_transcription_failed_type_ToString(openai_api_realtime_server_event_conversation_item_input_audio_transcription_failed_TYPE_e type) {
    char* typeArray[] =  { "NULL", "conversation.item.input_audio_transcription.failed" };
    return typeArray[type];
}

openai_api_realtime_server_event_conversation_item_input_audio_transcription_failed_TYPE_e realtime_server_event_conversation_item_input_audio_transcription_failed_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "conversation.item.input_audio_transcription.failed" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_conversation_item_input_audio_transcription_failed_t *realtime_server_event_conversation_item_input_audio_transcription_failed_create_internal(
    char *event_id,
    openai_api_realtime_server_event_conversation_item_input_audio_transcription_failed_TYPE_e type,
    char *item_id,
    int *content_index,
    realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *error
    ) {
    realtime_server_event_conversation_item_input_audio_transcription_failed_t *realtime_server_event_conversation_item_input_audio_transcription_failed_local_var = malloc(sizeof(realtime_server_event_conversation_item_input_audio_transcription_failed_t));
    if (!realtime_server_event_conversation_item_input_audio_transcription_failed_local_var) {
        return NULL;
    }
    memset(realtime_server_event_conversation_item_input_audio_transcription_failed_local_var, 0, sizeof(realtime_server_event_conversation_item_input_audio_transcription_failed_t));
    realtime_server_event_conversation_item_input_audio_transcription_failed_local_var->_library_owned = 1;
    realtime_server_event_conversation_item_input_audio_transcription_failed_local_var->event_id = event_id;
    realtime_server_event_conversation_item_input_audio_transcription_failed_local_var->type = type;
    realtime_server_event_conversation_item_input_audio_transcription_failed_local_var->item_id = item_id;
    realtime_server_event_conversation_item_input_audio_transcription_failed_local_var->content_index = content_index;
    realtime_server_event_conversation_item_input_audio_transcription_failed_local_var->error = error;
    return realtime_server_event_conversation_item_input_audio_transcription_failed_local_var;
}

__attribute__((deprecated)) realtime_server_event_conversation_item_input_audio_transcription_failed_t *realtime_server_event_conversation_item_input_audio_transcription_failed_create(
    char *event_id,
    openai_api_realtime_server_event_conversation_item_input_audio_transcription_failed_TYPE_e type,
    char *item_id,
    int *content_index,
    realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *error
    ) {
    int *content_index_copy = NULL;
    if (content_index) {
        content_index_copy = malloc(sizeof(int));
        if (content_index_copy) *content_index_copy = *content_index;
    }
    realtime_server_event_conversation_item_input_audio_transcription_failed_t *result = realtime_server_event_conversation_item_input_audio_transcription_failed_create_internal (
        event_id,
        type,
        item_id,
        content_index_copy,
        error
        );
    if (!result) {
        free(content_index_copy);
    }
    return result;
}

void realtime_server_event_conversation_item_input_audio_transcription_failed_free(realtime_server_event_conversation_item_input_audio_transcription_failed_t *realtime_server_event_conversation_item_input_audio_transcription_failed) {
    if(NULL == realtime_server_event_conversation_item_input_audio_transcription_failed){
        return ;
    }
    if(realtime_server_event_conversation_item_input_audio_transcription_failed->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_conversation_item_input_audio_transcription_failed_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_conversation_item_input_audio_transcription_failed->event_id) {
        free(realtime_server_event_conversation_item_input_audio_transcription_failed->event_id);
        realtime_server_event_conversation_item_input_audio_transcription_failed->event_id = NULL;
    }
    if (realtime_server_event_conversation_item_input_audio_transcription_failed->item_id) {
        free(realtime_server_event_conversation_item_input_audio_transcription_failed->item_id);
        realtime_server_event_conversation_item_input_audio_transcription_failed->item_id = NULL;
    }
    if (realtime_server_event_conversation_item_input_audio_transcription_failed->content_index) {
        free(realtime_server_event_conversation_item_input_audio_transcription_failed->content_index);
        realtime_server_event_conversation_item_input_audio_transcription_failed->content_index = NULL;
    }
    if (realtime_server_event_conversation_item_input_audio_transcription_failed->error) {
        realtime_server_event_conversation_item_input_audio_transcription_failed_error_free(realtime_server_event_conversation_item_input_audio_transcription_failed->error);
        realtime_server_event_conversation_item_input_audio_transcription_failed->error = NULL;
    }
    free(realtime_server_event_conversation_item_input_audio_transcription_failed);
}

cJSON *realtime_server_event_conversation_item_input_audio_transcription_failed_convertToJSON(realtime_server_event_conversation_item_input_audio_transcription_failed_t *realtime_server_event_conversation_item_input_audio_transcription_failed) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_conversation_item_input_audio_transcription_failed->event_id
    if (!realtime_server_event_conversation_item_input_audio_transcription_failed->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_conversation_item_input_audio_transcription_failed->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_conversation_item_input_audio_transcription_failed->type
    if (openai_api_realtime_server_event_conversation_item_input_audio_transcription_failed_TYPE_NULL == realtime_server_event_conversation_item_input_audio_transcription_failed->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_conversation_item_input_audio_transcription_failed_type_ToString(realtime_server_event_conversation_item_input_audio_transcription_failed->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_conversation_item_input_audio_transcription_failed->item_id
    if (!realtime_server_event_conversation_item_input_audio_transcription_failed->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_server_event_conversation_item_input_audio_transcription_failed->item_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_conversation_item_input_audio_transcription_failed->content_index
    if (!realtime_server_event_conversation_item_input_audio_transcription_failed->content_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "content_index", *realtime_server_event_conversation_item_input_audio_transcription_failed->content_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_conversation_item_input_audio_transcription_failed->error
    if (!realtime_server_event_conversation_item_input_audio_transcription_failed->error) {
        goto fail;
    }
    cJSON *error_local_JSON = realtime_server_event_conversation_item_input_audio_transcription_failed_error_convertToJSON(realtime_server_event_conversation_item_input_audio_transcription_failed->error);
    if(error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "error", error_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_conversation_item_input_audio_transcription_failed_t *realtime_server_event_conversation_item_input_audio_transcription_failed_parseFromJSON(cJSON *realtime_server_event_conversation_item_input_audio_transcription_failedJSON){

    realtime_server_event_conversation_item_input_audio_transcription_failed_t *realtime_server_event_conversation_item_input_audio_transcription_failed_local_var = NULL;

    char *event_id_local_str = NULL;

    char *item_id_local_str = NULL;

    // define the local variable for realtime_server_event_conversation_item_input_audio_transcription_failed->content_index
    int *content_index_local_var = NULL;

    // define the local variable for realtime_server_event_conversation_item_input_audio_transcription_failed->error
    realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *error_local_nonprim = NULL;

    // realtime_server_event_conversation_item_input_audio_transcription_failed->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_failedJSON, "event_id");
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

    // realtime_server_event_conversation_item_input_audio_transcription_failed->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_failedJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_conversation_item_input_audio_transcription_failed_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_conversation_item_input_audio_transcription_failed_type_FromString(type->valuestring);

    // realtime_server_event_conversation_item_input_audio_transcription_failed->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_failedJSON, "item_id");
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

    // realtime_server_event_conversation_item_input_audio_transcription_failed->content_index
    cJSON *content_index = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_failedJSON, "content_index");
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
    content_index_local_var = malloc(sizeof(int));
    if(!content_index_local_var)
    {
        goto end;
    }
    *content_index_local_var = content_index->valuedouble;

    // realtime_server_event_conversation_item_input_audio_transcription_failed->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(realtime_server_event_conversation_item_input_audio_transcription_failedJSON, "error");
    if (cJSON_IsNull(error)) {
        error = NULL;
    }
    if (!error) {
        goto end;
    }

    
    error_local_nonprim = realtime_server_event_conversation_item_input_audio_transcription_failed_error_parseFromJSON(error); //nonprimitive


    if (event_id && !cJSON_IsNull(event_id)) event_id_local_str = strdup(event_id->valuestring);
    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);

    realtime_server_event_conversation_item_input_audio_transcription_failed_local_var = realtime_server_event_conversation_item_input_audio_transcription_failed_create_internal (
        event_id_local_str,
        typeVariable,
        item_id_local_str,
        content_index_local_var,
        error_local_nonprim
        );

    if (!realtime_server_event_conversation_item_input_audio_transcription_failed_local_var) {
        goto end;
    }

    return realtime_server_event_conversation_item_input_audio_transcription_failed_local_var;
end:
    if (event_id_local_str) {
        free(event_id_local_str);
        event_id_local_str = NULL;
    }
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    if (content_index_local_var) {
        free(content_index_local_var);
        content_index_local_var = NULL;
    }
    if (error_local_nonprim) {
        realtime_server_event_conversation_item_input_audio_transcription_failed_error_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    return NULL;

}
