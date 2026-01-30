#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_response_text_done.h"


char* realtime_server_event_response_text_done_type_ToString(openai_api_realtime_server_event_response_text_done_TYPE_e type) {
    char* typeArray[] =  { "NULL", "response.text.done" };
    return typeArray[type];
}

openai_api_realtime_server_event_response_text_done_TYPE_e realtime_server_event_response_text_done_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "response.text.done" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_response_text_done_t *realtime_server_event_response_text_done_create_internal(
    char *event_id,
    openai_api_realtime_server_event_response_text_done_TYPE_e type,
    char *response_id,
    char *item_id,
    int output_index,
    int content_index,
    char *text
    ) {
    realtime_server_event_response_text_done_t *realtime_server_event_response_text_done_local_var = malloc(sizeof(realtime_server_event_response_text_done_t));
    if (!realtime_server_event_response_text_done_local_var) {
        return NULL;
    }
    realtime_server_event_response_text_done_local_var->event_id = event_id;
    realtime_server_event_response_text_done_local_var->type = type;
    realtime_server_event_response_text_done_local_var->response_id = response_id;
    realtime_server_event_response_text_done_local_var->item_id = item_id;
    realtime_server_event_response_text_done_local_var->output_index = output_index;
    realtime_server_event_response_text_done_local_var->content_index = content_index;
    realtime_server_event_response_text_done_local_var->text = text;

    realtime_server_event_response_text_done_local_var->_library_owned = 1;
    return realtime_server_event_response_text_done_local_var;
}

__attribute__((deprecated)) realtime_server_event_response_text_done_t *realtime_server_event_response_text_done_create(
    char *event_id,
    openai_api_realtime_server_event_response_text_done_TYPE_e type,
    char *response_id,
    char *item_id,
    int output_index,
    int content_index,
    char *text
    ) {
    return realtime_server_event_response_text_done_create_internal (
        event_id,
        type,
        response_id,
        item_id,
        output_index,
        content_index,
        text
        );
}

void realtime_server_event_response_text_done_free(realtime_server_event_response_text_done_t *realtime_server_event_response_text_done) {
    if(NULL == realtime_server_event_response_text_done){
        return ;
    }
    if(realtime_server_event_response_text_done->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_response_text_done_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_response_text_done->event_id) {
        free(realtime_server_event_response_text_done->event_id);
        realtime_server_event_response_text_done->event_id = NULL;
    }
    if (realtime_server_event_response_text_done->response_id) {
        free(realtime_server_event_response_text_done->response_id);
        realtime_server_event_response_text_done->response_id = NULL;
    }
    if (realtime_server_event_response_text_done->item_id) {
        free(realtime_server_event_response_text_done->item_id);
        realtime_server_event_response_text_done->item_id = NULL;
    }
    if (realtime_server_event_response_text_done->text) {
        free(realtime_server_event_response_text_done->text);
        realtime_server_event_response_text_done->text = NULL;
    }
    free(realtime_server_event_response_text_done);
}

cJSON *realtime_server_event_response_text_done_convertToJSON(realtime_server_event_response_text_done_t *realtime_server_event_response_text_done) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_response_text_done->event_id
    if (!realtime_server_event_response_text_done->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_response_text_done->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_text_done->type
    if (openai_api_realtime_server_event_response_text_done_TYPE_NULL == realtime_server_event_response_text_done->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_response_text_done_type_ToString(realtime_server_event_response_text_done->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_response_text_done->response_id
    if (!realtime_server_event_response_text_done->response_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "response_id", realtime_server_event_response_text_done->response_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_text_done->item_id
    if (!realtime_server_event_response_text_done->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", realtime_server_event_response_text_done->item_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_text_done->output_index
    if (!realtime_server_event_response_text_done->output_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "output_index", realtime_server_event_response_text_done->output_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_response_text_done->content_index
    if (!realtime_server_event_response_text_done->content_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "content_index", realtime_server_event_response_text_done->content_index) == NULL) {
    goto fail; //Numeric
    }


    // realtime_server_event_response_text_done->text
    if (!realtime_server_event_response_text_done->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", realtime_server_event_response_text_done->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_response_text_done_t *realtime_server_event_response_text_done_parseFromJSON(cJSON *realtime_server_event_response_text_doneJSON){

    realtime_server_event_response_text_done_t *realtime_server_event_response_text_done_local_var = NULL;

    // realtime_server_event_response_text_done->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_doneJSON, "event_id");
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

    // realtime_server_event_response_text_done->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_doneJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_response_text_done_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_response_text_done_type_FromString(type->valuestring);

    // realtime_server_event_response_text_done->response_id
    cJSON *response_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_doneJSON, "response_id");
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

    // realtime_server_event_response_text_done->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_doneJSON, "item_id");
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

    // realtime_server_event_response_text_done->output_index
    cJSON *output_index = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_doneJSON, "output_index");
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

    // realtime_server_event_response_text_done->content_index
    cJSON *content_index = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_doneJSON, "content_index");
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

    // realtime_server_event_response_text_done->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_text_doneJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }


    realtime_server_event_response_text_done_local_var = realtime_server_event_response_text_done_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        strdup(response_id->valuestring),
        strdup(item_id->valuestring),
        output_index->valuedouble,
        content_index->valuedouble,
        strdup(text->valuestring)
        );

    return realtime_server_event_response_text_done_local_var;
end:
    return NULL;

}
