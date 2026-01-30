#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_service_account_updated_changes_requested.h"



static audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested_create_internal(
    char *role
    ) {
    audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested_local_var = malloc(sizeof(audit_log_service_account_updated_changes_requested_t));
    if (!audit_log_service_account_updated_changes_requested_local_var) {
        return NULL;
    }
    audit_log_service_account_updated_changes_requested_local_var->role = role;

    audit_log_service_account_updated_changes_requested_local_var->_library_owned = 1;
    return audit_log_service_account_updated_changes_requested_local_var;
}

__attribute__((deprecated)) audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested_create(
    char *role
    ) {
    return audit_log_service_account_updated_changes_requested_create_internal (
        role
        );
}

void audit_log_service_account_updated_changes_requested_free(audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested) {
    if(NULL == audit_log_service_account_updated_changes_requested){
        return ;
    }
    if(audit_log_service_account_updated_changes_requested->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_service_account_updated_changes_requested_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_service_account_updated_changes_requested->role) {
        free(audit_log_service_account_updated_changes_requested->role);
        audit_log_service_account_updated_changes_requested->role = NULL;
    }
    free(audit_log_service_account_updated_changes_requested);
}

cJSON *audit_log_service_account_updated_changes_requested_convertToJSON(audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_service_account_updated_changes_requested->role
    if(audit_log_service_account_updated_changes_requested->role) {
    if(cJSON_AddStringToObject(item, "role", audit_log_service_account_updated_changes_requested->role) == NULL) {
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

audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested_parseFromJSON(cJSON *audit_log_service_account_updated_changes_requestedJSON){

    audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested_local_var = NULL;

    // audit_log_service_account_updated_changes_requested->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(audit_log_service_account_updated_changes_requestedJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (role) { 
    if(!cJSON_IsString(role) && !cJSON_IsNull(role))
    {
    goto end; //String
    }
    }


    audit_log_service_account_updated_changes_requested_local_var = audit_log_service_account_updated_changes_requested_create_internal (
        role && !cJSON_IsNull(role) ? strdup(role->valuestring) : NULL
        );

    return audit_log_service_account_updated_changes_requested_local_var;
end:
    return NULL;

}
