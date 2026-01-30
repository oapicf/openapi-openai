#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "default_project_error_response.h"



static default_project_error_response_t *default_project_error_response_create_internal(
    int code,
    char *message
    ) {
    default_project_error_response_t *default_project_error_response_local_var = malloc(sizeof(default_project_error_response_t));
    if (!default_project_error_response_local_var) {
        return NULL;
    }
    default_project_error_response_local_var->code = code;
    default_project_error_response_local_var->message = message;

    default_project_error_response_local_var->_library_owned = 1;
    return default_project_error_response_local_var;
}

__attribute__((deprecated)) default_project_error_response_t *default_project_error_response_create(
    int code,
    char *message
    ) {
    return default_project_error_response_create_internal (
        code,
        message
        );
}

void default_project_error_response_free(default_project_error_response_t *default_project_error_response) {
    if(NULL == default_project_error_response){
        return ;
    }
    if(default_project_error_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "default_project_error_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (default_project_error_response->message) {
        free(default_project_error_response->message);
        default_project_error_response->message = NULL;
    }
    free(default_project_error_response);
}

cJSON *default_project_error_response_convertToJSON(default_project_error_response_t *default_project_error_response) {
    cJSON *item = cJSON_CreateObject();

    // default_project_error_response->code
    if (!default_project_error_response->code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "code", default_project_error_response->code) == NULL) {
    goto fail; //Numeric
    }


    // default_project_error_response->message
    if (!default_project_error_response->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", default_project_error_response->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

default_project_error_response_t *default_project_error_response_parseFromJSON(cJSON *default_project_error_responseJSON){

    default_project_error_response_t *default_project_error_response_local_var = NULL;

    // default_project_error_response->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(default_project_error_responseJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }

    // default_project_error_response->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(default_project_error_responseJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }


    default_project_error_response_local_var = default_project_error_response_create_internal (
        code->valuedouble,
        strdup(message->valuestring)
        );

    return default_project_error_response_local_var;
end:
    return NULL;

}
