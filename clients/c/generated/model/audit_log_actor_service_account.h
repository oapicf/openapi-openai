/*
 * audit_log_actor_service_account.h
 *
 * The service account that performed the audit logged action.
 */

#ifndef _audit_log_actor_service_account_H_
#define _audit_log_actor_service_account_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_actor_service_account_t audit_log_actor_service_account_t;




typedef struct audit_log_actor_service_account_t {
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_actor_service_account_t;

__attribute__((deprecated)) audit_log_actor_service_account_t *audit_log_actor_service_account_create(
    char *id
);

void audit_log_actor_service_account_free(audit_log_actor_service_account_t *audit_log_actor_service_account);

audit_log_actor_service_account_t *audit_log_actor_service_account_parseFromJSON(cJSON *audit_log_actor_service_accountJSON);

cJSON *audit_log_actor_service_account_convertToJSON(audit_log_actor_service_account_t *audit_log_actor_service_account);

#endif /* _audit_log_actor_service_account_H_ */

