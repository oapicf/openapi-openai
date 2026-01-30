/*
 * admin_api_keys_create_request.h
 *
 * 
 */

#ifndef _admin_api_keys_create_request_H_
#define _admin_api_keys_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct admin_api_keys_create_request_t admin_api_keys_create_request_t;




typedef struct admin_api_keys_create_request_t {
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} admin_api_keys_create_request_t;

__attribute__((deprecated)) admin_api_keys_create_request_t *admin_api_keys_create_request_create(
    char *name
);

void admin_api_keys_create_request_free(admin_api_keys_create_request_t *admin_api_keys_create_request);

admin_api_keys_create_request_t *admin_api_keys_create_request_parseFromJSON(cJSON *admin_api_keys_create_requestJSON);

cJSON *admin_api_keys_create_request_convertToJSON(admin_api_keys_create_request_t *admin_api_keys_create_request);

#endif /* _admin_api_keys_create_request_H_ */

