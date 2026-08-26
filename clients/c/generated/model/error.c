#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "error.h"



static error_t *error_create_internal(
    char *code,
    char *message,
    char *param,
    char *type
    ) {
    error_t *error_local_var = malloc(sizeof(error_t));
    if (!error_local_var) {
        return NULL;
    }
    memset(error_local_var, 0, sizeof(error_t));
    error_local_var->_library_owned = 1;
    error_local_var->code = code;
    error_local_var->message = message;
    error_local_var->param = param;
    error_local_var->type = type;
    return error_local_var;
}

__attribute__((deprecated)) error_t *error_create(
    char *code,
    char *message,
    char *param,
    char *type
    ) {
    error_t *result = error_create_internal (
        code,
        message,
        param,
        type
        );
    if (!result) {
    }
    return result;
}

void error_free(error_t *error) {
    if(NULL == error){
        return ;
    }
    if(error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (error->code) {
        free(error->code);
        error->code = NULL;
    }
    if (error->message) {
        free(error->message);
        error->message = NULL;
    }
    if (error->param) {
        free(error->param);
        error->param = NULL;
    }
    if (error->type) {
        free(error->type);
        error->type = NULL;
    }
    free(error);
}

cJSON *error_convertToJSON(error_t *error) {
    cJSON *item = cJSON_CreateObject();

    // error->code
    if (!error->code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "code", error->code) == NULL) {
    goto fail; //String
    }


    // error->message
    if (!error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", error->message) == NULL) {
    goto fail; //String
    }


    // error->param
    if (!error->param) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "param", error->param) == NULL) {
    goto fail; //String
    }


    // error->type
    if (!error->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", error->type) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

error_t *error_parseFromJSON(cJSON *errorJSON){

    error_t *error_local_var = NULL;

    char *code_local_str = NULL;

    char *message_local_str = NULL;

    char *param_local_str = NULL;

    char *type_local_str = NULL;

    // error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsString(code))
    {
    goto end; //String
    }

    // error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(errorJSON, "message");
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

    // error->param
    cJSON *param = cJSON_GetObjectItemCaseSensitive(errorJSON, "param");
    if (cJSON_IsNull(param)) {
        param = NULL;
    }
    if (!param) {
        goto end;
    }

    
    if(!cJSON_IsString(param))
    {
    goto end; //String
    }

    // error->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(errorJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }


    if (code && !cJSON_IsNull(code)) code_local_str = strdup(code->valuestring);
    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);
    if (param && !cJSON_IsNull(param)) param_local_str = strdup(param->valuestring);
    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);

    error_local_var = error_create_internal (
        code_local_str,
        message_local_str,
        param_local_str,
        type_local_str
        );

    if (!error_local_var) {
        goto end;
    }

    return error_local_var;
end:
    if (code_local_str) {
        free(code_local_str);
        code_local_str = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    if (param_local_str) {
        free(param_local_str);
        param_local_str = NULL;
    }
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    return NULL;

}
