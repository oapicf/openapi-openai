/*
 * admin_api_key.h
 *
 * 
 */

#ifndef _admin_api_key_H_
#define _admin_api_key_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct admin_api_key_t admin_api_key_t;

#include "admin_api_key_owner.h"



typedef struct admin_api_key_t {
    char *object; // string
    char *id; // string
    char *name; // string
    char *redacted_value; // string
    char *value; // string
    long created_at; //numeric
    struct admin_api_key_owner_t *owner; //model

    int _library_owned; // Is the library responsible for freeing this object?
} admin_api_key_t;

__attribute__((deprecated)) admin_api_key_t *admin_api_key_create(
    char *object,
    char *id,
    char *name,
    char *redacted_value,
    char *value,
    long created_at,
    admin_api_key_owner_t *owner
);

void admin_api_key_free(admin_api_key_t *admin_api_key);

admin_api_key_t *admin_api_key_parseFromJSON(cJSON *admin_api_keyJSON);

cJSON *admin_api_key_convertToJSON(admin_api_key_t *admin_api_key);

#endif /* _admin_api_key_H_ */

