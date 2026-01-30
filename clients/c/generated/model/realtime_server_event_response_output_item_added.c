#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_response_output_item_added.h"


char* realtime_server_event_response_output_item_added_type_ToString(openai_api_realtime_server_event_response_output_item_added_TYPE_e type) {
    char* typeArray[] =  { "NULL", "response.output_item.added" };
    return typeArray[type];
}

openai_api_realtime_server_event_response_output_item_added_TYPE_e realtime_server_event_response_output_item_added_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "response.output_item.added" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added_create_internal(
    char *event_id,
    openai_api_realtime_server_event_response_output_item_added_TYPE_e type,
    char *response_id,
    int output_index,
    realtime_conversation_item_t *item
    ) {
    realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added_local_var = malloc(sizeof(realtime_server_event_response_output_item_added_t));
    if (!realtime_server_event_response_output_item_added_local_var) {
        return NULL;
    }
    realtime_server_event_response_output_item_added_local_var->event_id = event_id;
    realtime_server_event_response_output_item_added_local_var->type = type;
    realtime_server_event_response_output_item_added_local_var->response_id = response_id;
    realtime_server_event_response_output_item_added_local_var->output_index = output_index;
    realtime_server_event_response_output_item_added_local_var->item = item;

    realtime_server_event_response_output_item_added_local_var->_library_owned = 1;
    return realtime_server_event_response_output_item_added_local_var;
}

__attribute__((deprecated)) realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added_create(
    char *event_id,
    openai_api_realtime_server_event_response_output_item_added_TYPE_e type,
    char *response_id,
    int output_index,
    realtime_conversation_item_t *item
    ) {
    return realtime_server_event_response_output_item_added_create_internal (
        event_id,
        type,
        response_id,
        output_index,
        item
        );
}

void realtime_server_event_response_output_item_added_free(realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added) {
    if(NULL == realtime_server_event_response_output_item_added){
        return ;
    }
    if(realtime_server_event_response_output_item_added->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_response_output_item_added_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_response_output_item_added->event_id) {
        free(realtime_server_event_response_output_item_added->event_id);
        realtime_server_event_response_output_item_added->event_id = NULL;
    }
    if (realtime_server_event_response_output_item_added->response_id) {
        free(realtime_server_event_response_output_item_added->response_id);
        realtime_server_event_response_output_item_added->response_id = NULL;
    }
    if (realtime_server_event_response_output_item_added->item) {
        realtime_conversation_item_free(realtime_server_event_response_output_item_added->item);
        realtime_server_event_response_output_item_added->item = NULL;
    }
    free(realtime_server_event_response_output_item_added);
}

cJSON *realtime_server_event_response_output_item_added_convertToJSON(realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_response_output_item_added->event_id
    if (!realtime_server_event_response_output_item_added->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_response_output_item_added->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_output_item_added->type
    if (openai_api_realtime_server_event_response_output_item_added_TYPE_NULL == realtime_server_event_response_output_item_added->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_response_output_item_added_type_ToString(realtime_server_event_response_output_item_added->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_response_output_item_added->response_id
    if (!realtime_server_event_response_output_item_added->response_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "response_id", realtime_server_event_response_output_item_added->response_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_output_item_added->output_index
    if (!realtime_server_event_response_output_item_added->output_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "output_index", realtime_server_event_response_output_item_added->output_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_response_output_item_added->item
    if (!realtime_server_event_response_output_item_added->item) {
        goto fail;
    }
    cJSON *item_local_JSON = realtime_conversation_item_convertToJSON(realtime_server_event_response_output_item_added->item);
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

realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added_parseFromJSON(cJSON *realtime_server_event_response_output_item_addedJSON){

    realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added_local_var = NULL;

    // define the local variable for realtime_server_event_response_output_item_added->item
    realtime_conversation_item_t *item_local_nonprim = NULL;

    // realtime_server_event_response_output_item_added->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_output_item_addedJSON, "event_id");
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

    // realtime_server_event_response_output_item_added->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_output_item_addedJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_response_output_item_added_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_response_output_item_added_type_FromString(type->valuestring);

    // realtime_server_event_response_output_item_added->response_id
    cJSON *response_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_output_item_addedJSON, "response_id");
    if (cJSON_IsNull(response_id)) {
        response_id = NULL;
    }
    if (!response_id) {
        goto end;
    }

    
    if(!cJSON_IsString(response_id))
    {
    goto end; //String
    }

    // realtime_server_event_response_output_item_added->output_index
    cJSON *output_index = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_output_item_addedJSON, "output_index");
    if (cJSON_IsNull(output_index)) {
        output_index = NULL;
    }
    if (!output_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(output_index))
    {
    goto end; //Numeric
    }

    // realtime_server_event_response_output_item_added->item
    cJSON *item = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_output_item_addedJSON, "item");
    if (cJSON_IsNull(item)) {
        item = NULL;
    }
    if (!item) {
        goto end;
    }

    
    item_local_nonprim = realtime_conversation_item_parseFromJSON(item); //nonprimitive


    realtime_server_event_response_output_item_added_local_var = realtime_server_event_response_output_item_added_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        strdup(response_id->valuestring),
        output_index->valuedouble,
        item_local_nonprim
        );

    return realtime_server_event_response_output_item_added_local_var;
end:
    if (item_local_nonprim) {
        realtime_conversation_item_free(item_local_nonprim);
        item_local_nonprim = NULL;
    }
    return NULL;

}
