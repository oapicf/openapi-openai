#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_project.h"



static audit_log_project_t *audit_log_project_create_internal(
    char *id,
    char *name
    ) {
    audit_log_project_t *audit_log_project_local_var = malloc(sizeof(audit_log_project_t));
    if (!audit_log_project_local_var) {
        return NULL;
    }
    audit_log_project_local_var->id = id;
    audit_log_project_local_var->name = name;

    audit_log_project_local_var->_library_owned = 1;
    return audit_log_project_local_var;
}

__attribute__((deprecated)) audit_log_project_t *audit_log_project_create(
    char *id,
    char *name
    ) {
    return audit_log_project_create_internal (
        id,
        name
        );
}

void audit_log_project_free(audit_log_project_t *audit_log_project) {
    if(NULL == audit_log_project){
        return ;
    }
    if(audit_log_project->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_project_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_project->id) {
        free(audit_log_project->id);
        audit_log_project->id = NULL;
    }
    if (audit_log_project->name) {
        free(audit_log_project->name);
        audit_log_project->name = NULL;
    }
    free(audit_log_project);
}

cJSON *audit_log_project_convertToJSON(audit_log_project_t *audit_log_project) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_project->id
    if(audit_log_project->id) {
    if(cJSON_AddStringToObject(item, "id", audit_log_project->id) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_project->name
    if(audit_log_project->name) {
    if(cJSON_AddStringToObject(item, "name", audit_log_project->name) == NULL) {
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

audit_log_project_t *audit_log_project_parseFromJSON(cJSON *audit_log_projectJSON){

    audit_log_project_t *audit_log_project_local_var = NULL;

    // audit_log_project->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audit_log_projectJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audit_log_project->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audit_log_projectJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    audit_log_project_local_var = audit_log_project_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return audit_log_project_local_var;
end:
    return NULL;

}
