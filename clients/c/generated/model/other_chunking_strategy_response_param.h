/*
 * other_chunking_strategy_response_param.h
 *
 * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the &#x60;chunking_strategy&#x60; concept was introduced in the API.
 */

#ifndef _other_chunking_strategy_response_param_H_
#define _other_chunking_strategy_response_param_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct other_chunking_strategy_response_param_t other_chunking_strategy_response_param_t;


// Enum TYPE for other_chunking_strategy_response_param

typedef enum  { openai_api_other_chunking_strategy_response_param_TYPE_NULL = 0, openai_api_other_chunking_strategy_response_param_TYPE_other } openai_api_other_chunking_strategy_response_param_TYPE_e;

char* other_chunking_strategy_response_param_type_ToString(openai_api_other_chunking_strategy_response_param_TYPE_e type);

openai_api_other_chunking_strategy_response_param_TYPE_e other_chunking_strategy_response_param_type_FromString(char* type);



typedef struct other_chunking_strategy_response_param_t {
    openai_api_other_chunking_strategy_response_param_TYPE_e type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} other_chunking_strategy_response_param_t;

__attribute__((deprecated)) other_chunking_strategy_response_param_t *other_chunking_strategy_response_param_create(
    openai_api_other_chunking_strategy_response_param_TYPE_e type
);

void other_chunking_strategy_response_param_free(other_chunking_strategy_response_param_t *other_chunking_strategy_response_param);

other_chunking_strategy_response_param_t *other_chunking_strategy_response_param_parseFromJSON(cJSON *other_chunking_strategy_response_paramJSON);

cJSON *other_chunking_strategy_response_param_convertToJSON(other_chunking_strategy_response_param_t *other_chunking_strategy_response_param);

#endif /* _other_chunking_strategy_response_param_H_ */

