/*
 * run_object_incomplete_details.h
 *
 * Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
 */

#ifndef _run_object_incomplete_details_H_
#define _run_object_incomplete_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_object_incomplete_details_t run_object_incomplete_details_t;


// Enum REASON for run_object_incomplete_details

typedef enum  { openai_api_run_object_incomplete_details_REASON_NULL = 0, openai_api_run_object_incomplete_details_REASON_max_completion_tokens, openai_api_run_object_incomplete_details_REASON_max_prompt_tokens } openai_api_run_object_incomplete_details_REASON_e;

char* run_object_incomplete_details_reason_ToString(openai_api_run_object_incomplete_details_REASON_e reason);

openai_api_run_object_incomplete_details_REASON_e run_object_incomplete_details_reason_FromString(char* reason);



typedef struct run_object_incomplete_details_t {
    openai_api_run_object_incomplete_details_REASON_e reason; //enum

} run_object_incomplete_details_t;

run_object_incomplete_details_t *run_object_incomplete_details_create(
    openai_api_run_object_incomplete_details_REASON_e reason
);

void run_object_incomplete_details_free(run_object_incomplete_details_t *run_object_incomplete_details);

run_object_incomplete_details_t *run_object_incomplete_details_parseFromJSON(cJSON *run_object_incomplete_detailsJSON);

cJSON *run_object_incomplete_details_convertToJSON(run_object_incomplete_details_t *run_object_incomplete_details);

#endif /* _run_object_incomplete_details_H_ */

