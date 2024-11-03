/*
 * run_step_delta_step_details_tool_calls_object.h
 *
 * Details of the tool call.
 */

#ifndef _run_step_delta_step_details_tool_calls_object_H_
#define _run_step_delta_step_details_tool_calls_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_delta_step_details_tool_calls_object_t run_step_delta_step_details_tool_calls_object_t;

#include "run_step_delta_step_details_tool_calls_object_tool_calls_inner.h"

// Enum TYPE for run_step_delta_step_details_tool_calls_object

typedef enum  { openai_api_run_step_delta_step_details_tool_calls_object_TYPE_NULL = 0, openai_api_run_step_delta_step_details_tool_calls_object_TYPE_tool_calls } openai_api_run_step_delta_step_details_tool_calls_object_TYPE_e;

char* run_step_delta_step_details_tool_calls_object_type_ToString(openai_api_run_step_delta_step_details_tool_calls_object_TYPE_e type);

openai_api_run_step_delta_step_details_tool_calls_object_TYPE_e run_step_delta_step_details_tool_calls_object_type_FromString(char* type);



typedef struct run_step_delta_step_details_tool_calls_object_t {
    openai_api_run_step_delta_step_details_tool_calls_object_TYPE_e type; //enum
    list_t *tool_calls; //nonprimitive container

} run_step_delta_step_details_tool_calls_object_t;

run_step_delta_step_details_tool_calls_object_t *run_step_delta_step_details_tool_calls_object_create(
    openai_api_run_step_delta_step_details_tool_calls_object_TYPE_e type,
    list_t *tool_calls
);

void run_step_delta_step_details_tool_calls_object_free(run_step_delta_step_details_tool_calls_object_t *run_step_delta_step_details_tool_calls_object);

run_step_delta_step_details_tool_calls_object_t *run_step_delta_step_details_tool_calls_object_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_objectJSON);

cJSON *run_step_delta_step_details_tool_calls_object_convertToJSON(run_step_delta_step_details_tool_calls_object_t *run_step_delta_step_details_tool_calls_object);

#endif /* _run_step_delta_step_details_tool_calls_object_H_ */

