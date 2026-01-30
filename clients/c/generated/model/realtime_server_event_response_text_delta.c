#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_response_text_delta.h"


char* realtime_server_event_response_text_delta_type_ToString(openai_api_realtime_server_event_response_text_delta_TYPE_e type) {
    char* typeArray[] =  { "NULL", "response.text.delta" };
    return typeArray[type];
}

openai_api_realtime_server_event_response_text_delta_TYPE_e realtime_server_event_response_text_delta_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "response.text.delta" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta_create_internal(
    char *event_id,
    openai_api_realtime_server_event_response_text_delta_TYPE_e type,
    char *response_id,
    char *item_id,
    int output_index,
    int content_index,
    char *delta
    ) {
    realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta_local_var = malloc(sizeof(realtime_server_event_response_text_delta_t));
    if (!realtime_server_event_response_text_delta_local_var) {
        return NULL;
    }
    realtime_server_event_response_text_delta_local_var->event_id = event_id;
    realtime_server_event_response_text_delta_local_var->type = type;
    realtime_server_event_response_text_delta_local_var->response_id = response_id;
    realtime_server_event_response_text_delta_local_var->item_id = item_id;
    realtime_server_event_response_text_delta_local_var->output_index = output_index;
    realtime_server_event_response_text_delta_local_var->content_index = content_index;
    realtime_server_event_response_text_delta_local_var->delta = delta;

    realtime_server_event_response_text_delta_local_var->_library_owned = 1;
    return realtime_server_event_response_text_delta_local_var;
}

__attribute__((deprecated)) realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta_create(
    char *event_id,
    openai_api_realtime_server_event_response_text_delta_TYPE_e type,
    char *response_id,
    char *item_id,
    int output_index,
    int content_index,
    char *delta
    ) {
    return realtime_server_event_response_text_delta_create_internal (
        event_id,
        type,
        response_id,
        item_id,
        output_index,
        content_index,
        delta
        );
}

void realtime_server_event_response_text_delta_free(realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta) {
    if(NULL == realtime_server_event_response_text_delta){
        return ;
    }
    if(realtime_server_event_response_text_delta->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_response_text_delta_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_response_text_delta->event_id) {
        free(realtime_server_event_response_text_delta->event_id);
        realtime_server_event_response_text_delta->event_id = NULL;
    }
    if (realtime_server_event_response_text_delta->response_id) {
        free(realtime_server_event_response_text_delta->response_id);
        realtime_server_event_response_text_delta->response_id = NULL;
    }
    if (realtime_server_event_response_text_delta->item_id) {
        free(realtime_server_event_response_text_delta->item_id);
        realtime_server_event_response_text_delta->item_id = NULL;
    }
    if (realtime_server_event_response_text_delta->delta) {
        free(realtime_server_event_response_text_delta->delta);
        realtime_server_event_response_text_delta->delta = NULL;
    }
    free(realtime_server_event_response_text_delta);
}

cJSON *realtime_server_event_response_text_delta_convertToJSON(realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_response_text_delta->event_id
    if (!realtime_server_event_response_text_delta->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_response_text_delta->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_text_delta->type
    if (openai_api_realtime_server_event_response_text_delta_TYPE_NULL == realtime_server_event_response_text_delta->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_response_text_delta_type_ToString(realtime_server_event_response_text_delta->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_response_text_delta->response_id
    if (!realtime_server_event_response_text_delta->response_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "response_id", realtime_server_event_response_text_delta->response_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_text_delta->item_id
    if (!realtime_server_event_response_text_delta->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_server_event_response_text_delta->item_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_text_delta->output_index
    if (!realtime_server_event_response_text_delta->output_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "output_index", realtime_server_event_response_text_delta->output_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_response_text_delta->content_index
    if (!realtime_server_event_response_text_delta->content_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "content_index", realtime_server_event_response_text_delta->content_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_response_text_delta->delta
    if (!realtime_server_event_response_text_delta->delta) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "delta", realtime_server_event_response_text_delta->delta) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta_parseFromJSON(cJSON *realtime_server_event_response_text_deltaJSON){

    realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta_local_var = NULL;

    // realtime_server_event_response_text_delta->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_deltaJSON, "event_id");
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

    // realtime_server_event_response_text_delta->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_deltaJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_response_text_delta_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_response_text_delta_type_FromString(type->valuestring);

    // realtime_server_event_response_text_delta->response_id
    cJSON *response_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_deltaJSON, "response_id");
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

    // realtime_server_event_response_text_delta->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_deltaJSON, "item_id");
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

    // realtime_server_event_response_text_delta->output_index
    cJSON *output_index = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_deltaJSON, "output_index");
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

    // realtime_server_event_response_text_delta->content_index
    cJSON *content_index = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_deltaJSON, "content_index");
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

    // realtime_server_event_response_text_delta->delta
    cJSON *delta = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_deltaJSON, "delta");
    if (cJSON_IsNull(delta)) {
        delta = NULL;
    }
    if (!delta) {
        goto end;
    }

    
    if(!cJSON_IsString(delta))
    {
    goto end; //String
    }


    realtime_server_event_response_text_delta_local_var = realtime_server_event_response_text_delta_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        strdup(response_id->valuestring),
        strdup(item_id->valuestring),
        output_index->valuedouble,
        content_index->valuedouble,
        strdup(delta->valuestring)
        );

    return realtime_server_event_response_text_delta_local_var;
end:
    return NULL;

}
