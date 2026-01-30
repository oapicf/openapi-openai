/*
 * audit_log_actor_session.h
 *
 * The session in which the audit logged action was performed.
 */

#ifndef _audit_log_actor_session_H_
#define _audit_log_actor_session_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_actor_session_t audit_log_actor_session_t;

#include "audit_log_actor_user.h"



typedef struct audit_log_actor_session_t {
    struct audit_log_actor_user_t *user; //model
    char *ip_address; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_actor_session_t;

__attribute__((deprecated)) audit_log_actor_session_t *audit_log_actor_session_create(
    audit_log_actor_user_t *user,
    char *ip_address
);

void audit_log_actor_session_free(audit_log_actor_session_t *audit_log_actor_session);

audit_log_actor_session_t *audit_log_actor_session_parseFromJSON(cJSON *audit_log_actor_sessionJSON);

cJSON *audit_log_actor_session_convertToJSON(audit_log_actor_session_t *audit_log_actor_session);

#endif /* _audit_log_actor_session_H_ */

