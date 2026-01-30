/*
 * static_chunking_strategy_static.h
 *
 * 
 */

#ifndef _static_chunking_strategy_static_H_
#define _static_chunking_strategy_static_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct static_chunking_strategy_static_t static_chunking_strategy_static_t;




typedef struct static_chunking_strategy_static_t {
    int max_chunk_size_tokens; //numeric
    int chunk_overlap_tokens; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} static_chunking_strategy_static_t;

__attribute__((deprecated)) static_chunking_strategy_static_t *static_chunking_strategy_static_create(
    int max_chunk_size_tokens,
    int chunk_overlap_tokens
);

void static_chunking_strategy_static_free(static_chunking_strategy_static_t *static_chunking_strategy_static);

static_chunking_strategy_static_t *static_chunking_strategy_static_parseFromJSON(cJSON *static_chunking_strategy_staticJSON);

cJSON *static_chunking_strategy_static_convertToJSON(static_chunking_strategy_static_t *static_chunking_strategy_static);

#endif /* _static_chunking_strategy_static_H_ */

