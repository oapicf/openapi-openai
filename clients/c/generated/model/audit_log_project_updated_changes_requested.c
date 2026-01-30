#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_project_updated_changes_requested.h"



static audit_log_project_updated_changes_requested_t *audit_log_project_updated_changes_requested_create_internal(
    char *title
    ) {
    audit_log_project_updated_changes_requested_t *audit_log_project_updated_changes_requested_local_var = malloc(sizeof(audit_log_project_updated_changes_requested_t));
    if (!audit_log_project_updated_changes_requested_local_var) {
        return NULL;
    }
    audit_log_project_updated_changes_requested_local_var->title = title;

    audit_log_project_updated_changes_requested_local_var->_library_owned = 1;
    return audit_log_project_updated_changes_requested_local_var;
}

__attribute__((deprecated)) audit_log_project_updated_changes_requested_t *audit_log_project_updated_changes_requested_create(
    char *title
    ) {
    return audit_log_project_updated_changes_requested_create_internal (
        title
        );
}

void audit_log_project_updated_changes_requested_free(audit_log_project_updated_changes_requested_t *audit_log_project_updated_changes_requested) {
    if(NULL == audit_log_project_updated_changes_requested){
        return ;
    }
    if(audit_log_project_updated_changes_requested->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_project_updated_changes_requested_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_project_updated_changes_requested->title) {
        free(audit_log_project_updated_changes_requested->title);
        audit_log_project_updated_changes_requested->title = NULL;
    }
    free(audit_log_project_updated_changes_requested);
}

cJSON *audit_log_project_updated_changes_requested_convertToJSON(audit_log_project_updated_changes_requested_t *audit_log_project_updated_changes_requested) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_project_updated_changes_requested->title
    if(audit_log_project_updated_changes_requested->title) {
    if(cJSON_AddStringToObject(item, "title", audit_log_project_updated_changes_requested->title) == NULL) {
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

audit_log_project_updated_changes_requested_t *audit_log_project_updated_changes_requested_parseFromJSON(cJSON *audit_log_project_updated_changes_requestedJSON){

    audit_log_project_updated_changes_requested_t *audit_log_project_updated_changes_requested_local_var = NULL;

    // audit_log_project_updated_changes_requested->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(audit_log_project_updated_changes_requestedJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    audit_log_project_updated_changes_requested_local_var = audit_log_project_updated_changes_requested_create_internal (
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL
        );

    return audit_log_project_updated_changes_requested_local_var;
end:
    return NULL;

}
