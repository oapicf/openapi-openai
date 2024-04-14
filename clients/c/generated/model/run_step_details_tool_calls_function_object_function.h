/*
 * run_step_details_tool_calls_function_object_function.h
 *
 * The definition of the function that was called.
 */

#ifndef _run_step_details_tool_calls_function_object_function_H_
#define _run_step_details_tool_calls_function_object_function_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_details_tool_calls_function_object_function_t run_step_details_tool_calls_function_object_function_t;




typedef struct run_step_details_tool_calls_function_object_function_t {
    char *name; // string
    char *arguments; // string
    char *output; // string

} run_step_details_tool_calls_function_object_function_t;

run_step_details_tool_calls_function_object_function_t *run_step_details_tool_calls_function_object_function_create(
    char *name,
    char *arguments,
    char *output
);

void run_step_details_tool_calls_function_object_function_free(run_step_details_tool_calls_function_object_function_t *run_step_details_tool_calls_function_object_function);

run_step_details_tool_calls_function_object_function_t *run_step_details_tool_calls_function_object_function_parseFromJSON(cJSON *run_step_details_tool_calls_function_object_functionJSON);

cJSON *run_step_details_tool_calls_function_object_function_convertToJSON(run_step_details_tool_calls_function_object_function_t *run_step_details_tool_calls_function_object_function);

#endif /* _run_step_details_tool_calls_function_object_function_H_ */

