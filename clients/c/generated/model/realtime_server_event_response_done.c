#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_response_done.h"


char* realtime_server_event_response_done_type_ToString(openai_api_realtime_server_event_response_done_TYPE_e type) {
    char* typeArray[] =  { "NULL", "response.done" };
    return typeArray[type];
}

openai_api_realtime_server_event_response_done_TYPE_e realtime_server_event_response_done_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "response.done" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_response_done_t *realtime_server_event_response_done_create_internal(
    char *event_id,
    openai_api_realtime_server_event_response_done_TYPE_e type,
    realtime_response_t *response
    ) {
    realtime_server_event_response_done_t *realtime_server_event_response_done_local_var = malloc(sizeof(realtime_server_event_response_done_t));
    if (!realtime_server_event_response_done_local_var) {
        return NULL;
    }
    realtime_server_event_response_done_local_var->event_id = event_id;
    realtime_server_event_response_done_local_var->type = type;
    realtime_server_event_response_done_local_var->response = response;

    realtime_server_event_response_done_local_var->_library_owned = 1;
    return realtime_server_event_response_done_local_var;
}

__attribute__((deprecated)) realtime_server_event_response_done_t *realtime_server_event_response_done_create(
    char *event_id,
    openai_api_realtime_server_event_response_done_TYPE_e type,
    realtime_response_t *response
    ) {
    return realtime_server_event_response_done_create_internal (
        event_id,
        type,
        response
        );
}

void realtime_server_event_response_done_free(realtime_server_event_response_done_t *realtime_server_event_response_done) {
    if(NULL == realtime_server_event_response_done){
        return ;
    }
    if(realtime_server_event_response_done->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_response_done_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_response_done->event_id) {
        free(realtime_server_event_response_done->event_id);
        realtime_server_event_response_done->event_id = NULL;
    }
    if (realtime_server_event_response_done->response) {
        realtime_response_free(realtime_server_event_response_done->response);
        realtime_server_event_response_done->response = NULL;
    }
    free(realtime_server_event_response_done);
}

cJSON *realtime_server_event_response_done_convertToJSON(realtime_server_event_response_done_t *realtime_server_event_response_done) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_response_done->event_id
    if (!realtime_server_event_response_done->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_response_done->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_response_done->type
    if (openai_api_realtime_server_event_response_done_TYPE_NULL == realtime_server_event_response_done->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_response_done_type_ToString(realtime_server_event_response_done->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_response_done->response
    if (!realtime_server_event_response_done->response) {
        goto fail;
    }
    cJSON *response_local_JSON = realtime_response_convertToJSON(realtime_server_event_response_done->response);
    if(response_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "response", response_local_JSON);
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

realtime_server_event_response_done_t *realtime_server_event_response_done_parseFromJSON(cJSON *realtime_server_event_response_doneJSON){

    realtime_server_event_response_done_t *realtime_server_event_response_done_local_var = NULL;

    // define the local variable for realtime_server_event_response_done->response
    realtime_response_t *response_local_nonprim = NULL;

    // realtime_server_event_response_done->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_doneJSON, "event_id");
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

    // realtime_server_event_response_done->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_doneJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_response_done_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_response_done_type_FromString(type->valuestring);

    // realtime_server_event_response_done->response
    cJSON *response = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_doneJSON, "response");
    if (cJSON_IsNull(response)) {
        response = NULL;
    }
    if (!response) {
        goto end;
    }

    
    response_local_nonprim = realtime_response_parseFromJSON(response); //nonprimitive


    realtime_server_event_response_done_local_var = realtime_server_event_response_done_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        response_local_nonprim
        );

    return realtime_server_event_response_done_local_var;
end:
    if (response_local_nonprim) {
        realtime_response_free(response_local_nonprim);
        response_local_nonprim = NULL;
    }
    return NULL;

}
