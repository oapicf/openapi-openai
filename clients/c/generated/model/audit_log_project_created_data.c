#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_project_created_data.h"



static audit_log_project_created_data_t *audit_log_project_created_data_create_internal(
    char *name,
    char *title
    ) {
    audit_log_project_created_data_t *audit_log_project_created_data_local_var = malloc(sizeof(audit_log_project_created_data_t));
    if (!audit_log_project_created_data_local_var) {
        return NULL;
    }
    audit_log_project_created_data_local_var->name = name;
    audit_log_project_created_data_local_var->title = title;

    audit_log_project_created_data_local_var->_library_owned = 1;
    return audit_log_project_created_data_local_var;
}

__attribute__((deprecated)) audit_log_project_created_data_t *audit_log_project_created_data_create(
    char *name,
    char *title
    ) {
    return audit_log_project_created_data_create_internal (
        name,
        title
        );
}

void audit_log_project_created_data_free(audit_log_project_created_data_t *audit_log_project_created_data) {
    if(NULL == audit_log_project_created_data){
        return ;
    }
    if(audit_log_project_created_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_project_created_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_project_created_data->name) {
        free(audit_log_project_created_data->name);
        audit_log_project_created_data->name = NULL;
    }
    if (audit_log_project_created_data->title) {
        free(audit_log_project_created_data->title);
        audit_log_project_created_data->title = NULL;
    }
    free(audit_log_project_created_data);
}

cJSON *audit_log_project_created_data_convertToJSON(audit_log_project_created_data_t *audit_log_project_created_data) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_project_created_data->name
    if(audit_log_project_created_data->name) {
    if(cJSON_AddStringToObject(item, "name", audit_log_project_created_data->name) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_project_created_data->title
    if(audit_log_project_created_data->title) {
    if(cJSON_AddStringToObject(item, "title", audit_log_project_created_data->title) == NULL) {
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

audit_log_project_created_data_t *audit_log_project_created_data_parseFromJSON(cJSON *audit_log_project_created_dataJSON){

    audit_log_project_created_data_t *audit_log_project_created_data_local_var = NULL;

    // audit_log_project_created_data->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audit_log_project_created_dataJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audit_log_project_created_data->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(audit_log_project_created_dataJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    audit_log_project_created_data_local_var = audit_log_project_created_data_create_internal (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL
        );

    return audit_log_project_created_data_local_var;
end:
    return NULL;

}
