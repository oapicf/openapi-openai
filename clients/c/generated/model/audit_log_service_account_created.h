/*
 * audit_log_service_account_created.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _audit_log_service_account_created_H_
#define _audit_log_service_account_created_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_service_account_created_t audit_log_service_account_created_t;

#include "audit_log_service_account_created_data.h"



typedef struct audit_log_service_account_created_t {
    char *id; // string
    struct audit_log_service_account_created_data_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_service_account_created_t;

__attribute__((deprecated)) audit_log_service_account_created_t *audit_log_service_account_created_create(
    char *id,
    audit_log_service_account_created_data_t *data
);

void audit_log_service_account_created_free(audit_log_service_account_created_t *audit_log_service_account_created);

audit_log_service_account_created_t *audit_log_service_account_created_parseFromJSON(cJSON *audit_log_service_account_createdJSON);

cJSON *audit_log_service_account_created_convertToJSON(audit_log_service_account_created_t *audit_log_service_account_created);

#endif /* _audit_log_service_account_created_H_ */

