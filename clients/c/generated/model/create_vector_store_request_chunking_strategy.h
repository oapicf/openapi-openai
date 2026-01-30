/*
 * create_vector_store_request_chunking_strategy.h
 *
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy. Only applicable if &#x60;file_ids&#x60; is non-empty.
 */

#ifndef _create_vector_store_request_chunking_strategy_H_
#define _create_vector_store_request_chunking_strategy_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_vector_store_request_chunking_strategy_t create_vector_store_request_chunking_strategy_t;

#include "auto_chunking_strategy_request_param.h"
#include "static_chunking_strategy.h"
#include "static_chunking_strategy_request_param.h"

// Enum TYPE for create_vector_store_request_chunking_strategy

typedef enum  { openai_api_create_vector_store_request_chunking_strategy_TYPE_NULL = 0, openai_api_create_vector_store_request_chunking_strategy_TYPE__auto, openai_api_create_vector_store_request_chunking_strategy_TYPE__static } openai_api_create_vector_store_request_chunking_strategy_TYPE_e;

char* create_vector_store_request_chunking_strategy_type_ToString(openai_api_create_vector_store_request_chunking_strategy_TYPE_e type);

openai_api_create_vector_store_request_chunking_strategy_TYPE_e create_vector_store_request_chunking_strategy_type_FromString(char* type);



typedef struct create_vector_store_request_chunking_strategy_t {
    openai_api_create_vector_store_request_chunking_strategy_TYPE_e type; //enum
    struct static_chunking_strategy_t *_static; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_vector_store_request_chunking_strategy_t;

__attribute__((deprecated)) create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy_create(
    openai_api_create_vector_store_request_chunking_strategy_TYPE_e type,
    static_chunking_strategy_t *_static
);

void create_vector_store_request_chunking_strategy_free(create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy);

create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy_parseFromJSON(cJSON *create_vector_store_request_chunking_strategyJSON);

cJSON *create_vector_store_request_chunking_strategy_convertToJSON(create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy);

#endif /* _create_vector_store_request_chunking_strategy_H_ */

