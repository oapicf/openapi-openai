/*
 * run_step_details_tool_calls_object_tool_calls_inner.h
 *
 * 
 */

#ifndef _run_step_details_tool_calls_object_tool_calls_inner_H_
#define _run_step_details_tool_calls_object_tool_calls_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_details_tool_calls_object_tool_calls_inner_t run_step_details_tool_calls_object_tool_calls_inner_t;

#include "object.h"
#include "run_step_details_tool_calls_code_object.h"
#include "run_step_details_tool_calls_code_object_code_interpreter.h"
#include "run_step_details_tool_calls_function_object.h"
#include "run_step_details_tool_calls_function_object_function.h"
#include "run_step_details_tool_calls_retrieval_object.h"

// Enum TYPE for run_step_details_tool_calls_object_tool_calls_inner

typedef enum  { openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_NULL = 0, openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_code_interpreter, openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_retrieval, openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_function } openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_e;

char* run_step_details_tool_calls_object_tool_calls_inner_type_ToString(openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_e type);

openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_e run_step_details_tool_calls_object_tool_calls_inner_type_FromString(char* type);



typedef struct run_step_details_tool_calls_object_tool_calls_inner_t {
    char *id; // string
    openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_e type; //enum
    struct run_step_details_tool_calls_code_object_code_interpreter_t *code_interpreter; //model
    object_t *retrieval; //object
    struct run_step_details_tool_calls_function_object_function_t *function; //model

} run_step_details_tool_calls_object_tool_calls_inner_t;

run_step_details_tool_calls_object_tool_calls_inner_t *run_step_details_tool_calls_object_tool_calls_inner_create(
    char *id,
    openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_e type,
    run_step_details_tool_calls_code_object_code_interpreter_t *code_interpreter,
    object_t *retrieval,
    run_step_details_tool_calls_function_object_function_t *function
);

void run_step_details_tool_calls_object_tool_calls_inner_free(run_step_details_tool_calls_object_tool_calls_inner_t *run_step_details_tool_calls_object_tool_calls_inner);

run_step_details_tool_calls_object_tool_calls_inner_t *run_step_details_tool_calls_object_tool_calls_inner_parseFromJSON(cJSON *run_step_details_tool_calls_object_tool_calls_innerJSON);

cJSON *run_step_details_tool_calls_object_tool_calls_inner_convertToJSON(run_step_details_tool_calls_object_tool_calls_inner_t *run_step_details_tool_calls_object_tool_calls_inner);

#endif /* _run_step_details_tool_calls_object_tool_calls_inner_H_ */
