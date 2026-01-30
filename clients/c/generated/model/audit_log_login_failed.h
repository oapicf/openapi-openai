/*
 * audit_log_login_failed.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _audit_log_login_failed_H_
#define _audit_log_login_failed_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_login_failed_t audit_log_login_failed_t;




typedef struct audit_log_login_failed_t {
    char *error_code; // string
    char *error_message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_login_failed_t;

__attribute__((deprecated)) audit_log_login_failed_t *audit_log_login_failed_create(
    char *error_code,
    char *error_message
);

void audit_log_login_failed_free(audit_log_login_failed_t *audit_log_login_failed);

audit_log_login_failed_t *audit_log_login_failed_parseFromJSON(cJSON *audit_log_login_failedJSON);

cJSON *audit_log_login_failed_convertToJSON(audit_log_login_failed_t *audit_log_login_failed);

#endif /* _audit_log_login_failed_H_ */

