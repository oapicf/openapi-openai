/*
 * chunking_strategy_request_param.h
 *
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 */

#ifndef _chunking_strategy_request_param_H_
#define _chunking_strategy_request_param_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chunking_strategy_request_param_t chunking_strategy_request_param_t;

#include "auto_chunking_strategy_request_param.h"
#include "static_chunking_strategy.h"
#include "static_chunking_strategy_request_param.h"

// Enum TYPE for chunking_strategy_request_param

typedef enum  { openai_api_chunking_strategy_request_param_TYPE_NULL = 0, openai_api_chunking_strategy_request_param_TYPE__auto, openai_api_chunking_strategy_request_param_TYPE__static } openai_api_chunking_strategy_request_param_TYPE_e;

char* chunking_strategy_request_param_type_ToString(openai_api_chunking_strategy_request_param_TYPE_e type);

openai_api_chunking_strategy_request_param_TYPE_e chunking_strategy_request_param_type_FromString(char* type);



typedef struct chunking_strategy_request_param_t {
    openai_api_chunking_strategy_request_param_TYPE_e type; //enum
    struct static_chunking_strategy_t *_static; //model

    int _library_owned; // Is the library responsible for freeing this object?
} chunking_strategy_request_param_t;

__attribute__((deprecated)) chunking_strategy_request_param_t *chunking_strategy_request_param_create(
    openai_api_chunking_strategy_request_param_TYPE_e type,
    static_chunking_strategy_t *_static
);

void chunking_strategy_request_param_free(chunking_strategy_request_param_t *chunking_strategy_request_param);

chunking_strategy_request_param_t *chunking_strategy_request_param_parseFromJSON(cJSON *chunking_strategy_request_paramJSON);

cJSON *chunking_strategy_request_param_convertToJSON(chunking_strategy_request_param_t *chunking_strategy_request_param);

#endif /* _chunking_strategy_request_param_H_ */

