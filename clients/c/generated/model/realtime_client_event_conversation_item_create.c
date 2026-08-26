#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_client_event_conversation_item_create.h"


char* realtime_client_event_conversation_item_create_type_ToString(openai_api_realtime_client_event_conversation_item_create_TYPE_e type) {
    char* typeArray[] =  { "NULL", "conversation.item.create" };
    return typeArray[type];
}

openai_api_realtime_client_event_conversation_item_create_TYPE_e realtime_client_event_conversation_item_create_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "conversation.item.create" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create_create_internal(
    char *event_id,
    openai_api_realtime_client_event_conversation_item_create_TYPE_e type,
    char *previous_item_id,
    realtime_conversation_item_t *item
    ) {
    realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create_local_var = malloc(sizeof(realtime_client_event_conversation_item_create_t));
    if (!realtime_client_event_conversation_item_create_local_var) {
        return NULL;
    }
    memset(realtime_client_event_conversation_item_create_local_var, 0, sizeof(realtime_client_event_conversation_item_create_t));
    realtime_client_event_conversation_item_create_local_var->_library_owned = 1;
    realtime_client_event_conversation_item_create_local_var->event_id = event_id;
    realtime_client_event_conversation_item_create_local_var->type = type;
    realtime_client_event_conversation_item_create_local_var->previous_item_id = previous_item_id;
    realtime_client_event_conversation_item_create_local_var->item = item;
    return realtime_client_event_conversation_item_create_local_var;
}

__attribute__((deprecated)) realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create_create(
    char *event_id,
    openai_api_realtime_client_event_conversation_item_create_TYPE_e type,
    char *previous_item_id,
    realtime_conversation_item_t *item
    ) {
    realtime_client_event_conversation_item_create_t *result = realtime_client_event_conversation_item_create_create_internal (
        event_id,
        type,
        previous_item_id,
        item
        );
    if (!result) {
    }
    return result;
}

void realtime_client_event_conversation_item_create_free(realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create) {
    if(NULL == realtime_client_event_conversation_item_create){
        return ;
    }
    if(realtime_client_event_conversation_item_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_client_event_conversation_item_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_client_event_conversation_item_create->event_id) {
        free(realtime_client_event_conversation_item_create->event_id);
        realtime_client_event_conversation_item_create->event_id = NULL;
    }
    if (realtime_client_event_conversation_item_create->previous_item_id) {
        free(realtime_client_event_conversation_item_create->previous_item_id);
        realtime_client_event_conversation_item_create->previous_item_id = NULL;
    }
    if (realtime_client_event_conversation_item_create->item) {
        realtime_conversation_item_free(realtime_client_event_conversation_item_create->item);
        realtime_client_event_conversation_item_create->item = NULL;
    }
    free(realtime_client_event_conversation_item_create);
}

cJSON *realtime_client_event_conversation_item_create_convertToJSON(realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create) {
    cJSON *item = cJSON_CreateObject();

    // realtime_client_event_conversation_item_create->event_id
    if(realtime_client_event_conversation_item_create->event_id) {
    if(cJSON_AddStringToObject(item, "event_id", realtime_client_event_conversation_item_create->event_id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_client_event_conversation_item_create->type
    if (openai_api_realtime_client_event_conversation_item_create_TYPE_NULL == realtime_client_event_conversation_item_create->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_client_event_conversation_item_create_type_ToString(realtime_client_event_conversation_item_create->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_client_event_conversation_item_create->previous_item_id
    if(realtime_client_event_conversation_item_create->previous_item_id) {
    if(cJSON_AddStringToObject(item, "previous_item_id", realtime_client_event_conversation_item_create->previous_item_id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_client_event_conversation_item_create->item
    if (!realtime_client_event_conversation_item_create->item) {
        goto fail;
    }
    cJSON *item_local_JSON = realtime_conversation_item_convertToJSON(realtime_client_event_conversation_item_create->item);
    if(item_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "item", item_local_JSON);
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

realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create_parseFromJSON(cJSON *realtime_client_event_conversation_item_createJSON){

    realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create_local_var = NULL;

    char *event_id_local_str = NULL;

    char *previous_item_id_local_str = NULL;

    // define the local variable for realtime_client_event_conversation_item_create->item
    realtime_conversation_item_t *item_local_nonprim = NULL;

    // realtime_client_event_conversation_item_create->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_createJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (event_id) { 
    if(!cJSON_IsString(event_id) && !cJSON_IsNull(event_id))
    {
    goto end; //String
    }
    }

    // realtime_client_event_conversation_item_create->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_createJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_client_event_conversation_item_create_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_client_event_conversation_item_create_type_FromString(type->valuestring);

    // realtime_client_event_conversation_item_create->previous_item_id
    cJSON *previous_item_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_createJSON, "previous_item_id");
    if (cJSON_IsNull(previous_item_id)) {
        previous_item_id = NULL;
    }
    if (previous_item_id) { 
    if(!cJSON_IsString(previous_item_id) && !cJSON_IsNull(previous_item_id))
    {
    goto end; //String
    }
    }

    // realtime_client_event_conversation_item_create->item
    cJSON *item = cJSON_GetObjectItemCaseSensitive(realtime_client_event_conversation_item_createJSON, "item");
    if (cJSON_IsNull(item)) {
        item = NULL;
    }
    if (!item) {
        goto end;
    }

    
    item_local_nonprim = realtime_conversation_item_parseFromJSON(item); //nonprimitive


    if (event_id && !cJSON_IsNull(event_id)) event_id_local_str = strdup(event_id->valuestring);
    if (previous_item_id && !cJSON_IsNull(previous_item_id)) previous_item_id_local_str = strdup(previous_item_id->valuestring);

    realtime_client_event_conversation_item_create_local_var = realtime_client_event_conversation_item_create_create_internal (
        event_id_local_str,
        typeVariable,
        previous_item_id_local_str,
        item_local_nonprim
        );

    if (!realtime_client_event_conversation_item_create_local_var) {
        goto end;
    }

    return realtime_client_event_conversation_item_create_local_var;
end:
    if (event_id_local_str) {
        free(event_id_local_str);
        event_id_local_str = NULL;
    }
    if (previous_item_id_local_str) {
        free(previous_item_id_local_str);
        previous_item_id_local_str = NULL;
    }
    if (item_local_nonprim) {
        realtime_conversation_item_free(item_local_nonprim);
        item_local_nonprim = NULL;
    }
    return NULL;

}
