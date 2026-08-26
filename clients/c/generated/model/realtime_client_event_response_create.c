#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_client_event_response_create.h"


char* realtime_client_event_response_create_type_ToString(openai_api_realtime_client_event_response_create_TYPE_e type) {
    char* typeArray[] =  { "NULL", "response.create" };
    return typeArray[type];
}

openai_api_realtime_client_event_response_create_TYPE_e realtime_client_event_response_create_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "response.create" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_client_event_response_create_t *realtime_client_event_response_create_create_internal(
    char *event_id,
    openai_api_realtime_client_event_response_create_TYPE_e type,
    realtime_response_create_params_t *response
    ) {
    realtime_client_event_response_create_t *realtime_client_event_response_create_local_var = malloc(sizeof(realtime_client_event_response_create_t));
    if (!realtime_client_event_response_create_local_var) {
        return NULL;
    }
    memset(realtime_client_event_response_create_local_var, 0, sizeof(realtime_client_event_response_create_t));
    realtime_client_event_response_create_local_var->_library_owned = 1;
    realtime_client_event_response_create_local_var->event_id = event_id;
    realtime_client_event_response_create_local_var->type = type;
    realtime_client_event_response_create_local_var->response = response;
    return realtime_client_event_response_create_local_var;
}

__attribute__((deprecated)) realtime_client_event_response_create_t *realtime_client_event_response_create_create(
    char *event_id,
    openai_api_realtime_client_event_response_create_TYPE_e type,
    realtime_response_create_params_t *response
    ) {
    realtime_client_event_response_create_t *result = realtime_client_event_response_create_create_internal (
        event_id,
        type,
        response
        );
    if (!result) {
    }
    return result;
}

void realtime_client_event_response_create_free(realtime_client_event_response_create_t *realtime_client_event_response_create) {
    if(NULL == realtime_client_event_response_create){
        return ;
    }
    if(realtime_client_event_response_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_client_event_response_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_client_event_response_create->event_id) {
        free(realtime_client_event_response_create->event_id);
        realtime_client_event_response_create->event_id = NULL;
    }
    if (realtime_client_event_response_create->response) {
        realtime_response_create_params_free(realtime_client_event_response_create->response);
        realtime_client_event_response_create->response = NULL;
    }
    free(realtime_client_event_response_create);
}

cJSON *realtime_client_event_response_create_convertToJSON(realtime_client_event_response_create_t *realtime_client_event_response_create) {
    cJSON *item = cJSON_CreateObject();

    // realtime_client_event_response_create->event_id
    if(realtime_client_event_response_create->event_id) {
    if(cJSON_AddStringToObject(item, "event_id", realtime_client_event_response_create->event_id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_client_event_response_create->type
    if (openai_api_realtime_client_event_response_create_TYPE_NULL == realtime_client_event_response_create->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_client_event_response_create_type_ToString(realtime_client_event_response_create->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_client_event_response_create->response
    if(realtime_client_event_response_create->response) {
    cJSON *response_local_JSON = realtime_response_create_params_convertToJSON(realtime_client_event_response_create->response);
    if(response_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "response", response_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_client_event_response_create_t *realtime_client_event_response_create_parseFromJSON(cJSON *realtime_client_event_response_createJSON){

    realtime_client_event_response_create_t *realtime_client_event_response_create_local_var = NULL;

    char *event_id_local_str = NULL;

    // define the local variable for realtime_client_event_response_create->response
    realtime_response_create_params_t *response_local_nonprim = NULL;

    // realtime_client_event_response_create->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_response_createJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (event_id) { 
    if(!cJSON_IsString(event_id) && !cJSON_IsNull(event_id))
    {
    goto end; //String
    }
    }

    // realtime_client_event_response_create->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_client_event_response_createJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_client_event_response_create_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_client_event_response_create_type_FromString(type->valuestring);

    // realtime_client_event_response_create->response
    cJSON *response = cJSON_GetObjectItemCaseSensitive(realtime_client_event_response_createJSON, "response");
    if (cJSON_IsNull(response)) {
        response = NULL;
    }
    if (response) { 
    response_local_nonprim = realtime_response_create_params_parseFromJSON(response); //nonprimitive
    }


    if (event_id && !cJSON_IsNull(event_id)) event_id_local_str = strdup(event_id->valuestring);

    realtime_client_event_response_create_local_var = realtime_client_event_response_create_create_internal (
        event_id_local_str,
        typeVariable,
        response ? response_local_nonprim : NULL
        );

    if (!realtime_client_event_response_create_local_var) {
        goto end;
    }

    return realtime_client_event_response_create_local_var;
end:
    if (event_id_local_str) {
        free(event_id_local_str);
        event_id_local_str = NULL;
    }
    if (response_local_nonprim) {
        realtime_response_create_params_free(response_local_nonprim);
        response_local_nonprim = NULL;
    }
    return NULL;

}
