/*
 * create_embedding_response_usage.h
 *
 * The usage information for the request.
 */

#ifndef _create_embedding_response_usage_H_
#define _create_embedding_response_usage_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_embedding_response_usage_t create_embedding_response_usage_t;




typedef struct create_embedding_response_usage_t {
    int prompt_tokens; //numeric
    int total_tokens; //numeric

} create_embedding_response_usage_t;

create_embedding_response_usage_t *create_embedding_response_usage_create(
    int prompt_tokens,
    int total_tokens
);

void create_embedding_response_usage_free(create_embedding_response_usage_t *create_embedding_response_usage);

create_embedding_response_usage_t *create_embedding_response_usage_parseFromJSON(cJSON *create_embedding_response_usageJSON);

cJSON *create_embedding_response_usage_convertToJSON(create_embedding_response_usage_t *create_embedding_response_usage);

#endif /* _create_embedding_response_usage_H_ */

