/*
 * run_object_required_action.h
 *
 * Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
 */

#ifndef _run_object_required_action_H_
#define _run_object_required_action_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_object_required_action_t run_object_required_action_t;

#include "run_object_required_action_submit_tool_outputs.h"

// Enum TYPE for run_object_required_action

typedef enum  { openai_api_run_object_required_action_TYPE_NULL = 0, openai_api_run_object_required_action_TYPE_submit_tool_outputs } openai_api_run_object_required_action_TYPE_e;

char* run_object_required_action_type_ToString(openai_api_run_object_required_action_TYPE_e type);

openai_api_run_object_required_action_TYPE_e run_object_required_action_type_FromString(char* type);



typedef struct run_object_required_action_t {
    openai_api_run_object_required_action_TYPE_e type; //enum
    struct run_object_required_action_submit_tool_outputs_t *submit_tool_outputs; //model

} run_object_required_action_t;

run_object_required_action_t *run_object_required_action_create(
    openai_api_run_object_required_action_TYPE_e type,
    run_object_required_action_submit_tool_outputs_t *submit_tool_outputs
);

void run_object_required_action_free(run_object_required_action_t *run_object_required_action);

run_object_required_action_t *run_object_required_action_parseFromJSON(cJSON *run_object_required_actionJSON);

cJSON *run_object_required_action_convertToJSON(run_object_required_action_t *run_object_required_action);

#endif /* _run_object_required_action_H_ */

