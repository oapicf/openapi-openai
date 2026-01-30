/*
 * audit_log_invite_sent.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _audit_log_invite_sent_H_
#define _audit_log_invite_sent_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_invite_sent_t audit_log_invite_sent_t;

#include "audit_log_invite_sent_data.h"



typedef struct audit_log_invite_sent_t {
    char *id; // string
    struct audit_log_invite_sent_data_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_invite_sent_t;

__attribute__((deprecated)) audit_log_invite_sent_t *audit_log_invite_sent_create(
    char *id,
    audit_log_invite_sent_data_t *data
);

void audit_log_invite_sent_free(audit_log_invite_sent_t *audit_log_invite_sent);

audit_log_invite_sent_t *audit_log_invite_sent_parseFromJSON(cJSON *audit_log_invite_sentJSON);

cJSON *audit_log_invite_sent_convertToJSON(audit_log_invite_sent_t *audit_log_invite_sent);

#endif /* _audit_log_invite_sent_H_ */

