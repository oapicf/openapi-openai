/*
 * audit_log_user_added_data.h
 *
 * The payload used to add the user to the project.
 */

#ifndef _audit_log_user_added_data_H_
#define _audit_log_user_added_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_user_added_data_t audit_log_user_added_data_t;




typedef struct audit_log_user_added_data_t {
    char *role; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_user_added_data_t;

__attribute__((deprecated)) audit_log_user_added_data_t *audit_log_user_added_data_create(
    char *role
);

void audit_log_user_added_data_free(audit_log_user_added_data_t *audit_log_user_added_data);

audit_log_user_added_data_t *audit_log_user_added_data_parseFromJSON(cJSON *audit_log_user_added_dataJSON);

cJSON *audit_log_user_added_data_convertToJSON(audit_log_user_added_data_t *audit_log_user_added_data);

#endif /* _audit_log_user_added_data_H_ */

