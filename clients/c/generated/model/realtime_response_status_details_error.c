#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_response_status_details_error.h"



static realtime_response_status_details_error_t *realtime_response_status_details_error_create_internal(
    char *type,
    char *code
    ) {
    realtime_response_status_details_error_t *realtime_response_status_details_error_local_var = malloc(sizeof(realtime_response_status_details_error_t));
    if (!realtime_response_status_details_error_local_var) {
        return NULL;
    }
    realtime_response_status_details_error_local_var->type = type;
    realtime_response_status_details_error_local_var->code = code;

    realtime_response_status_details_error_local_var->_library_owned = 1;
    return realtime_response_status_details_error_local_var;
}

__attribute__((deprecated)) realtime_response_status_details_error_t *realtime_response_status_details_error_create(
    char *type,
    char *code
    ) {
    return realtime_response_status_details_error_create_internal (
        type,
        code
        );
}

void realtime_response_status_details_error_free(realtime_response_status_details_error_t *realtime_response_status_details_error) {
    if(NULL == realtime_response_status_details_error){
        return ;
    }
    if(realtime_response_status_details_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_response_status_details_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_response_status_details_error->type) {
        free(realtime_response_status_details_error->type);
        realtime_response_status_details_error->type = NULL;
    }
    if (realtime_response_status_details_error->code) {
        free(realtime_response_status_details_error->code);
        realtime_response_status_details_error->code = NULL;
    }
    free(realtime_response_status_details_error);
}

cJSON *realtime_response_status_details_error_convertToJSON(realtime_response_status_details_error_t *realtime_response_status_details_error) {
    cJSON *item = cJSON_CreateObject();

    // realtime_response_status_details_error->type
    if(realtime_response_status_details_error->type) {
    if(cJSON_AddStringToObject(item, "type", realtime_response_status_details_error->type) == NULL) {
    goto fail; //String
    }
    }


    // realtime_response_status_details_error->code
    if(realtime_response_status_details_error->code) {
    if(cJSON_AddStringToObject(item, "code", realtime_response_status_details_error->code) == NULL) {
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

realtime_response_status_details_error_t *realtime_response_status_details_error_parseFromJSON(cJSON *realtime_response_status_details_errorJSON){

    realtime_response_status_details_error_t *realtime_response_status_details_error_local_var = NULL;

    // realtime_response_status_details_error->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_response_status_details_errorJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // realtime_response_status_details_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(realtime_response_status_details_errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsString(code) && !cJSON_IsNull(code))
    {
    goto end; //String
    }
    }


    realtime_response_status_details_error_local_var = realtime_response_status_details_error_create_internal (
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        code && !cJSON_IsNull(code) ? strdup(code->valuestring) : NULL
        );

    return realtime_response_status_details_error_local_var;
end:
    return NULL;

}
