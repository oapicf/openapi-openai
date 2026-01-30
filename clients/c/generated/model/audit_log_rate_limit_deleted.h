/*
 * audit_log_rate_limit_deleted.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _audit_log_rate_limit_deleted_H_
#define _audit_log_rate_limit_deleted_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_rate_limit_deleted_t audit_log_rate_limit_deleted_t;




typedef struct audit_log_rate_limit_deleted_t {
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_rate_limit_deleted_t;

__attribute__((deprecated)) audit_log_rate_limit_deleted_t *audit_log_rate_limit_deleted_create(
    char *id
);

void audit_log_rate_limit_deleted_free(audit_log_rate_limit_deleted_t *audit_log_rate_limit_deleted);

audit_log_rate_limit_deleted_t *audit_log_rate_limit_deleted_parseFromJSON(cJSON *audit_log_rate_limit_deletedJSON);

cJSON *audit_log_rate_limit_deleted_convertToJSON(audit_log_rate_limit_deleted_t *audit_log_rate_limit_deleted);

#endif /* _audit_log_rate_limit_deleted_H_ */

