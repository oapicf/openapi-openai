/*
 * audit_log_api_key_updated.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _audit_log_api_key_updated_H_
#define _audit_log_api_key_updated_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_api_key_updated_t audit_log_api_key_updated_t;

#include "audit_log_api_key_updated_changes_requested.h"



typedef struct audit_log_api_key_updated_t {
    char *id; // string
    struct audit_log_api_key_updated_changes_requested_t *changes_requested; //model

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_api_key_updated_t;

__attribute__((deprecated)) audit_log_api_key_updated_t *audit_log_api_key_updated_create(
    char *id,
    audit_log_api_key_updated_changes_requested_t *changes_requested
);

void audit_log_api_key_updated_free(audit_log_api_key_updated_t *audit_log_api_key_updated);

audit_log_api_key_updated_t *audit_log_api_key_updated_parseFromJSON(cJSON *audit_log_api_key_updatedJSON);

cJSON *audit_log_api_key_updated_convertToJSON(audit_log_api_key_updated_t *audit_log_api_key_updated);

#endif /* _audit_log_api_key_updated_H_ */

