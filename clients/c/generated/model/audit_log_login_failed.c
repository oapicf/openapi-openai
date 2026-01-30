#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_login_failed.h"



static audit_log_login_failed_t *audit_log_login_failed_create_internal(
    char *error_code,
    char *error_message
    ) {
    audit_log_login_failed_t *audit_log_login_failed_local_var = malloc(sizeof(audit_log_login_failed_t));
    if (!audit_log_login_failed_local_var) {
        return NULL;
    }
    audit_log_login_failed_local_var->error_code = error_code;
    audit_log_login_failed_local_var->error_message = error_message;

    audit_log_login_failed_local_var->_library_owned = 1;
    return audit_log_login_failed_local_var;
}

__attribute__((deprecated)) audit_log_login_failed_t *audit_log_login_failed_create(
    char *error_code,
    char *error_message
    ) {
    return audit_log_login_failed_create_internal (
        error_code,
        error_message
        );
}

void audit_log_login_failed_free(audit_log_login_failed_t *audit_log_login_failed) {
    if(NULL == audit_log_login_failed){
        return ;
    }
    if(audit_log_login_failed->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_login_failed_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_login_failed->error_code) {
        free(audit_log_login_failed->error_code);
        audit_log_login_failed->error_code = NULL;
    }
    if (audit_log_login_failed->error_message) {
        free(audit_log_login_failed->error_message);
        audit_log_login_failed->error_message = NULL;
    }
    free(audit_log_login_failed);
}

cJSON *audit_log_login_failed_convertToJSON(audit_log_login_failed_t *audit_log_login_failed) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_login_failed->error_code
    if(audit_log_login_failed->error_code) {
    if(cJSON_AddStringToObject(item, "error_code", audit_log_login_failed->error_code) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_login_failed->error_message
    if(audit_log_login_failed->error_message) {
    if(cJSON_AddStringToObject(item, "error_message", audit_log_login_failed->error_message) == NULL) {
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

audit_log_login_failed_t *audit_log_login_failed_parseFromJSON(cJSON *audit_log_login_failedJSON){

    audit_log_login_failed_t *audit_log_login_failed_local_var = NULL;

    // audit_log_login_failed->error_code
    cJSON *error_code = cJSON_GetObjectItemCaseSensitive(audit_log_login_failedJSON, "error_code");
    if (cJSON_IsNull(error_code)) {
        error_code = NULL;
    }
    if (error_code) { 
    if(!cJSON_IsString(error_code) && !cJSON_IsNull(error_code))
    {
    goto end; //String
    }
    }

    // audit_log_login_failed->error_message
    cJSON *error_message = cJSON_GetObjectItemCaseSensitive(audit_log_login_failedJSON, "error_message");
    if (cJSON_IsNull(error_message)) {
        error_message = NULL;
    }
    if (error_message) { 
    if(!cJSON_IsString(error_message) && !cJSON_IsNull(error_message))
    {
    goto end; //String
    }
    }


    audit_log_login_failed_local_var = audit_log_login_failed_create_internal (
        error_code && !cJSON_IsNull(error_code) ? strdup(error_code->valuestring) : NULL,
        error_message && !cJSON_IsNull(error_message) ? strdup(error_message->valuestring) : NULL
        );

    return audit_log_login_failed_local_var;
end:
    return NULL;

}
