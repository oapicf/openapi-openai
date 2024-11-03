/*
 * run_step_details_tool_calls_code_output_logs_object.h
 *
 * Text output from the Code Interpreter tool call as part of a run step.
 */

#ifndef _run_step_details_tool_calls_code_output_logs_object_H_
#define _run_step_details_tool_calls_code_output_logs_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_details_tool_calls_code_output_logs_object_t run_step_details_tool_calls_code_output_logs_object_t;


// Enum TYPE for run_step_details_tool_calls_code_output_logs_object

typedef enum  { openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_NULL = 0, openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_logs } openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_e;

char* run_step_details_tool_calls_code_output_logs_object_type_ToString(openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_e type);

openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_e run_step_details_tool_calls_code_output_logs_object_type_FromString(char* type);



typedef struct run_step_details_tool_calls_code_output_logs_object_t {
    openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_e type; //enum
    char *logs; // string

} run_step_details_tool_calls_code_output_logs_object_t;

run_step_details_tool_calls_code_output_logs_object_t *run_step_details_tool_calls_code_output_logs_object_create(
    openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_e type,
    char *logs
);

void run_step_details_tool_calls_code_output_logs_object_free(run_step_details_tool_calls_code_output_logs_object_t *run_step_details_tool_calls_code_output_logs_object);

run_step_details_tool_calls_code_output_logs_object_t *run_step_details_tool_calls_code_output_logs_object_parseFromJSON(cJSON *run_step_details_tool_calls_code_output_logs_objectJSON);

cJSON *run_step_details_tool_calls_code_output_logs_object_convertToJSON(run_step_details_tool_calls_code_output_logs_object_t *run_step_details_tool_calls_code_output_logs_object);

#endif /* _run_step_details_tool_calls_code_output_logs_object_H_ */

