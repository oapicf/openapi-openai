/*
 * audit_log_actor_user.h
 *
 * The user who performed the audit logged action.
 */

#ifndef _audit_log_actor_user_H_
#define _audit_log_actor_user_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_actor_user_t audit_log_actor_user_t;




typedef struct audit_log_actor_user_t {
    char *id; // string
    char *email; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_actor_user_t;

__attribute__((deprecated)) audit_log_actor_user_t *audit_log_actor_user_create(
    char *id,
    char *email
);

void audit_log_actor_user_free(audit_log_actor_user_t *audit_log_actor_user);

audit_log_actor_user_t *audit_log_actor_user_parseFromJSON(cJSON *audit_log_actor_userJSON);

cJSON *audit_log_actor_user_convertToJSON(audit_log_actor_user_t *audit_log_actor_user);

#endif /* _audit_log_actor_user_H_ */

