/*
 * run_object_required_action_submit_tool_outputs.h
 *
 * Details on the tool outputs needed for this run to continue.
 */

#ifndef _run_object_required_action_submit_tool_outputs_H_
#define _run_object_required_action_submit_tool_outputs_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_object_required_action_submit_tool_outputs_t run_object_required_action_submit_tool_outputs_t;

#include "run_tool_call_object.h"



typedef struct run_object_required_action_submit_tool_outputs_t {
    list_t *tool_calls; //nonprimitive container

} run_object_required_action_submit_tool_outputs_t;

run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs_create(
    list_t *tool_calls
);

void run_object_required_action_submit_tool_outputs_free(run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs);

run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs_parseFromJSON(cJSON *run_object_required_action_submit_tool_outputsJSON);

cJSON *run_object_required_action_submit_tool_outputs_convertToJSON(run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs);

#endif /* _run_object_required_action_submit_tool_outputs_H_ */

