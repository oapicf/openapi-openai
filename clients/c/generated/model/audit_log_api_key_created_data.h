/*
 * audit_log_api_key_created_data.h
 *
 * The payload used to create the API key.
 */

#ifndef _audit_log_api_key_created_data_H_
#define _audit_log_api_key_created_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_api_key_created_data_t audit_log_api_key_created_data_t;




typedef struct audit_log_api_key_created_data_t {
    list_t *scopes; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_api_key_created_data_t;

__attribute__((deprecated)) audit_log_api_key_created_data_t *audit_log_api_key_created_data_create(
    list_t *scopes
);

void audit_log_api_key_created_data_free(audit_log_api_key_created_data_t *audit_log_api_key_created_data);

audit_log_api_key_created_data_t *audit_log_api_key_created_data_parseFromJSON(cJSON *audit_log_api_key_created_dataJSON);

cJSON *audit_log_api_key_created_data_convertToJSON(audit_log_api_key_created_data_t *audit_log_api_key_created_data);

#endif /* _audit_log_api_key_created_data_H_ */

