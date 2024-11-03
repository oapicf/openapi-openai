/*
 * run_completion_usage.h
 *
 * Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
 */

#ifndef _run_completion_usage_H_
#define _run_completion_usage_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_completion_usage_t run_completion_usage_t;




typedef struct run_completion_usage_t {
    int completion_tokens; //numeric
    int prompt_tokens; //numeric
    int total_tokens; //numeric

} run_completion_usage_t;

run_completion_usage_t *run_completion_usage_create(
    int completion_tokens,
    int prompt_tokens,
    int total_tokens
);

void run_completion_usage_free(run_completion_usage_t *run_completion_usage);

run_completion_usage_t *run_completion_usage_parseFromJSON(cJSON *run_completion_usageJSON);

cJSON *run_completion_usage_convertToJSON(run_completion_usage_t *run_completion_usage);

#endif /* _run_completion_usage_H_ */

