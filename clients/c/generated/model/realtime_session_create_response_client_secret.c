#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_session_create_response_client_secret.h"



static realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret_create_internal(
    char *value,
    int expires_at
    ) {
    realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret_local_var = malloc(sizeof(realtime_session_create_response_client_secret_t));
    if (!realtime_session_create_response_client_secret_local_var) {
        return NULL;
    }
    realtime_session_create_response_client_secret_local_var->value = value;
    realtime_session_create_response_client_secret_local_var->expires_at = expires_at;

    realtime_session_create_response_client_secret_local_var->_library_owned = 1;
    return realtime_session_create_response_client_secret_local_var;
}

__attribute__((deprecated)) realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret_create(
    char *value,
    int expires_at
    ) {
    return realtime_session_create_response_client_secret_create_internal (
        value,
        expires_at
        );
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
    if(cJSON_AddNumberToObject(item, "expires_at", realtime_session_create_response_client_secret->expires_at) == NULL) {
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
    }


    realtime_session_create_response_client_secret_local_var = realtime_session_create_response_client_secret_create_internal (
        value && !cJSON_IsNull(value) ? strdup(value->valuestring) : NULL,
        expires_at ? expires_at->valuedouble : 0
        );

    return realtime_session_create_response_client_secret_local_var;
end:
    return NULL;

}
