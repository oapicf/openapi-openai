/*
 * audit_log_actor.h
 *
 * The actor who performed the audit logged action.
 */

#ifndef _audit_log_actor_H_
#define _audit_log_actor_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_actor_t audit_log_actor_t;

#include "audit_log_actor_api_key.h"
#include "audit_log_actor_session.h"

// Enum TYPE for audit_log_actor

typedef enum  { openai_api_audit_log_actor_TYPE_NULL = 0, openai_api_audit_log_actor_TYPE_session, openai_api_audit_log_actor_TYPE_api_key } openai_api_audit_log_actor_TYPE_e;

char* audit_log_actor_type_ToString(openai_api_audit_log_actor_TYPE_e type);

openai_api_audit_log_actor_TYPE_e audit_log_actor_type_FromString(char* type);



typedef struct audit_log_actor_t {
    openai_api_audit_log_actor_TYPE_e type; //enum
    audit_log_actor_session_t *session; //object
    audit_log_actor_api_key_t *api_key; //object

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_actor_t;

__attribute__((deprecated)) audit_log_actor_t *audit_log_actor_create(
    openai_api_audit_log_actor_TYPE_e type,
    audit_log_actor_session_t *session,
    audit_log_actor_api_key_t *api_key
);

void audit_log_actor_free(audit_log_actor_t *audit_log_actor);

audit_log_actor_t *audit_log_actor_parseFromJSON(cJSON *audit_log_actorJSON);

cJSON *audit_log_actor_convertToJSON(audit_log_actor_t *audit_log_actor);

#endif /* _audit_log_actor_H_ */

