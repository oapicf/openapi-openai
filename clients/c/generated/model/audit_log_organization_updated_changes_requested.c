#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_organization_updated_changes_requested.h"



static audit_log_organization_updated_changes_requested_t *audit_log_organization_updated_changes_requested_create_internal(
    char *title,
    char *description,
    char *name,
    audit_log_organization_updated_changes_requested_settings_t *settings
    ) {
    audit_log_organization_updated_changes_requested_t *audit_log_organization_updated_changes_requested_local_var = malloc(sizeof(audit_log_organization_updated_changes_requested_t));
    if (!audit_log_organization_updated_changes_requested_local_var) {
        return NULL;
    }
    audit_log_organization_updated_changes_requested_local_var->title = title;
    audit_log_organization_updated_changes_requested_local_var->description = description;
    audit_log_organization_updated_changes_requested_local_var->name = name;
    audit_log_organization_updated_changes_requested_local_var->settings = settings;

    audit_log_organization_updated_changes_requested_local_var->_library_owned = 1;
    return audit_log_organization_updated_changes_requested_local_var;
}

__attribute__((deprecated)) audit_log_organization_updated_changes_requested_t *audit_log_organization_updated_changes_requested_create(
    char *title,
    char *description,
    char *name,
    audit_log_organization_updated_changes_requested_settings_t *settings
    ) {
    return audit_log_organization_updated_changes_requested_create_internal (
        title,
        description,
        name,
        settings
        );
}

void audit_log_organization_updated_changes_requested_free(audit_log_organization_updated_changes_requested_t *audit_log_organization_updated_changes_requested) {
    if(NULL == audit_log_organization_updated_changes_requested){
        return ;
    }
    if(audit_log_organization_updated_changes_requested->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_organization_updated_changes_requested_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_organization_updated_changes_requested->title) {
        free(audit_log_organization_updated_changes_requested->title);
        audit_log_organization_updated_changes_requested->title = NULL;
    }
    if (audit_log_organization_updated_changes_requested->description) {
        free(audit_log_organization_updated_changes_requested->description);
        audit_log_organization_updated_changes_requested->description = NULL;
    }
    if (audit_log_organization_updated_changes_requested->name) {
        free(audit_log_organization_updated_changes_requested->name);
        audit_log_organization_updated_changes_requested->name = NULL;
    }
    if (audit_log_organization_updated_changes_requested->settings) {
        audit_log_organization_updated_changes_requested_settings_free(audit_log_organization_updated_changes_requested->settings);
        audit_log_organization_updated_changes_requested->settings = NULL;
    }
    free(audit_log_organization_updated_changes_requested);
}

cJSON *audit_log_organization_updated_changes_requested_convertToJSON(audit_log_organization_updated_changes_requested_t *audit_log_organization_updated_changes_requested) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_organization_updated_changes_requested->title
    if(audit_log_organization_updated_changes_requested->title) {
    if(cJSON_AddStringToObject(item, "title", audit_log_organization_updated_changes_requested->title) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_organization_updated_changes_requested->description
    if(audit_log_organization_updated_changes_requested->description) {
    if(cJSON_AddStringToObject(item, "description", audit_log_organization_updated_changes_requested->description) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_organization_updated_changes_requested->name
    if(audit_log_organization_updated_changes_requested->name) {
    if(cJSON_AddStringToObject(item, "name", audit_log_organization_updated_changes_requested->name) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_organization_updated_changes_requested->settings
    if(audit_log_organization_updated_changes_requested->settings) {
    cJSON *settings_local_JSON = audit_log_organization_updated_changes_requested_settings_convertToJSON(audit_log_organization_updated_changes_requested->settings);
    if(settings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "settings", settings_local_JSON);
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

audit_log_organization_updated_changes_requested_t *audit_log_organization_updated_changes_requested_parseFromJSON(cJSON *audit_log_organization_updated_changes_requestedJSON){

    audit_log_organization_updated_changes_requested_t *audit_log_organization_updated_changes_requested_local_var = NULL;

    // define the local variable for audit_log_organization_updated_changes_requested->settings
    audit_log_organization_updated_changes_requested_settings_t *settings_local_nonprim = NULL;

    // audit_log_organization_updated_changes_requested->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(audit_log_organization_updated_changes_requestedJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // audit_log_organization_updated_changes_requested->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(audit_log_organization_updated_changes_requestedJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // audit_log_organization_updated_changes_requested->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audit_log_organization_updated_changes_requestedJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audit_log_organization_updated_changes_requested->settings
    cJSON *settings = cJSON_GetObjectItemCaseSensitive(audit_log_organization_updated_changes_requestedJSON, "settings");
    if (cJSON_IsNull(settings)) {
        settings = NULL;
    }
    if (settings) { 
    settings_local_nonprim = audit_log_organization_updated_changes_requested_settings_parseFromJSON(settings); //nonprimitive
    }


    audit_log_organization_updated_changes_requested_local_var = audit_log_organization_updated_changes_requested_create_internal (
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        settings ? settings_local_nonprim : NULL
        );

    return audit_log_organization_updated_changes_requested_local_var;
end:
    if (settings_local_nonprim) {
        audit_log_organization_updated_changes_requested_settings_free(settings_local_nonprim);
        settings_local_nonprim = NULL;
    }
    return NULL;

}
