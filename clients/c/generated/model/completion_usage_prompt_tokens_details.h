/*
 * completion_usage_prompt_tokens_details.h
 *
 * Breakdown of tokens used in the prompt.
 */

#ifndef _completion_usage_prompt_tokens_details_H_
#define _completion_usage_prompt_tokens_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct completion_usage_prompt_tokens_details_t completion_usage_prompt_tokens_details_t;




typedef struct completion_usage_prompt_tokens_details_t {
    int audio_tokens; //numeric
    int cached_tokens; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} completion_usage_prompt_tokens_details_t;

__attribute__((deprecated)) completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details_create(
    int audio_tokens,
    int cached_tokens
);

void completion_usage_prompt_tokens_details_free(completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details);

completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details_parseFromJSON(cJSON *completion_usage_prompt_tokens_detailsJSON);

cJSON *completion_usage_prompt_tokens_details_convertToJSON(completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details);

#endif /* _completion_usage_prompt_tokens_details_H_ */

