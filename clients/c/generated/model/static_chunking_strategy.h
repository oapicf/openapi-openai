/*
 * static_chunking_strategy.h
 *
 * 
 */

#ifndef _static_chunking_strategy_H_
#define _static_chunking_strategy_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct static_chunking_strategy_t static_chunking_strategy_t;

#include "static_chunking_strategy_static.h"

// Enum TYPE for static_chunking_strategy

typedef enum  { openai_api_static_chunking_strategy_TYPE_NULL = 0, openai_api_static_chunking_strategy_TYPE__static } openai_api_static_chunking_strategy_TYPE_e;

char* static_chunking_strategy_type_ToString(openai_api_static_chunking_strategy_TYPE_e type);

openai_api_static_chunking_strategy_TYPE_e static_chunking_strategy_type_FromString(char* type);



typedef struct static_chunking_strategy_t {
    openai_api_static_chunking_strategy_TYPE_e type; //enum
    struct static_chunking_strategy_static_t *_static; //model

    int _library_owned; // Is the library responsible for freeing this object?
} static_chunking_strategy_t;

__attribute__((deprecated)) static_chunking_strategy_t *static_chunking_strategy_create(
    openai_api_static_chunking_strategy_TYPE_e type,
    static_chunking_strategy_static_t *_static
);

void static_chunking_strategy_free(static_chunking_strategy_t *static_chunking_strategy);

static_chunking_strategy_t *static_chunking_strategy_parseFromJSON(cJSON *static_chunking_strategyJSON);

cJSON *static_chunking_strategy_convertToJSON(static_chunking_strategy_t *static_chunking_strategy);

#endif /* _static_chunking_strategy_H_ */

