#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_error.h"


char* realtime_server_event_error_type_ToString(openai_api_realtime_server_event_error_TYPE_e type) {
    char* typeArray[] =  { "NULL", "error" };
    return typeArray[type];
}

openai_api_realtime_server_event_error_TYPE_e realtime_server_event_error_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "error" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_error_t *realtime_server_event_error_create_internal(
    char *event_id,
    openai_api_realtime_server_event_error_TYPE_e type,
    realtime_server_event_error_error_t *error
    ) {
    realtime_server_event_error_t *realtime_server_event_error_local_var = malloc(sizeof(realtime_server_event_error_t));
    if (!realtime_server_event_error_local_var) {
        return NULL;
    }
    realtime_server_event_error_local_var->event_id = event_id;
    realtime_server_event_error_local_var->type = type;
    realtime_server_event_error_local_var->error = error;

    realtime_server_event_error_local_var->_library_owned = 1;
    return realtime_server_event_error_local_var;
}

__attribute__((deprecated)) realtime_server_event_error_t *realtime_server_event_error_create(
    char *event_id,
    openai_api_realtime_server_event_error_TYPE_e type,
    realtime_server_event_error_error_t *error
    ) {
    return realtime_server_event_error_create_internal (
        event_id,
        type,
        error
        );
}

void realtime_server_event_error_free(realtime_server_event_error_t *realtime_server_event_error) {
    if(NULL == realtime_server_event_error){
        return ;
    }
    if(realtime_server_event_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_error->event_id) {
        free(realtime_server_event_error->event_id);
        realtime_server_event_error->event_id = NULL;
    }
    if (realtime_server_event_error->error) {
        realtime_server_event_error_error_free(realtime_server_event_error->error);
        realtime_server_event_error->error = NULL;
    }
    free(realtime_server_event_error);
}

cJSON *realtime_server_event_error_convertToJSON(realtime_server_event_error_t *realtime_server_event_error) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_error->event_id
    if (!realtime_server_event_error->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_error->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_error->type
    if (openai_api_realtime_server_event_error_TYPE_NULL == realtime_server_event_error->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_error_type_ToString(realtime_server_event_error->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_error->error
    if (!realtime_server_event_error->error) {
        goto fail;
    }
    cJSON *error_local_JSON = realtime_server_event_error_error_convertToJSON(realtime_server_event_error->error);
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

realtime_server_event_error_t *realtime_server_event_error_parseFromJSON(cJSON *realtime_server_event_errorJSON){

    realtime_server_event_error_t *realtime_server_event_error_local_var = NULL;

    // define the local variable for realtime_server_event_error->error
    realtime_server_event_error_error_t *error_local_nonprim = NULL;

    // realtime_server_event_error->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_errorJSON, "event_id");
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

    // realtime_server_event_error->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_errorJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_error_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_error_type_FromString(type->valuestring);

    // realtime_server_event_error->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(realtime_server_event_errorJSON, "error");
    if (cJSON_IsNull(error)) {
        error = NULL;
    }
    if (!error) {
        goto end;
    }

    
    error_local_nonprim = realtime_server_event_error_error_parseFromJSON(error); //nonprimitive


    realtime_server_event_error_local_var = realtime_server_event_error_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        error_local_nonprim
        );

    return realtime_server_event_error_local_var;
end:
    if (error_local_nonprim) {
        realtime_server_event_error_error_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    return NULL;

}
