/*
 * vector_store_file_object_chunking_strategy.h
 *
 * The strategy used to chunk the file.
 */

#ifndef _vector_store_file_object_chunking_strategy_H_
#define _vector_store_file_object_chunking_strategy_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct vector_store_file_object_chunking_strategy_t vector_store_file_object_chunking_strategy_t;

#include "other_chunking_strategy_response_param.h"
#include "static_chunking_strategy.h"
#include "static_chunking_strategy_response_param.h"

// Enum TYPE for vector_store_file_object_chunking_strategy

typedef enum  { openai_api_vector_store_file_object_chunking_strategy_TYPE_NULL = 0, openai_api_vector_store_file_object_chunking_strategy_TYPE__static, openai_api_vector_store_file_object_chunking_strategy_TYPE_other } openai_api_vector_store_file_object_chunking_strategy_TYPE_e;

char* vector_store_file_object_chunking_strategy_type_ToString(openai_api_vector_store_file_object_chunking_strategy_TYPE_e type);

openai_api_vector_store_file_object_chunking_strategy_TYPE_e vector_store_file_object_chunking_strategy_type_FromString(char* type);



typedef struct vector_store_file_object_chunking_strategy_t {
    openai_api_vector_store_file_object_chunking_strategy_TYPE_e type; //enum
    struct static_chunking_strategy_t *_static; //model

    int _library_owned; // Is the library responsible for freeing this object?
} vector_store_file_object_chunking_strategy_t;

__attribute__((deprecated)) vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy_create(
    openai_api_vector_store_file_object_chunking_strategy_TYPE_e type,
    static_chunking_strategy_t *_static
);

void vector_store_file_object_chunking_strategy_free(vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy);

vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy_parseFromJSON(cJSON *vector_store_file_object_chunking_strategyJSON);

cJSON *vector_store_file_object_chunking_strategy_convertToJSON(vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy);

#endif /* _vector_store_file_object_chunking_strategy_H_ */

