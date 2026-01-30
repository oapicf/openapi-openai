/*
 * create_vector_store_request.h
 *
 * 
 */

#ifndef _create_vector_store_request_H_
#define _create_vector_store_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_vector_store_request_t create_vector_store_request_t;

#include "create_vector_store_request_chunking_strategy.h"
#include "object.h"
#include "vector_store_expiration_after.h"



typedef struct create_vector_store_request_t {
    list_t *file_ids; //primitive container
    char *name; // string
    struct vector_store_expiration_after_t *expires_after; //model
    struct create_vector_store_request_chunking_strategy_t *chunking_strategy; //model
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} create_vector_store_request_t;

__attribute__((deprecated)) create_vector_store_request_t *create_vector_store_request_create(
    list_t *file_ids,
    char *name,
    vector_store_expiration_after_t *expires_after,
    create_vector_store_request_chunking_strategy_t *chunking_strategy,
    object_t *metadata
);

void create_vector_store_request_free(create_vector_store_request_t *create_vector_store_request);

create_vector_store_request_t *create_vector_store_request_parseFromJSON(cJSON *create_vector_store_requestJSON);

cJSON *create_vector_store_request_convertToJSON(create_vector_store_request_t *create_vector_store_request);

#endif /* _create_vector_store_request_H_ */

