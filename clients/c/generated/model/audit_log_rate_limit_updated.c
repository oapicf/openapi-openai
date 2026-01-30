#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_rate_limit_updated.h"



static audit_log_rate_limit_updated_t *audit_log_rate_limit_updated_create_internal(
    char *id,
    audit_log_rate_limit_updated_changes_requested_t *changes_requested
    ) {
    audit_log_rate_limit_updated_t *audit_log_rate_limit_updated_local_var = malloc(sizeof(audit_log_rate_limit_updated_t));
    if (!audit_log_rate_limit_updated_local_var) {
        return NULL;
    }
    audit_log_rate_limit_updated_local_var->id = id;
    audit_log_rate_limit_updated_local_var->changes_requested = changes_requested;

    audit_log_rate_limit_updated_local_var->_library_owned = 1;
    return audit_log_rate_limit_updated_local_var;
}

__attribute__((deprecated)) audit_log_rate_limit_updated_t *audit_log_rate_limit_updated_create(
    char *id,
    audit_log_rate_limit_updated_changes_requested_t *changes_requested
    ) {
    return audit_log_rate_limit_updated_create_internal (
        id,
        changes_requested
        );
}

void audit_log_rate_limit_updated_free(audit_log_rate_limit_updated_t *audit_log_rate_limit_updated) {
    if(NULL == audit_log_rate_limit_updated){
        return ;
    }
    if(audit_log_rate_limit_updated->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_rate_limit_updated_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_rate_limit_updated->id) {
        free(audit_log_rate_limit_updated->id);
        audit_log_rate_limit_updated->id = NULL;
    }
    if (audit_log_rate_limit_updated->changes_requested) {
        audit_log_rate_limit_updated_changes_requested_free(audit_log_rate_limit_updated->changes_requested);
        audit_log_rate_limit_updated->changes_requested = NULL;
    }
    free(audit_log_rate_limit_updated);
}

cJSON *audit_log_rate_limit_updated_convertToJSON(audit_log_rate_limit_updated_t *audit_log_rate_limit_updated) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_rate_limit_updated->id
    if(audit_log_rate_limit_updated->id) {
    if(cJSON_AddStringToObject(item, "id", audit_log_rate_limit_updated->id) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_rate_limit_updated->changes_requested
    if(audit_log_rate_limit_updated->changes_requested) {
    cJSON *changes_requested_local_JSON = audit_log_rate_limit_updated_changes_requested_convertToJSON(audit_log_rate_limit_updated->changes_requested);
    if(changes_requested_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "changes_requested", changes_requested_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audit_log_rate_limit_updated_t *audit_log_rate_limit_updated_parseFromJSON(cJSON *audit_log_rate_limit_updatedJSON){

    audit_log_rate_limit_updated_t *audit_log_rate_limit_updated_local_var = NULL;

    // define the local variable for audit_log_rate_limit_updated->changes_requested
    audit_log_rate_limit_updated_changes_requested_t *changes_requested_local_nonprim = NULL;

    // audit_log_rate_limit_updated->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audit_log_rate_limit_updatedJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audit_log_rate_limit_updated->changes_requested
    cJSON *changes_requested = cJSON_GetObjectItemCaseSensitive(audit_log_rate_limit_updatedJSON, "changes_requested");
    if (cJSON_IsNull(changes_requested)) {
        changes_requested = NULL;
    }
    if (changes_requested) { 
    changes_requested_local_nonprim = audit_log_rate_limit_updated_changes_requested_parseFromJSON(changes_requested); //nonprimitive
    }


    audit_log_rate_limit_updated_local_var = audit_log_rate_limit_updated_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        changes_requested ? changes_requested_local_nonprim : NULL
        );

    return audit_log_rate_limit_updated_local_var;
end:
    if (changes_requested_local_nonprim) {
        audit_log_rate_limit_updated_changes_requested_free(changes_requested_local_nonprim);
        changes_requested_local_nonprim = NULL;
    }
    return NULL;

}
