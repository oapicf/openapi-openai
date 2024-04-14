/*
 * run_step_completion_usage.h
 *
 * Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.
 */

#ifndef _run_step_completion_usage_H_
#define _run_step_completion_usage_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_completion_usage_t run_step_completion_usage_t;




typedef struct run_step_completion_usage_t {
    int completion_tokens; //numeric
    int prompt_tokens; //numeric
    int total_tokens; //numeric

} run_step_completion_usage_t;

run_step_completion_usage_t *run_step_completion_usage_create(
    int completion_tokens,
    int prompt_tokens,
    int total_tokens
);

void run_step_completion_usage_free(run_step_completion_usage_t *run_step_completion_usage);

run_step_completion_usage_t *run_step_completion_usage_parseFromJSON(cJSON *run_step_completion_usageJSON);

cJSON *run_step_completion_usage_convertToJSON(run_step_completion_usage_t *run_step_completion_usage);

#endif /* _run_step_completion_usage_H_ */

