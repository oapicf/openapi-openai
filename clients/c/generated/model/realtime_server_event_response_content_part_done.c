#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_response_content_part_done.h"


char* realtime_server_event_response_content_part_done_type_ToString(openai_api_realtime_server_event_response_content_part_done_TYPE_e type) {
    char* typeArray[] =  { "NULL", "response.content_part.done" };
    return typeArray[type];
}

openai_api_realtime_server_event_response_content_part_done_TYPE_e realtime_server_event_response_content_part_done_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "response.content_part.done" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_response_content_part_done_t *realtime_server_event_response_content_part_done_create_internal(
    char *event_id,
    openai_api_realtime_server_event_response_content_part_done_TYPE_e type,
    char *response_id,
    char *item_id,
    int output_index,
    int content_index,
    realtime_server_event_response_content_part_done_part_t *part
    ) {
    realtime_server_event_response_content_part_done_t *realtime_server_event_response_content_part_done_local_var = malloc(sizeof(realtime_server_event_response_content_part_done_t));
    if (!realtime_server_event_response_content_part_done_local_var) {
        return NULL;
    }
    realtime_server_event_response_content_part_done_local_var->event_id = event_id;
    realtime_server_event_response_content_part_done_local_var->type = type;
    realtime_server_event_response_content_part_done_local_var->response_id = response_id;
    realtime_server_event_response_content_part_done_local_var->item_id = item_id;
    realtime_server_event_response_content_part_done_local_var->output_index = output_index;
    realtime_server_event_response_content_part_done_local_var->content_index = content_index;
    realtime_server_event_response_content_part_done_local_var->part = part;

    realtime_server_event_response_content_part_done_local_var->_library_owned = 1;
    return realtime_server_event_response_content_part_done_local_var;
}

__attribute__((deprecated)) realtime_server_event_response_content_part_done_t *realtime_server_event_response_content_part_done_create(
    char *event_id,
    openai_api_realtime_server_event_response_content_part_done_TYPE_e type,
    char *response_id,
    char *item_id,
    int output_index,
    int content_index,
    realtime_server_event_response_content_part_done_part_t *part
    ) {
    return realtime_server_event_response_content_part_done_create_internal (
        event_id,
        type,
        response_id,
        item_id,
        output_index,
        content_index,
        part
        );
}

void realtime_server_event_response_content_part_done_free(realtime_server_event_response_content_part_done_t *realtime_server_event_response_content_part_done) {
    if(NULL == realtime_server_event_response_content_part_done){
        return ;
    }
    if(realtime_server_event_response_content_part_done->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_response_content_part_done_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_response_content_part_done->event_id) {
        free(realtime_server_event_response_content_part_done->event_id);
        realtime_server_event_response_content_part_done->event_id = NULL;
    }
    if (realtime_server_event_response_content_part_done->response_id) {
        free(realtime_server_event_response_content_part_done->response_id);
        realtime_server_event_response_content_part_done->response_id = NULL;
    }
    if (realtime_server_event_response_content_part_done->item_id) {
        free(realtime_server_event_response_content_part_done->item_id);
        realtime_server_event_response_content_part_done->item_id = NULL;
    }
    if (realtime_server_event_response_content_part_done->part) {
        realtime_server_event_response_content_part_done_part_free(realtime_server_event_response_content_part_done->part);
        realtime_server_event_response_content_part_done->part = NULL;
    }
    free(realtime_server_event_response_content_part_done);
}

cJSON *realtime_server_event_response_content_part_done_convertToJSON(realtime_server_event_response_content_part_done_t *realtime_server_event_response_content_part_done) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_response_content_part_done->event_id
    if (!realtime_server_event_response_content_part_done->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_response_content_part_done->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_content_part_done->type
    if (openai_api_realtime_server_event_response_content_part_done_TYPE_NULL == realtime_server_event_response_content_part_done->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_response_content_part_done_type_ToString(realtime_server_event_response_content_part_done->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_response_content_part_done->response_id
    if (!realtime_server_event_response_content_part_done->response_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "response_id", realtime_server_event_response_content_part_done->response_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_content_part_done->item_id
    if (!realtime_server_event_response_content_part_done->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_server_event_response_content_part_done->item_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_content_part_done->output_index
    if (!realtime_server_event_response_content_part_done->output_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "output_index", realtime_server_event_response_content_part_done->output_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_response_content_part_done->content_index
    if (!realtime_server_event_response_content_part_done->content_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "content_index", realtime_server_event_response_content_part_done->content_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_response_content_part_done->part
    if (!realtime_server_event_response_content_part_done->part) {
        goto fail;
    }
    cJSON *part_local_JSON = realtime_server_event_response_content_part_done_part_convertToJSON(realtime_server_event_response_content_part_done->part);
    if(part_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "part", part_local_JSON);
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

realtime_server_event_response_content_part_done_t *realtime_server_event_response_content_part_done_parseFromJSON(cJSON *realtime_server_event_response_content_part_doneJSON){

    realtime_server_event_response_content_part_done_t *realtime_server_event_response_content_part_done_local_var = NULL;

    // define the local variable for realtime_server_event_response_content_part_done->part
    realtime_server_event_response_content_part_done_part_t *part_local_nonprim = NULL;

    // realtime_server_event_response_content_part_done->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_doneJSON, "event_id");
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

    // realtime_server_event_response_content_part_done->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_doneJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_response_content_part_done_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_response_content_part_done_type_FromString(type->valuestring);

    // realtime_server_event_response_content_part_done->response_id
    cJSON *response_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_doneJSON, "response_id");
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

    // realtime_server_event_response_content_part_done->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_doneJSON, "item_id");
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

    // realtime_server_event_response_content_part_done->output_index
    cJSON *output_index = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_doneJSON, "output_index");
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

    // realtime_server_event_response_content_part_done->content_index
    cJSON *content_index = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_doneJSON, "content_index");
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

    // realtime_server_event_response_content_part_done->part
    cJSON *part = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_doneJSON, "part");
    if (cJSON_IsNull(part)) {
        part = NULL;
    }
    if (!part) {
        goto end;
    }

    
    part_local_nonprim = realtime_server_event_response_content_part_done_part_parseFromJSON(part); //nonprimitive


    realtime_server_event_response_content_part_done_local_var = realtime_server_event_response_content_part_done_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        strdup(response_id->valuestring),
        strdup(item_id->valuestring),
        output_index->valuedouble,
        content_index->valuedouble,
        part_local_nonprim
        );

    return realtime_server_event_response_content_part_done_local_var;
end:
    if (part_local_nonprim) {
        realtime_server_event_response_content_part_done_part_free(part_local_nonprim);
        part_local_nonprim = NULL;
    }
    return NULL;

}
