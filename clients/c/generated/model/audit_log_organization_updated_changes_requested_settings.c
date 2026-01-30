#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_organization_updated_changes_requested_settings.h"



static audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings_create_internal(
    char *threads_ui_visibility,
    char *usage_dashboard_visibility
    ) {
    audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings_local_var = malloc(sizeof(audit_log_organization_updated_changes_requested_settings_t));
    if (!audit_log_organization_updated_changes_requested_settings_local_var) {
        return NULL;
    }
    audit_log_organization_updated_changes_requested_settings_local_var->threads_ui_visibility = threads_ui_visibility;
    audit_log_organization_updated_changes_requested_settings_local_var->usage_dashboard_visibility = usage_dashboard_visibility;

    audit_log_organization_updated_changes_requested_settings_local_var->_library_owned = 1;
    return audit_log_organization_updated_changes_requested_settings_local_var;
}

__attribute__((deprecated)) audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings_create(
    char *threads_ui_visibility,
    char *usage_dashboard_visibility
    ) {
    return audit_log_organization_updated_changes_requested_settings_create_internal (
        threads_ui_visibility,
        usage_dashboard_visibility
        );
}

void audit_log_organization_updated_changes_requested_settings_free(audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings) {
    if(NULL == audit_log_organization_updated_changes_requested_settings){
        return ;
    }
    if(audit_log_organization_updated_changes_requested_settings->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_organization_updated_changes_requested_settings_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_organization_updated_changes_requested_settings->threads_ui_visibility) {
        free(audit_log_organization_updated_changes_requested_settings->threads_ui_visibility);
        audit_log_organization_updated_changes_requested_settings->threads_ui_visibility = NULL;
    }
    if (audit_log_organization_updated_changes_requested_settings->usage_dashboard_visibility) {
        free(audit_log_organization_updated_changes_requested_settings->usage_dashboard_visibility);
        audit_log_organization_updated_changes_requested_settings->usage_dashboard_visibility = NULL;
    }
    free(audit_log_organization_updated_changes_requested_settings);
}

cJSON *audit_log_organization_updated_changes_requested_settings_convertToJSON(audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_organization_updated_changes_requested_settings->threads_ui_visibility
    if(audit_log_organization_updated_changes_requested_settings->threads_ui_visibility) {
    if(cJSON_AddStringToObject(item, "threads_ui_visibility", audit_log_organization_updated_changes_requested_settings->threads_ui_visibility) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_organization_updated_changes_requested_settings->usage_dashboard_visibility
    if(audit_log_organization_updated_changes_requested_settings->usage_dashboard_visibility) {
    if(cJSON_AddStringToObject(item, "usage_dashboard_visibility", audit_log_organization_updated_changes_requested_settings->usage_dashboard_visibility) == NULL) {
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

audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings_parseFromJSON(cJSON *audit_log_organization_updated_changes_requested_settingsJSON){

    audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings_local_var = NULL;

    // audit_log_organization_updated_changes_requested_settings->threads_ui_visibility
    cJSON *threads_ui_visibility = cJSON_GetObjectItemCaseSensitive(audit_log_organization_updated_changes_requested_settingsJSON, "threads_ui_visibility");
    if (cJSON_IsNull(threads_ui_visibility)) {
        threads_ui_visibility = NULL;
    }
    if (threads_ui_visibility) { 
    if(!cJSON_IsString(threads_ui_visibility) && !cJSON_IsNull(threads_ui_visibility))
    {
    goto end; //String
    }
    }

    // audit_log_organization_updated_changes_requested_settings->usage_dashboard_visibility
    cJSON *usage_dashboard_visibility = cJSON_GetObjectItemCaseSensitive(audit_log_organization_updated_changes_requested_settingsJSON, "usage_dashboard_visibility");
    if (cJSON_IsNull(usage_dashboard_visibility)) {
        usage_dashboard_visibility = NULL;
    }
    if (usage_dashboard_visibility) { 
    if(!cJSON_IsString(usage_dashboard_visibility) && !cJSON_IsNull(usage_dashboard_visibility))
    {
    goto end; //String
    }
    }


    audit_log_organization_updated_changes_requested_settings_local_var = audit_log_organization_updated_changes_requested_settings_create_internal (
        threads_ui_visibility && !cJSON_IsNull(threads_ui_visibility) ? strdup(threads_ui_visibility->valuestring) : NULL,
        usage_dashboard_visibility && !cJSON_IsNull(usage_dashboard_visibility) ? strdup(usage_dashboard_visibility->valuestring) : NULL
        );

    return audit_log_organization_updated_changes_requested_settings_local_var;
end:
    return NULL;

}
