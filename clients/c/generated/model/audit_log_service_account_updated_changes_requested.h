/*
 * audit_log_service_account_updated_changes_requested.h
 *
 * The payload used to updated the service account.
 */

#ifndef _audit_log_service_account_updated_changes_requested_H_
#define _audit_log_service_account_updated_changes_requested_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_service_account_updated_changes_requested_t audit_log_service_account_updated_changes_requested_t;




typedef struct audit_log_service_account_updated_changes_requested_t {
    char *role; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_service_account_updated_changes_requested_t;

__attribute__((deprecated)) audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested_create(
    char *role
);

void audit_log_service_account_updated_changes_requested_free(audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested);

audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested_parseFromJSON(cJSON *audit_log_service_account_updated_changes_requestedJSON);

cJSON *audit_log_service_account_updated_changes_requested_convertToJSON(audit_log_service_account_updated_changes_requested_t *audit_log_service_account_updated_changes_requested);

#endif /* _audit_log_service_account_updated_changes_requested_H_ */

