/*
 * admin_api_key_owner.h
 *
 * 
 */

#ifndef _admin_api_key_owner_H_
#define _admin_api_key_owner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct admin_api_key_owner_t admin_api_key_owner_t;




typedef struct admin_api_key_owner_t {
    char *type; // string
    char *id; // string
    char *name; // string
    long created_at; //numeric
    char *role; // string

    int _library_owned; // Is the library responsible for freeing this object?
} admin_api_key_owner_t;

__attribute__((deprecated)) admin_api_key_owner_t *admin_api_key_owner_create(
    char *type,
    char *id,
    char *name,
    long created_at,
    char *role
);

void admin_api_key_owner_free(admin_api_key_owner_t *admin_api_key_owner);

admin_api_key_owner_t *admin_api_key_owner_parseFromJSON(cJSON *admin_api_key_ownerJSON);

cJSON *admin_api_key_owner_convertToJSON(admin_api_key_owner_t *admin_api_key_owner);

#endif /* _admin_api_key_owner_H_ */

