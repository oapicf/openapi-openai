#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_error_error.h"



static realtime_server_event_error_error_t *realtime_server_event_error_error_create_internal(
    char *type,
    char *code,
    char *message,
    char *param,
    char *event_id
    ) {
    realtime_server_event_error_error_t *realtime_server_event_error_error_local_var = malloc(sizeof(realtime_server_event_error_error_t));
    if (!realtime_server_event_error_error_local_var) {
        return NULL;
    }
    realtime_server_event_error_error_local_var->type = type;
    realtime_server_event_error_error_local_var->code = code;
    realtime_server_event_error_error_local_var->message = message;
    realtime_server_event_error_error_local_var->param = param;
    realtime_server_event_error_error_local_var->event_id = event_id;

    realtime_server_event_error_error_local_var->_library_owned = 1;
    return realtime_server_event_error_error_local_var;
}

__attribute__((deprecated)) realtime_server_event_error_error_t *realtime_server_event_error_error_create(
    char *type,
    char *code,
    char *message,
    char *param,
    char *event_id
    ) {
    return realtime_server_event_error_error_create_internal (
        type,
        code,
        message,
        param,
        event_id
        );
}

void realtime_server_event_error_error_free(realtime_server_event_error_error_t *realtime_server_event_error_error) {
    if(NULL == realtime_server_event_error_error){
        return ;
    }
    if(realtime_server_event_error_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_error_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_error_error->type) {
        free(realtime_server_event_error_error->type);
        realtime_server_event_error_error->type = NULL;
    }
    if (realtime_server_event_error_error->code) {
        free(realtime_server_event_error_error->code);
        realtime_server_event_error_error->code = NULL;
    }
    if (realtime_server_event_error_error->message) {
        free(realtime_server_event_error_error->message);
        realtime_server_event_error_error->message = NULL;
    }
    if (realtime_server_event_error_error->param) {
        free(realtime_server_event_error_error->param);
        realtime_server_event_error_error->param = NULL;
    }
    if (realtime_server_event_error_error->event_id) {
        free(realtime_server_event_error_error->event_id);
        realtime_server_event_error_error->event_id = NULL;
    }
    free(realtime_server_event_error_error);
}

cJSON *realtime_server_event_error_error_convertToJSON(realtime_server_event_error_error_t *realtime_server_event_error_error) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_error_error->type
    if (!realtime_server_event_error_error->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_error_error->type) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_error_error->code
    if(realtime_server_event_error_error->code) {
    if(cJSON_AddStringToObject(item, "code", realtime_server_event_error_error->code) == NULL) {
    goto fail; //String
    }
    }


    // realtime_server_event_error_error->message
    if (!realtime_server_event_error_error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", realtime_server_event_error_error->message) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_error_error->param
    if(realtime_server_event_error_error->param) {
    if(cJSON_AddStringToObject(item, "param", realtime_server_event_error_error->param) == NULL) {
    goto fail; //String
    }
    }


    // realtime_server_event_error_error->event_id
    if(realtime_server_event_error_error->event_id) {
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_error_error->event_id) == NULL) {
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

realtime_server_event_error_error_t *realtime_server_event_error_error_parseFromJSON(cJSON *realtime_server_event_error_errorJSON){

    realtime_server_event_error_error_t *realtime_server_event_error_error_local_var = NULL;

    // realtime_server_event_error_error->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_error_errorJSON, "type");
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

    // realtime_server_event_error_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(realtime_server_event_error_errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsString(code) && !cJSON_IsNull(code))
    {
    goto end; //String
    }
    }

    // realtime_server_event_error_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(realtime_server_event_error_errorJSON, "message");
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

    // realtime_server_event_error_error->param
    cJSON *param = cJSON_GetObjectItemCaseSensitive(realtime_server_event_error_errorJSON, "param");
    if (cJSON_IsNull(param)) {
        param = NULL;
    }
    if (param) { 
    if(!cJSON_IsString(param) && !cJSON_IsNull(param))
    {
    goto end; //String
    }
    }

    // realtime_server_event_error_error->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_error_errorJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (event_id) { 
    if(!cJSON_IsString(event_id) && !cJSON_IsNull(event_id))
    {
    goto end; //String
    }
    }


    realtime_server_event_error_error_local_var = realtime_server_event_error_error_create_internal (
        strdup(type->valuestring),
        code && !cJSON_IsNull(code) ? strdup(code->valuestring) : NULL,
        strdup(message->valuestring),
        param && !cJSON_IsNull(param) ? strdup(param->valuestring) : NULL,
        event_id && !cJSON_IsNull(event_id) ? strdup(event_id->valuestring) : NULL
        );

    return realtime_server_event_error_error_local_var;
end:
    return NULL;

}
