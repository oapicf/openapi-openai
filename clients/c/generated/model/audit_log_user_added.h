/*
 * audit_log_user_added.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _audit_log_user_added_H_
#define _audit_log_user_added_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_user_added_t audit_log_user_added_t;

#include "audit_log_user_added_data.h"



typedef struct audit_log_user_added_t {
    char *id; // string
    struct audit_log_user_added_data_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_user_added_t;

__attribute__((deprecated)) audit_log_user_added_t *audit_log_user_added_create(
    char *id,
    audit_log_user_added_data_t *data
);

void audit_log_user_added_free(audit_log_user_added_t *audit_log_user_added);

audit_log_user_added_t *audit_log_user_added_parseFromJSON(cJSON *audit_log_user_addedJSON);

cJSON *audit_log_user_added_convertToJSON(audit_log_user_added_t *audit_log_user_added);

#endif /* _audit_log_user_added_H_ */

