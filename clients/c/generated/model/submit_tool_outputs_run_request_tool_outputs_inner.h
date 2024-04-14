/*
 * submit_tool_outputs_run_request_tool_outputs_inner.h
 *
 * 
 */

#ifndef _submit_tool_outputs_run_request_tool_outputs_inner_H_
#define _submit_tool_outputs_run_request_tool_outputs_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct submit_tool_outputs_run_request_tool_outputs_inner_t submit_tool_outputs_run_request_tool_outputs_inner_t;




typedef struct submit_tool_outputs_run_request_tool_outputs_inner_t {
    char *tool_call_id; // string
    char *output; // string

} submit_tool_outputs_run_request_tool_outputs_inner_t;

submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner_create(
    char *tool_call_id,
    char *output
);

void submit_tool_outputs_run_request_tool_outputs_inner_free(submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner);

submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner_parseFromJSON(cJSON *submit_tool_outputs_run_request_tool_outputs_innerJSON);

cJSON *submit_tool_outputs_run_request_tool_outputs_inner_convertToJSON(submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner);

#endif /* _submit_tool_outputs_run_request_tool_outputs_inner_H_ */

