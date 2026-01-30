#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_user_deleted.h"



static audit_log_user_deleted_t *audit_log_user_deleted_create_internal(
    char *id
    ) {
    audit_log_user_deleted_t *audit_log_user_deleted_local_var = malloc(sizeof(audit_log_user_deleted_t));
    if (!audit_log_user_deleted_local_var) {
        return NULL;
    }
    audit_log_user_deleted_local_var->id = id;

    audit_log_user_deleted_local_var->_library_owned = 1;
    return audit_log_user_deleted_local_var;
}

__attribute__((deprecated)) audit_log_user_deleted_t *audit_log_user_deleted_create(
    char *id
    ) {
    return audit_log_user_deleted_create_internal (
        id
        );
}

void audit_log_user_deleted_free(audit_log_user_deleted_t *audit_log_user_deleted) {
    if(NULL == audit_log_user_deleted){
        return ;
    }
    if(audit_log_user_deleted->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_user_deleted_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_user_deleted->id) {
        free(audit_log_user_deleted->id);
        audit_log_user_deleted->id = NULL;
    }
    free(audit_log_user_deleted);
}

cJSON *audit_log_user_deleted_convertToJSON(audit_log_user_deleted_t *audit_log_user_deleted) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_user_deleted->id
    if(audit_log_user_deleted->id) {
    if(cJSON_AddStringToObject(item, "id", audit_log_user_deleted->id) == NULL) {
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

audit_log_user_deleted_t *audit_log_user_deleted_parseFromJSON(cJSON *audit_log_user_deletedJSON){

    audit_log_user_deleted_t *audit_log_user_deleted_local_var = NULL;

    // audit_log_user_deleted->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audit_log_user_deletedJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }


    audit_log_user_deleted_local_var = audit_log_user_deleted_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL
        );

    return audit_log_user_deleted_local_var;
end:
    return NULL;

}
