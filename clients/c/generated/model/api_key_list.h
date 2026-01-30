/*
 * api_key_list.h
 *
 * 
 */

#ifndef _api_key_list_H_
#define _api_key_list_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct api_key_list_t api_key_list_t;

#include "admin_api_key.h"



typedef struct api_key_list_t {
    char *object; // string
    list_t *data; //nonprimitive container
    int has_more; //boolean
    char *first_id; // string
    char *last_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} api_key_list_t;

__attribute__((deprecated)) api_key_list_t *api_key_list_create(
    char *object,
    list_t *data,
    int has_more,
    char *first_id,
    char *last_id
);

void api_key_list_free(api_key_list_t *api_key_list);

api_key_list_t *api_key_list_parseFromJSON(cJSON *api_key_listJSON);

cJSON *api_key_list_convertToJSON(api_key_list_t *api_key_list);

#endif /* _api_key_list_H_ */

