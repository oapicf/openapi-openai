#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "default_project_error_response.h"



static default_project_error_response_t *default_project_error_response_create_internal(
    int *code,
    char *message
    ) {
    default_project_error_response_t *default_project_error_response_local_var = malloc(sizeof(default_project_error_response_t));
    if (!default_project_error_response_local_var) {
        return NULL;
    }
    memset(default_project_error_response_local_var, 0, sizeof(default_project_error_response_t));
    default_project_error_response_local_var->_library_owned = 1;
    default_project_error_response_local_var->code = code;
    default_project_error_response_local_var->message = message;
    return default_project_error_response_local_var;
}

__attribute__((deprecated)) default_project_error_response_t *default_project_error_response_create(
    int *code,
    char *message
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    default_project_error_response_t *result = default_project_error_response_create_internal (
        code_copy,
        message
        );
    if (!result) {
        free(code_copy);
    }
    return result;
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
    if (default_project_error_response->code) {
        free(default_project_error_response->code);
        default_project_error_response->code = NULL;
    }
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
    if(cJSON_AddNumberToObject(item, "code", *default_project_error_response->code) == NULL) {
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

    // define the local variable for default_project_error_response->code
    int *code_local_var = NULL;

    char *message_local_str = NULL;

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
    code_local_var = malloc(sizeof(int));
    if(!code_local_var)
    {
        goto end;
    }
    *code_local_var = code->valuedouble;

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


    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    default_project_error_response_local_var = default_project_error_response_create_internal (
        code_local_var,
        message_local_str
        );

    if (!default_project_error_response_local_var) {
        goto end;
    }

    return default_project_error_response_local_var;
end:
    if (code_local_var) {
        free(code_local_var);
        code_local_var = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
