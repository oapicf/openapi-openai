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

#include "completion_usage_completion_tokens_details.h"
#include "completion_usage_prompt_tokens_details.h"



typedef struct completion_usage_t {
    int completion_tokens; //numeric
    int prompt_tokens; //numeric
    int total_tokens; //numeric
    struct completion_usage_completion_tokens_details_t *completion_tokens_details; //model
    struct completion_usage_prompt_tokens_details_t *prompt_tokens_details; //model

    int _library_owned; // Is the library responsible for freeing this object?
} completion_usage_t;

__attribute__((deprecated)) completion_usage_t *completion_usage_create(
    int completion_tokens,
    int prompt_tokens,
    int total_tokens,
    completion_usage_completion_tokens_details_t *completion_tokens_details,
    completion_usage_prompt_tokens_details_t *prompt_tokens_details
);

void completion_usage_free(completion_usage_t *completion_usage);

completion_usage_t *completion_usage_parseFromJSON(cJSON *completion_usageJSON);

cJSON *completion_usage_convertToJSON(completion_usage_t *completion_usage);

#endif /* _completion_usage_H_ */

