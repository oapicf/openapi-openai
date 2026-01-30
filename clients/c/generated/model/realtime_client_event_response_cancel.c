#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_client_event_response_cancel.h"


char* realtime_client_event_response_cancel_type_ToString(openai_api_realtime_client_event_response_cancel_TYPE_e type) {
    char* typeArray[] =  { "NULL", "response.cancel" };
    return typeArray[type];
}

openai_api_realtime_client_event_response_cancel_TYPE_e realtime_client_event_response_cancel_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "response.cancel" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_client_event_response_cancel_t *realtime_client_event_response_cancel_create_internal(
    char *event_id,
    openai_api_realtime_client_event_response_cancel_TYPE_e type,
    char *response_id
    ) {
    realtime_client_event_response_cancel_t *realtime_client_event_response_cancel_local_var = malloc(sizeof(realtime_client_event_response_cancel_t));
    if (!realtime_client_event_response_cancel_local_var) {
        return NULL;
    }
    realtime_client_event_response_cancel_local_var->event_id = event_id;
    realtime_client_event_response_cancel_local_var->type = type;
    realtime_client_event_response_cancel_local_var->response_id = response_id;

    realtime_client_event_response_cancel_local_var->_library_owned = 1;
    return realtime_client_event_response_cancel_local_var;
}

__attribute__((deprecated)) realtime_client_event_response_cancel_t *realtime_client_event_response_cancel_create(
    char *event_id,
    openai_api_realtime_client_event_response_cancel_TYPE_e type,
    char *response_id
    ) {
    return realtime_client_event_response_cancel_create_internal (
        event_id,
        type,
        response_id
        );
}

void realtime_client_event_response_cancel_free(realtime_client_event_response_cancel_t *realtime_client_event_response_cancel) {
    if(NULL == realtime_client_event_response_cancel){
        return ;
    }
    if(realtime_client_event_response_cancel->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_client_event_response_cancel_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_client_event_response_cancel->event_id) {
        free(realtime_client_event_response_cancel->event_id);
        realtime_client_event_response_cancel->event_id = NULL;
    }
    if (realtime_client_event_response_cancel->response_id) {
        free(realtime_client_event_response_cancel->response_id);
        realtime_client_event_response_cancel->response_id = NULL;
    }
    free(realtime_client_event_response_cancel);
}

cJSON *realtime_client_event_response_cancel_convertToJSON(realtime_client_event_response_cancel_t *realtime_client_event_response_cancel) {
    cJSON *item = cJSON_CreateObject();

    // realtime_client_event_response_cancel->event_id
    if(realtime_client_event_response_cancel->event_id) {
    if(cJSON_AddStringToObject(item, "event_id", realtime_client_event_response_cancel->event_id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_client_event_response_cancel->type
    if (openai_api_realtime_client_event_response_cancel_TYPE_NULL == realtime_client_event_response_cancel->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_client_event_response_cancel_type_ToString(realtime_client_event_response_cancel->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_client_event_response_cancel->response_id
    if(realtime_client_event_response_cancel->response_id) {
    if(cJSON_AddStringToObject(item, "response_id", realtime_client_event_response_cancel->response_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_client_event_response_cancel_t *realtime_client_event_response_cancel_parseFromJSON(cJSON *realtime_client_event_response_cancelJSON){

    realtime_client_event_response_cancel_t *realtime_client_event_response_cancel_local_var = NULL;

    // realtime_client_event_response_cancel->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_response_cancelJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (event_id) { 
    if(!cJSON_IsString(event_id) && !cJSON_IsNull(event_id))
    {
    goto end; //String
    }
    }

    // realtime_client_event_response_cancel->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_client_event_response_cancelJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_client_event_response_cancel_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_client_event_response_cancel_type_FromString(type->valuestring);

    // realtime_client_event_response_cancel->response_id
    cJSON *response_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_response_cancelJSON, "response_id");
    if (cJSON_IsNull(response_id)) {
        response_id = NULL;
    }
    if (response_id) { 
    if(!cJSON_IsString(response_id) && !cJSON_IsNull(response_id))
    {
    goto end; //String
    }
    }


    realtime_client_event_response_cancel_local_var = realtime_client_event_response_cancel_create_internal (
        event_id && !cJSON_IsNull(event_id) ? strdup(event_id->valuestring) : NULL,
        typeVariable,
        response_id && !cJSON_IsNull(response_id) ? strdup(response_id->valuestring) : NULL
        );

    return realtime_client_event_response_cancel_local_var;
end:
    return NULL;

}
