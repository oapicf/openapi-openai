/*
 * completion_usage.h
 *
 * Usage statistics for the completion request.
 */

#ifndef _completion_usage_H_
#define _completion_usage_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct completion_usage_t completion_usage_t;




typedef struct completion_usage_t {
    int completion_tokens; //numeric
    int prompt_tokens; //numeric
    int total_tokens; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} completion_usage_t;

__attribute__((deprecated)) completion_usage_t *completion_usage_create(
    int completion_tokens,
    int prompt_tokens,
    int total_tokens
);

void completion_usage_free(completion_usage_t *completion_usage);

completion_usage_t *completion_usage_parseFromJSON(cJSON *completion_usageJSON);

cJSON *completion_usage_convertToJSON(completion_usage_t *completion_usage);

#endif /* _completion_usage_H_ */

