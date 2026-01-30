/*
 * audit_log_actor_api_key.h
 *
 * The API Key used to perform the audit logged action.
 */

#ifndef _audit_log_actor_api_key_H_
#define _audit_log_actor_api_key_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_actor_api_key_t audit_log_actor_api_key_t;

#include "audit_log_actor_service_account.h"
#include "audit_log_actor_user.h"

// Enum TYPE for audit_log_actor_api_key

typedef enum  { openai_api_audit_log_actor_api_key_TYPE_NULL = 0, openai_api_audit_log_actor_api_key_TYPE_user, openai_api_audit_log_actor_api_key_TYPE_service_account } openai_api_audit_log_actor_api_key_TYPE_e;

char* audit_log_actor_api_key_type_ToString(openai_api_audit_log_actor_api_key_TYPE_e type);

openai_api_audit_log_actor_api_key_TYPE_e audit_log_actor_api_key_type_FromString(char* type);



typedef struct audit_log_actor_api_key_t {
    char *id; // string
    openai_api_audit_log_actor_api_key_TYPE_e type; //enum
    struct audit_log_actor_user_t *user; //model
    struct audit_log_actor_service_account_t *service_account; //model

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_actor_api_key_t;

__attribute__((deprecated)) audit_log_actor_api_key_t *audit_log_actor_api_key_create(
    char *id,
    openai_api_audit_log_actor_api_key_TYPE_e type,
    audit_log_actor_user_t *user,
    audit_log_actor_service_account_t *service_account
);

void audit_log_actor_api_key_free(audit_log_actor_api_key_t *audit_log_actor_api_key);

audit_log_actor_api_key_t *audit_log_actor_api_key_parseFromJSON(cJSON *audit_log_actor_api_keyJSON);

cJSON *audit_log_actor_api_key_convertToJSON(audit_log_actor_api_key_t *audit_log_actor_api_key);

#endif /* _audit_log_actor_api_key_H_ */

