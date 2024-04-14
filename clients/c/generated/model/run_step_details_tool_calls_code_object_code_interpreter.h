/*
 * run_step_details_tool_calls_code_object_code_interpreter.h
 *
 * The Code Interpreter tool call definition.
 */

#ifndef _run_step_details_tool_calls_code_object_code_interpreter_H_
#define _run_step_details_tool_calls_code_object_code_interpreter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_details_tool_calls_code_object_code_interpreter_t run_step_details_tool_calls_code_object_code_interpreter_t;

#include "run_step_details_tool_calls_code_object_code_interpreter_outputs_inner.h"



typedef struct run_step_details_tool_calls_code_object_code_interpreter_t {
    char *input; // string
    list_t *outputs; //nonprimitive container

} run_step_details_tool_calls_code_object_code_interpreter_t;

run_step_details_tool_calls_code_object_code_interpreter_t *run_step_details_tool_calls_code_object_code_interpreter_create(
    char *input,
    list_t *outputs
);

void run_step_details_tool_calls_code_object_code_interpreter_free(run_step_details_tool_calls_code_object_code_interpreter_t *run_step_details_tool_calls_code_object_code_interpreter);

run_step_details_tool_calls_code_object_code_interpreter_t *run_step_details_tool_calls_code_object_code_interpreter_parseFromJSON(cJSON *run_step_details_tool_calls_code_object_code_interpreterJSON);

cJSON *run_step_details_tool_calls_code_object_code_interpreter_convertToJSON(run_step_details_tool_calls_code_object_code_interpreter_t *run_step_details_tool_calls_code_object_code_interpreter);

#endif /* _run_step_details_tool_calls_code_object_code_interpreter_H_ */

