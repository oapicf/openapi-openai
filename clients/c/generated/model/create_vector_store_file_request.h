/*
 * create_vector_store_file_request.h
 *
 * 
 */

#ifndef _create_vector_store_file_request_H_
#define _create_vector_store_file_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_vector_store_file_request_t create_vector_store_file_request_t;

#include "chunking_strategy_request_param.h"



typedef struct create_vector_store_file_request_t {
    char *file_id; // string
    struct chunking_strategy_request_param_t *chunking_strategy; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_vector_store_file_request_t;

__attribute__((deprecated)) create_vector_store_file_request_t *create_vector_store_file_request_create(
    char *file_id,
    chunking_strategy_request_param_t *chunking_strategy
);

void create_vector_store_file_request_free(create_vector_store_file_request_t *create_vector_store_file_request);

create_vector_store_file_request_t *create_vector_store_file_request_parseFromJSON(cJSON *create_vector_store_file_requestJSON);

cJSON *create_vector_store_file_request_convertToJSON(create_vector_store_file_request_t *create_vector_store_file_request);

#endif /* _create_vector_store_file_request_H_ */

