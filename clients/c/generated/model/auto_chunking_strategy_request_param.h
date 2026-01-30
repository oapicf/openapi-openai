/*
 * auto_chunking_strategy_request_param.h
 *
 * The default strategy. This strategy currently uses a &#x60;max_chunk_size_tokens&#x60; of &#x60;800&#x60; and &#x60;chunk_overlap_tokens&#x60; of &#x60;400&#x60;.
 */

#ifndef _auto_chunking_strategy_request_param_H_
#define _auto_chunking_strategy_request_param_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct auto_chunking_strategy_request_param_t auto_chunking_strategy_request_param_t;


// Enum TYPE for auto_chunking_strategy_request_param

typedef enum  { openai_api_auto_chunking_strategy_request_param_TYPE_NULL = 0, openai_api_auto_chunking_strategy_request_param_TYPE__auto } openai_api_auto_chunking_strategy_request_param_TYPE_e;

char* auto_chunking_strategy_request_param_type_ToString(openai_api_auto_chunking_strategy_request_param_TYPE_e type);

openai_api_auto_chunking_strategy_request_param_TYPE_e auto_chunking_strategy_request_param_type_FromString(char* type);



typedef struct auto_chunking_strategy_request_param_t {
    openai_api_auto_chunking_strategy_request_param_TYPE_e type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} auto_chunking_strategy_request_param_t;

__attribute__((deprecated)) auto_chunking_strategy_request_param_t *auto_chunking_strategy_request_param_create(
    openai_api_auto_chunking_strategy_request_param_TYPE_e type
);

void auto_chunking_strategy_request_param_free(auto_chunking_strategy_request_param_t *auto_chunking_strategy_request_param);

auto_chunking_strategy_request_param_t *auto_chunking_strategy_request_param_parseFromJSON(cJSON *auto_chunking_strategy_request_paramJSON);

cJSON *auto_chunking_strategy_request_param_convertToJSON(auto_chunking_strategy_request_param_t *auto_chunking_strategy_request_param);

#endif /* _auto_chunking_strategy_request_param_H_ */

