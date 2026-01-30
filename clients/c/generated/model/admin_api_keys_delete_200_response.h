/*
 * admin_api_keys_delete_200_response.h
 *
 * 
 */

#ifndef _admin_api_keys_delete_200_response_H_
#define _admin_api_keys_delete_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct admin_api_keys_delete_200_response_t admin_api_keys_delete_200_response_t;




typedef struct admin_api_keys_delete_200_response_t {
    char *id; // string
    char *object; // string
    int deleted; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} admin_api_keys_delete_200_response_t;

__attribute__((deprecated)) admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response_create(
    char *id,
    char *object,
    int deleted
);

void admin_api_keys_delete_200_response_free(admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response);

admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response_parseFromJSON(cJSON *admin_api_keys_delete_200_responseJSON);

cJSON *admin_api_keys_delete_200_response_convertToJSON(admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response);

#endif /* _admin_api_keys_delete_200_response_H_ */

