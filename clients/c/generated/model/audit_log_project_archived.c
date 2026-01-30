#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_project_archived.h"



static audit_log_project_archived_t *audit_log_project_archived_create_internal(
    char *id
    ) {
    audit_log_project_archived_t *audit_log_project_archived_local_var = malloc(sizeof(audit_log_project_archived_t));
    if (!audit_log_project_archived_local_var) {
        return NULL;
    }
    audit_log_project_archived_local_var->id = id;

    audit_log_project_archived_local_var->_library_owned = 1;
    return audit_log_project_archived_local_var;
}

__attribute__((deprecated)) audit_log_project_archived_t *audit_log_project_archived_create(
    char *id
    ) {
    return audit_log_project_archived_create_internal (
        id
        );
}

void audit_log_project_archived_free(audit_log_project_archived_t *audit_log_project_archived) {
    if(NULL == audit_log_project_archived){
        return ;
    }
    if(audit_log_project_archived->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_project_archived_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_project_archived->id) {
        free(audit_log_project_archived->id);
        audit_log_project_archived->id = NULL;
    }
    free(audit_log_project_archived);
}

cJSON *audit_log_project_archived_convertToJSON(audit_log_project_archived_t *audit_log_project_archived) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_project_archived->id
    if(audit_log_project_archived->id) {
    if(cJSON_AddStringToObject(item, "id", audit_log_project_archived->id) == NULL) {
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

audit_log_project_archived_t *audit_log_project_archived_parseFromJSON(cJSON *audit_log_project_archivedJSON){

    audit_log_project_archived_t *audit_log_project_archived_local_var = NULL;

    // audit_log_project_archived->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audit_log_project_archivedJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }


    audit_log_project_archived_local_var = audit_log_project_archived_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL
        );

    return audit_log_project_archived_local_var;
end:
    return NULL;

}
