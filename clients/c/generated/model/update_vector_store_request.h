/*
 * update_vector_store_request.h
 *
 * 
 */

#ifndef _update_vector_store_request_H_
#define _update_vector_store_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_vector_store_request_t update_vector_store_request_t;

#include "object.h"
#include "vector_store_expiration_after.h"



typedef struct update_vector_store_request_t {
    char *name; // string
    struct vector_store_expiration_after_t *expires_after; //model
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} update_vector_store_request_t;

__attribute__((deprecated)) update_vector_store_request_t *update_vector_store_request_create(
    char *name,
    vector_store_expiration_after_t *expires_after,
    object_t *metadata
);

void update_vector_store_request_free(update_vector_store_request_t *update_vector_store_request);

update_vector_store_request_t *update_vector_store_request_parseFromJSON(cJSON *update_vector_store_requestJSON);

cJSON *update_vector_store_request_convertToJSON(update_vector_store_request_t *update_vector_store_request);

#endif /* _update_vector_store_request_H_ */

