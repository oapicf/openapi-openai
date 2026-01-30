#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_client_event_conversation_item_delete.h"


char* realtime_client_event_conversation_item_delete_type_ToString(openai_api_realtime_client_event_conversation_item_delete_TYPE_e type) {
    char* typeArray[] =  { "NULL", "conversation.item.delete" };
    return typeArray[type];
}

openai_api_realtime_client_event_conversation_item_delete_TYPE_e realtime_client_event_conversation_item_delete_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "conversation.item.delete" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete_create_internal(
    char *event_id,
    openai_api_realtime_client_event_conversation_item_delete_TYPE_e type,
    char *item_id
    ) {
    realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete_local_var = malloc(sizeof(realtime_client_event_conversation_item_delete_t));
    if (!realtime_client_event_conversation_item_delete_local_var) {
        return NULL;
    }
    realtime_client_event_conversation_item_delete_local_var->event_id = event_id;
    realtime_client_event_conversation_item_delete_local_var->type = type;
    realtime_client_event_conversation_item_delete_local_var->item_id = item_id;

    realtime_client_event_conversation_item_delete_local_var->_library_owned = 1;
    return realtime_client_event_conversation_item_delete_local_var;
}

__attribute__((deprecated)) realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete_create(
    char *event_id,
    openai_api_realtime_client_event_conversation_item_delete_TYPE_e type,
    char *item_id
    ) {
    return realtime_client_event_conversation_item_delete_create_internal (
        event_id,
        type,
        item_id
        );
}

void realtime_client_event_conversation_item_delete_free(realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete) {
    if(NULL == realtime_client_event_conversation_item_delete){
        return ;
    }
    if(realtime_client_event_conversation_item_delete->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_client_event_conversation_item_delete_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_client_event_conversation_item_delete->event_id) {
        free(realtime_client_event_conversation_item_delete->event_id);
        realtime_client_event_conversation_item_delete->event_id = NULL;
    }
    if (realtime_client_event_conversation_item_delete->item_id) {
        free(realtime_client_event_conversation_item_delete->item_id);
        realtime_client_event_conversation_item_delete->item_id = NULL;
    }
    free(realtime_client_event_conversation_item_delete);
}

cJSON *realtime_client_event_conversation_item_delete_convertToJSON(realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete) {
    cJSON *item = cJSON_CreateObject();

    // realtime_client_event_conversation_item_delete->event_id
    if(realtime_client_event_conversation_item_delete->event_id) {
    if(cJSON_AddStringToObject(item, "event_id", realtime_client_event_conversation_item_delete->event_id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_client_event_conversation_item_delete->type
    if (openai_api_realtime_client_event_conversation_item_delete_TYPE_NULL == realtime_client_event_conversation_item_delete->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_client_event_conversation_item_delete_type_ToString(realtime_client_event_conversation_item_delete->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_client_event_conversation_item_delete->item_id
    if (!realtime_client_event_conversation_item_delete->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_client_event_conversation_item_delete->item_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete_parseFromJSON(cJSON *realtime_client_event_conversation_item_deleteJSON){

    realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete_local_var = NULL;

    // realtime_client_event_conversation_item_delete->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_deleteJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (event_id) { 
    if(!cJSON_IsString(event_id) && !cJSON_IsNull(event_id))
    {
    goto end; //String
    }
    }

    // realtime_client_event_conversation_item_delete->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_deleteJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_client_event_conversation_item_delete_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_client_event_conversation_item_delete_type_FromString(type->valuestring);

    // realtime_client_event_conversation_item_delete->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_deleteJSON, "item_id");
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


    realtime_client_event_conversation_item_delete_local_var = realtime_client_event_conversation_item_delete_create_internal (
        event_id && !cJSON_IsNull(event_id) ? strdup(event_id->valuestring) : NULL,
        typeVariable,
        strdup(item_id->valuestring)
        );

    return realtime_client_event_conversation_item_delete_local_var;
end:
    return NULL;

}
