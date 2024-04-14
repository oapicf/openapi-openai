#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "error.h"



error_t *error_create(
    char *code,
    char *message,
    char *param,
    char *type
    ) {
    error_t *error_local_var = malloc(sizeof(error_t));
    if (!error_local_var) {
        return NULL;
    }
    error_local_var->code = code;
    error_local_var->message = message;
    error_local_var->param = param;
    error_local_var->type = type;

    return error_local_var;
}


void error_free(error_t *error) {
    if(NULL == error){
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

    // error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(errorJSON, "code");
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsString(code))
    {
    goto end; //String
    }

    // error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(errorJSON, "message");
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }

    // error->param
    cJSON *param = cJSON_GetObjectItemCaseSensitive(errorJSON, "param");
    if (!param) {
        goto end;
    }

    
    if(!cJSON_IsString(param))
    {
    goto end; //String
    }

    // error->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(errorJSON, "type");
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }


    error_local_var = error_create (
        strdup(code->valuestring),
        strdup(message->valuestring),
        strdup(param->valuestring),
        strdup(type->valuestring)
        );

    return error_local_var;
end:
    return NULL;

}
