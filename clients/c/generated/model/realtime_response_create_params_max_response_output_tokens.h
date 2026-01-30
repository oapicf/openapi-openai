/*
 * realtime_response_create_params_max_response_output_tokens.h
 *
 * Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or &#x60;inf&#x60; for the maximum available tokens for a given model. Defaults to &#x60;inf&#x60;. 
 */

#ifndef _realtime_response_create_params_max_response_output_tokens_H_
#define _realtime_response_create_params_max_response_output_tokens_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_response_create_params_max_response_output_tokens_t realtime_response_create_params_max_response_output_tokens_t;




typedef struct realtime_response_create_params_max_response_output_tokens_t {

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_response_create_params_max_response_output_tokens_t;

__attribute__((deprecated)) realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens_create(
);

void realtime_response_create_params_max_response_output_tokens_free(realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens);

realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens_parseFromJSON(cJSON *realtime_response_create_params_max_response_output_tokensJSON);

cJSON *realtime_response_create_params_max_response_output_tokens_convertToJSON(realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens);

#endif /* _realtime_response_create_params_max_response_output_tokens_H_ */

