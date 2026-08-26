#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_session_create_response_client_secret.h"



static realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret_create_internal(
    char *value,
    int *expires_at
    ) {
    realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret_local_var = malloc(sizeof(realtime_session_create_response_client_secret_t));
    if (!realtime_session_create_response_client_secret_local_var) {
        return NULL;
    }
    memset(realtime_session_create_response_client_secret_local_var, 0, sizeof(realtime_session_create_response_client_secret_t));
    realtime_session_create_response_client_secret_local_var->_library_owned = 1;
    realtime_session_create_response_client_secret_local_var->value = value;
    realtime_session_create_response_client_secret_local_var->expires_at = expires_at;
    return realtime_session_create_response_client_secret_local_var;
}

__attribute__((deprecated)) realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret_create(
    char *value,
    int *expires_at
    ) {
    int *expires_at_copy = NULL;
    if (expires_at) {
        expires_at_copy = malloc(sizeof(int));
        if (expires_at_copy) *expires_at_copy = *expires_at;
    }
    realtime_session_create_response_client_secret_t *result = realtime_session_create_response_client_secret_create_internal (
        value,
        expires_at_copy
        );
    if (!result) {
        free(expires_at_copy);
    }
    return result;
}

void realtime_session_create_response_client_secret_free(realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret) {
    if(NULL == realtime_session_create_response_client_secret){
        return ;
    }
    if(realtime_session_create_response_client_secret->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_session_create_response_client_secret_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_session_create_response_client_secret->value) {
        free(realtime_session_create_response_client_secret->value);
        realtime_session_create_response_client_secret->value = NULL;
    }
    if (realtime_session_create_response_client_secret->expires_at) {
        free(realtime_session_create_response_client_secret->expires_at);
        realtime_session_create_response_client_secret->expires_at = NULL;
    }
    free(realtime_session_create_response_client_secret);
}

cJSON *realtime_session_create_response_client_secret_convertToJSON(realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret) {
    cJSON *item = cJSON_CreateObject();

    // realtime_session_create_response_client_secret->value
    if(realtime_session_create_response_client_secret->value) {
    if(cJSON_AddStringToObject(item, "value", realtime_session_create_response_client_secret->value) == NULL) {
    goto fail; //String
    }
    }


    // realtime_session_create_response_client_secret->expires_at
    if(realtime_session_create_response_client_secret->expires_at) {
    if(cJSON_AddNumberToObject(item, "expires_at", *realtime_session_create_response_client_secret->expires_at) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret_parseFromJSON(cJSON *realtime_session_create_response_client_secretJSON){

    realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret_local_var = NULL;

    char *value_local_str = NULL;

    // define the local variable for realtime_session_create_response_client_secret->expires_at
    int *expires_at_local_var = NULL;

    // realtime_session_create_response_client_secret->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(realtime_session_create_response_client_secretJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }

    // realtime_session_create_response_client_secret->expires_at
    cJSON *expires_at = cJSON_GetObjectItemCaseSensitive(realtime_session_create_response_client_secretJSON, "expires_at");
    if (cJSON_IsNull(expires_at)) {
        expires_at = NULL;
    }
    if (expires_at) { 
    if(!cJSON_IsNumber(expires_at))
    {
    goto end; //Numeric
    }
    expires_at_local_var = malloc(sizeof(int));
    if(!expires_at_local_var)
    {
        goto end;
    }
    *expires_at_local_var = expires_at->valuedouble;
    }


    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    realtime_session_create_response_client_secret_local_var = realtime_session_create_response_client_secret_create_internal (
        value_local_str,
        expires_at_local_var
        );

    if (!realtime_session_create_response_client_secret_local_var) {
        goto end;
    }

    return realtime_session_create_response_client_secret_local_var;
end:
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    if (expires_at_local_var) {
        free(expires_at_local_var);
        expires_at_local_var = NULL;
    }
    return NULL;

}
