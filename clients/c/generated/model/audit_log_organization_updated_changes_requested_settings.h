/*
 * audit_log_organization_updated_changes_requested_settings.h
 *
 * 
 */

#ifndef _audit_log_organization_updated_changes_requested_settings_H_
#define _audit_log_organization_updated_changes_requested_settings_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_organization_updated_changes_requested_settings_t audit_log_organization_updated_changes_requested_settings_t;




typedef struct audit_log_organization_updated_changes_requested_settings_t {
    char *threads_ui_visibility; // string
    char *usage_dashboard_visibility; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_organization_updated_changes_requested_settings_t;

__attribute__((deprecated)) audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings_create(
    char *threads_ui_visibility,
    char *usage_dashboard_visibility
);

void audit_log_organization_updated_changes_requested_settings_free(audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings);

audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings_parseFromJSON(cJSON *audit_log_organization_updated_changes_requested_settingsJSON);

cJSON *audit_log_organization_updated_changes_requested_settings_convertToJSON(audit_log_organization_updated_changes_requested_settings_t *audit_log_organization_updated_changes_requested_settings);

#endif /* _audit_log_organization_updated_changes_requested_settings_H_ */

