/*
 * run_tool_call_object_function.h
 *
 * The function definition.
 */

#ifndef _run_tool_call_object_function_H_
#define _run_tool_call_object_function_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_tool_call_object_function_t run_tool_call_object_function_t;




typedef struct run_tool_call_object_function_t {
    char *name; // string
    char *arguments; // string

} run_tool_call_object_function_t;

run_tool_call_object_function_t *run_tool_call_object_function_create(
    char *name,
    char *arguments
);

void run_tool_call_object_function_free(run_tool_call_object_function_t *run_tool_call_object_function);

run_tool_call_object_function_t *run_tool_call_object_function_parseFromJSON(cJSON *run_tool_call_object_functionJSON);

cJSON *run_tool_call_object_function_convertToJSON(run_tool_call_object_function_t *run_tool_call_object_function);

#endif /* _run_tool_call_object_function_H_ */

