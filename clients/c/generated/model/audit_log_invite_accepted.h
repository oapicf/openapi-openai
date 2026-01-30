/*
 * audit_log_invite_accepted.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _audit_log_invite_accepted_H_
#define _audit_log_invite_accepted_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_invite_accepted_t audit_log_invite_accepted_t;




typedef struct audit_log_invite_accepted_t {
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_invite_accepted_t;

__attribute__((deprecated)) audit_log_invite_accepted_t *audit_log_invite_accepted_create(
    char *id
);

void audit_log_invite_accepted_free(audit_log_invite_accepted_t *audit_log_invite_accepted);

audit_log_invite_accepted_t *audit_log_invite_accepted_parseFromJSON(cJSON *audit_log_invite_acceptedJSON);

cJSON *audit_log_invite_accepted_convertToJSON(audit_log_invite_accepted_t *audit_log_invite_accepted);

#endif /* _audit_log_invite_accepted_H_ */

